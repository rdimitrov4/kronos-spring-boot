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
package com.codbex.kronos.hdb.ds.transformer.hdbdd;

/**
 * These types should respond to hanaBuiltInTypes in SymbolTable class
 * See also {@link com.codbex.kronos.parser.hdbdd.symbols.SymbolTable}.
 */
public enum CdsHanaTypeEnum {
  
  /** The nvarchar. */
  NVARCHAR,
  
  /** The alphanumeric. */
  ALPHANUMERIC,
  
  /** The smallint. */
  SMALLINT,
  
  /** The tinyint. */
  TINYINT,
  
  /** The smalldecimal. */
  SMALLDECIMAL,
  
  /** The clob. */
  CLOB,
  
  /** The binary. */
  BINARY,
  
  /** The st point. */
  ST_POINT,
  
  /** The st geometry. */
  ST_GEOMETRY
}
