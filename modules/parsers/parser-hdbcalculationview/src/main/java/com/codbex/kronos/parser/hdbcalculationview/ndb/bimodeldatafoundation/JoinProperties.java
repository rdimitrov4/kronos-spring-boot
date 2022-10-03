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


package com.codbex.kronos.parser.hdbcalculationview.ndb.bimodeldatafoundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.codbex.kronos.parser.hdbcalculationview.ndb.basemodelbase.Cardinality;
import com.codbex.kronos.parser.hdbcalculationview.ndb.basemodelbase.JoinType;
import com.codbex.kronos.parser.hdbcalculationview.ndb.basemodelbase.ReferentialDirection;


/**
 * Java class for JoinProperties complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="JoinProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="joinType" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}JoinType" /&gt;
 *       &lt;attribute name="cardinality" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Cardinality" /&gt;
 *       &lt;attribute name="joinOperator" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}JoinOperator" /&gt;
 *       &lt;attribute name="referentialDirection" type="{http://www.sap.com/ndb/BaseModelBase.ecore}ReferentialDirection" /&gt;
 *       &lt;attribute name="optimizeJoinColumns" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinProperties")
public class JoinProperties {

  /** The join type. */
  @XmlAttribute(name = "joinType", required = true)
  protected JoinType joinType;
  
  /** The cardinality. */
  @XmlAttribute(name = "cardinality")
  protected Cardinality cardinality;
  
  /** The join operator. */
  @XmlAttribute(name = "joinOperator")
  protected JoinOperator joinOperator;
  
  /** The referential direction. */
  @XmlAttribute(name = "referentialDirection")
  protected ReferentialDirection referentialDirection;
  
  /** The optimize join columns. */
  @XmlAttribute(name = "optimizeJoinColumns")
  protected Boolean optimizeJoinColumns;

  /**
   * Gets the value of the joinType property.
   *
   * @return possible object is
   * {@link JoinType }
   */
  public JoinType getJoinType() {
    return joinType;
  }

  /**
   * Sets the value of the joinType property.
   *
   * @param value allowed object is
   *              {@link JoinType }
   */
  public void setJoinType(JoinType value) {
    this.joinType = value;
  }

  /**
   * Gets the value of the cardinality property.
   *
   * @return possible object is
   * {@link Cardinality }
   */
  public Cardinality getCardinality() {
    return cardinality;
  }

  /**
   * Sets the value of the cardinality property.
   *
   * @param value allowed object is
   *              {@link Cardinality }
   */
  public void setCardinality(Cardinality value) {
    this.cardinality = value;
  }

  /**
   * Gets the value of the joinOperator property.
   *
   * @return possible object is
   * {@link JoinOperator }
   */
  public JoinOperator getJoinOperator() {
    return joinOperator;
  }

  /**
   * Sets the value of the joinOperator property.
   *
   * @param value allowed object is
   *              {@link JoinOperator }
   */
  public void setJoinOperator(JoinOperator value) {
    this.joinOperator = value;
  }

  /**
   * Gets the value of the referentialDirection property.
   *
   * @return possible object is
   * {@link ReferentialDirection }
   */
  public ReferentialDirection getReferentialDirection() {
    return referentialDirection;
  }

  /**
   * Sets the value of the referentialDirection property.
   *
   * @param value allowed object is
   *              {@link ReferentialDirection }
   */
  public void setReferentialDirection(ReferentialDirection value) {
    this.referentialDirection = value;
  }

  /**
   * Gets the value of the optimizeJoinColumns property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isOptimizeJoinColumns() {
    return optimizeJoinColumns;
  }

  /**
   * Sets the value of the optimizeJoinColumns property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setOptimizeJoinColumns(Boolean value) {
    this.optimizeJoinColumns = value;
  }

}
