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

import com.codbex.kronos.parser.hdbcalculationview.ndb.repositorymodelresource.IDObject;


/**
 * The Layout contains information how graphical objects are arranged.
 * E.g. the x and y coordinates of tables in a data foundation or logical objects in a cube.
 * This Information is not required when importing models into the new DB from	external sources.
 * If not there the modeler UI will do an auto arrange of the various shapes.
 *
 *
 * Java class for Layout complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Layout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/RepositoryModelResource.ecore}IDObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="size" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}RectangleSize" minOccurs="0"/&gt;
 *         &lt;element name="viewPaneUpperLeftCoordinates" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Coordinates" minOccurs="0"/&gt;
 *         &lt;element name="shapes" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Shapes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zoomFactor" type="{http://www.w3.org/2001/XMLSchema}int" default="100" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layout", propOrder = {
    "size",
    "viewPaneUpperLeftCoordinates",
    "shapes"
})
public class Layout
    extends IDObject {

  /** The size. */
  protected RectangleSize size;
  
  /** The view pane upper left coordinates. */
  protected Coordinates viewPaneUpperLeftCoordinates;
  
  /** The shapes. */
  protected Shapes shapes;
  
  /** The zoom factor. */
  @XmlAttribute(name = "zoomFactor")
  protected Integer zoomFactor;

  /**
   * Gets the value of the size property.
   *
   * @return possible object is
   * {@link RectangleSize }
   */
  public RectangleSize getSize() {
    return size;
  }

  /**
   * Sets the value of the size property.
   *
   * @param value allowed object is
   *              {@link RectangleSize }
   */
  public void setSize(RectangleSize value) {
    this.size = value;
  }

  /**
   * Gets the value of the viewPaneUpperLeftCoordinates property.
   *
   * @return possible object is
   * {@link Coordinates }
   */
  public Coordinates getViewPaneUpperLeftCoordinates() {
    return viewPaneUpperLeftCoordinates;
  }

  /**
   * Sets the value of the viewPaneUpperLeftCoordinates property.
   *
   * @param value allowed object is
   *              {@link Coordinates }
   */
  public void setViewPaneUpperLeftCoordinates(Coordinates value) {
    this.viewPaneUpperLeftCoordinates = value;
  }

  /**
   * Gets the value of the shapes property.
   *
   * @return possible object is
   * {@link Shapes }
   */
  public Shapes getShapes() {
    return shapes;
  }

  /**
   * Sets the value of the shapes property.
   *
   * @param value allowed object is
   *              {@link Shapes }
   */
  public void setShapes(Shapes value) {
    this.shapes = value;
  }

  /**
   * Gets the value of the zoomFactor property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public int getZoomFactor() {
    if (zoomFactor == null) {
      return 100;
    } else {
      return zoomFactor;
    }
  }

  /**
   * Sets the value of the zoomFactor property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setZoomFactor(Integer value) {
    this.zoomFactor = value;
  }

}
