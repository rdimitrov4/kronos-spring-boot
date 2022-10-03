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


package com.codbex.kronos.parser.hdbcalculationview.ndb.bimodelvariable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for mapping the variable of an underlying model (target) to either a constant
 * or a variable of the current model via IVariableEnabled. In case the target view is a value help view the
 * target variable name might also point to an attribute of the view.
 *
 *
 * Java class for AbstractVariableMapping complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AbstractVariableMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetVariable" type="{http://www.sap.com/ndb/BiModelVariable.ecore}TargetVariable"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dataSource" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *       &lt;attribute name="forStarJoin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractVariableMapping", propOrder = {
    "targetVariable"
})
@XmlSeeAlso({
    VariableMapping.class,
    ConstantVariableMapping.class
})
public abstract class AbstractVariableMapping {

  /** The target variable. */
  @XmlElement(required = true)
  protected TargetVariable targetVariable;
  
  /** The data source. */
  @XmlAttribute(name = "dataSource")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String dataSource;
  
  /** The for star join. */
  @XmlAttribute(name = "forStarJoin")
  protected Boolean forStarJoin;

  /**
   * Gets the value of the targetVariable property.
   *
   * @return possible object is
   * {@link TargetVariable }
   */
  public TargetVariable getTargetVariable() {
    return targetVariable;
  }

  /**
   * Sets the value of the targetVariable property.
   *
   * @param value allowed object is
   *              {@link TargetVariable }
   */
  public void setTargetVariable(TargetVariable value) {
    this.targetVariable = value;
  }

  /**
   * Gets the value of the dataSource property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDataSource() {
    return dataSource;
  }

  /**
   * Sets the value of the dataSource property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDataSource(String value) {
    this.dataSource = value;
  }

  /**
   * Gets the value of the forStarJoin property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isForStarJoin() {
    return forStarJoin;
  }

  /**
   * Sets the value of the forStarJoin property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setForStarJoin(Boolean value) {
    this.forStarJoin = value;
  }

}
