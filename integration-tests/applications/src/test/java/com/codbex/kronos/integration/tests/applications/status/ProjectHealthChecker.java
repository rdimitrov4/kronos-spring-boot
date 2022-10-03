/*
 * Copyright (c) 2022 codbex or an codbex affiliate company and contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-FileCopyrightText: 2022 codbex or an codbex affiliate company and contributors
 * SPDX-License-Identifier: EPL-2.0
 */
package com.codbex.kronos.integration.tests.applications.status;

import com.codbex.kronos.integration.tests.applications.utils.HanaDataSourceFactory;
import com.codbex.kronos.integration.tests.applications.utils.HttpClientFactory;
import com.codbex.kronos.integration.tests.core.client.http.HttpClient;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ProjectHealthChecker {

  private final List<ProjectHttpCheck> projectApplicationHttpChecks;
  private final List<ProjectSqlCheck> projectApplicationSqlChecks;
  private final DataSource dataSource;

  private final HttpClientFactory httpClientFactory = new HttpClientFactory();
  private final HttpClient httpClient;


  private final static Integer INITIAL_RETRY_INDEX = 0;
  private final static Integer RETRY_COUNT = 50;
  private final static Integer RETRY_INTERVAL = 5000;

  private final static String TABLE_EXISTS_QUERY = "SELECT TABLE_NAME FROM \"SYS\".\"M_TABLES\" WHERE SCHEMA_NAME = ? AND TABLE_NAME = ?";
  private final static String TABLE_HAS_RECORDS_QUERY = "SELECT RECORD_COUNT FROM \"SYS\".\"M_TABLES\" WHERE SCHEMA_NAME = ? AND TABLE_NAME = ?";

  ProjectHealthChecker(List<ProjectHttpCheck> projectApplicationHttpChecks, List<ProjectSqlCheck> projectApplicationSqlChecks) {
    this.projectApplicationHttpChecks = projectApplicationHttpChecks;
    this.projectApplicationSqlChecks = projectApplicationSqlChecks;
    this.httpClient = httpClientFactory.createHttpClient();
    this.dataSource = HanaDataSourceFactory.getDataSource();
  }

  public void performHealthChecks() {
    performHttpHealthChecks();
    System.out.println("HTTP health checks passed.");
    performSqlHealthChecks();
    System.out.println("SQL health checks passed.");
  }

  private void performHttpHealthChecks() {
    System.out.println("Starting to perform HTTP health checks.");

    projectApplicationHttpChecks.forEach(httpCheck -> {
      String endpointToCall = httpCheck.getEndpointToCall();
      Integer expectedStatusCode = httpCheck.getExpectedStatusCode();
      String expectedBodyMessage = httpCheck.getExpectedBodyMessage();

      System.out.println("Performing HTTP health check to endpoint: " + endpointToCall);

      try {
        URL requestUrl = new URL(httpClient.getBaseHost() + endpointToCall);
        HttpUriRequest httpUriRequest = RequestBuilder.get(requestUrl.toURI()).build();

        makeRequestWithRetry(httpClient, httpUriRequest, expectedStatusCode, expectedBodyMessage, INITIAL_RETRY_INDEX);

      } catch (InterruptedException | URISyntaxException | IOException | ExecutionException e) {
        String errorMessage = "HTTP health check for endpoint " + endpointToCall + " failed! " + e.getMessage();
        throw new ProjectHealthCheckException(errorMessage, e);
      }
    });
  }

  private void makeRequestWithRetry(HttpClient httpAsyncClient, HttpUriRequest httpUriRequest, Integer expectedStatusCode,
      String expectedBodyMessage, Integer currentRetryIndex) throws InterruptedException, IOException, ExecutionException {
    checkRetryCount(currentRetryIndex);
    HttpResponse httpResponse = httpAsyncClient.executeRequestAsync(httpUriRequest).get();
    HttpEntity httpEntity = httpResponse.getEntity();
    String responseBodyMessage = IOUtils.toString(httpEntity.getContent(), StandardCharsets.UTF_8);

    if (!expectedStatusCode.equals(httpResponse.getStatusLine().getStatusCode())) {
      waitAndMakeRequest(httpAsyncClient, httpUriRequest, expectedStatusCode, expectedBodyMessage, currentRetryIndex);
    }

    if (expectedBodyMessage != null && !expectedBodyMessage.equals(responseBodyMessage)) {
      waitAndMakeRequest(httpAsyncClient, httpUriRequest, expectedStatusCode, expectedBodyMessage, currentRetryIndex);
    }
  }

  private void waitAndMakeRequest(HttpClient httpAsyncClient, HttpUriRequest httpUriRequest, Integer expectedStatusCode,
      String expectedBodyMessage, Integer currentRetryIndex) throws InterruptedException, IOException, ExecutionException {
    Thread.sleep(RETRY_INTERVAL);
    makeRequestWithRetry(httpAsyncClient, httpUriRequest, expectedStatusCode, expectedBodyMessage, currentRetryIndex + 1);
  }

  private void performSqlHealthChecks() {
    System.out.println("Starting to perform SQL health checks.");

    projectApplicationSqlChecks.forEach(sqlCheck -> {
      String schemaName = sqlCheck.getSchemaName();
      String tableName = sqlCheck.getTableName();

      try (Connection connection = dataSource.getConnection()) {

        if (sqlCheck.tableExistsCheck()) {
          System.out.println("Performing SQL table exists check for: " + "\"" + schemaName + "\".\"" + tableName + "\"");
          checkIfTableExists(connection, schemaName, tableName);
        }

        if (sqlCheck.tableHasRecordsCheck()) {
          System.out.println("Performing SQL table has records check for: " + "\"" + schemaName + "\".\"" + tableName + "\"");
          checkIfTableHasRecords(connection, schemaName, tableName);
        }

      } catch (IOException | SQLException | InterruptedException e) {
        String errorMessage = "SQL health check for table " + tableName + " failed! " + e.getMessage();
        throw new ProjectHealthCheckException(errorMessage, e);
      }
    });
  }

  private void checkIfTableExists(Connection connection, String schemaName, String tableName)
      throws InterruptedException, SQLException, IOException {
    try (PreparedStatement statement = connection.prepareStatement(TABLE_EXISTS_QUERY)) {
      statement.setString(1, schemaName);
      statement.setString(2, tableName);
      executeQueryWithRetryToCheckIfTableExists(statement, INITIAL_RETRY_INDEX);
    }
  }

  private void checkIfTableHasRecords(Connection connection, String schemaName, String tableName)
      throws SQLException, InterruptedException, IOException {
    try (PreparedStatement statement = connection.prepareStatement(TABLE_HAS_RECORDS_QUERY)) {
      statement.setString(1, schemaName);
      statement.setString(2, tableName);
      executeQueryWithRetryToCheckIfTableHasRecords(statement, INITIAL_RETRY_INDEX);
    }
  }

  private void executeQueryWithRetryToCheckIfTableExists(PreparedStatement statement, Integer currentRetryIndex)
      throws InterruptedException, SQLException {
    checkRetryCount(currentRetryIndex);
    try (ResultSet queryResult = statement.executeQuery()) {

      if (!queryResult.next()) {
        Thread.sleep(RETRY_INTERVAL);
        executeQueryWithRetryToCheckIfTableHasRecords(statement, currentRetryIndex + 1);
      }
    }
  }

  private void executeQueryWithRetryToCheckIfTableHasRecords(PreparedStatement statement, Integer currentRetryIndex)
      throws InterruptedException, SQLException {
    checkRetryCount(currentRetryIndex);
    try (ResultSet queryResult = statement.executeQuery()) {

      if (!queryResult.next() || queryResult.getInt("RECORD_COUNT") == 0) {
        Thread.sleep(RETRY_INTERVAL);
        executeQueryWithRetryToCheckIfTableHasRecords(statement, currentRetryIndex + 1);
      }
    }
  }

  private void checkRetryCount(Integer currentRetryIndex) {
    if (currentRetryIndex > RETRY_COUNT) {
      throw new IllegalStateException("Retry limit reached!");
    }
  }
}