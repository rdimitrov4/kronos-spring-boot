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


package com.codbex.kronos.parser.hdbcalculationview.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A featured hierarchy reference is a reference to a shared hierarchy including additional features on the cube level
 * like hierarchy join properties.	The hierarchyName is the pointer to the shared hierarchy.
 *
 *
 * Java class for FeaturedHierarchyReference complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FeaturedHierarchyReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="joinProperties" type="{http://www.sap.com/ndb/BaseModelBase.ecore}HierarchyJoinProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hierarchyName" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturedHierarchyReference", propOrder = {
    "joinProperties"
})
public class FeaturedHierarchyReference {

  /** The join properties. */
  protected HierarchyJoinProperties joinProperties;
  
  /** The hierarchy name. */
  @XmlAttribute(name = "hierarchyName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String hierarchyName;

  /**
   * Gets the value of the joinProperties property.
   *
   * @return possible object is
   * {@link HierarchyJoinProperties }
   */
  public HierarchyJoinProperties getJoinProperties() {
    return joinProperties;
  }

  /**
   * Sets the value of the joinProperties property.
   *
   * @param value allowed object is
   *              {@link HierarchyJoinProperties }
   */
  public void setJoinProperties(HierarchyJoinProperties value) {
    this.joinProperties = value;
  }

  /**
   * Gets the value of the hierarchyName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getHierarchyName() {
    return hierarchyName;
  }

  /**
   * Sets the value of the hierarchyName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setHierarchyName(String value) {
    this.hierarchyName = value;
  }

}
