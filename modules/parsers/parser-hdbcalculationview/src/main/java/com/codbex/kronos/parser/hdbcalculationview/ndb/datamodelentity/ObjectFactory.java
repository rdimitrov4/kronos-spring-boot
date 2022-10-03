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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.codbex.kronos.parser.hdbcalculationview.ndb.datamodelentity;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.sap.ndb.datamodelentity package.
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.ndb.datamodelentity
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Entity }.
   *
   * @return the entity
   */
  public Entity createEntity() {
    return new Entity();
  }

  /**
   * Create an instance of {@link Index }.
   *
   * @return the index
   */
  public Index createIndex() {
    return new Index();
  }

  /**
   * Create an instance of {@link RoundRobinPartitionSpecification }.
   *
   * @return the round robin partition specification
   */
  public RoundRobinPartitionSpecification createRoundRobinPartitionSpecification() {
    return new RoundRobinPartitionSpecification();
  }

  /**
   * Create an instance of {@link HashPartitionSpecification }.
   *
   * @return the hash partition specification
   */
  public HashPartitionSpecification createHashPartitionSpecification() {
    return new HashPartitionSpecification();
  }

  /**
   * Create an instance of {@link PartitionExpression }.
   *
   * @return the partition expression
   */
  public PartitionExpression createPartitionExpression() {
    return new PartitionExpression();
  }

  /**
   * Create an instance of {@link RangePartitionSpecification }.
   *
   * @return the range partition specification
   */
  public RangePartitionSpecification createRangePartitionSpecification() {
    return new RangePartitionSpecification();
  }

  /**
   * Create an instance of {@link TableGroup }.
   *
   * @return the table group
   */
  public TableGroup createTableGroup() {
    return new TableGroup();
  }

}
