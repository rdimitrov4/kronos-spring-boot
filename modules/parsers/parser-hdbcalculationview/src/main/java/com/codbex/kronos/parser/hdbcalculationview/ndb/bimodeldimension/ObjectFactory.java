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


package com.codbex.kronos.parser.hdbcalculationview.ndb.bimodeldimension;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.sap.ndb.bimodeldimension package.
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
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.ndb.bimodeldimension
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Dimension }.
   *
   * @return the dimension
   */
  public Dimension createDimension() {
    return new Dimension();
  }

  /**
   * Create an instance of {@link LocalDimension }.
   *
   * @return the local dimension
   */
  public LocalDimension createLocalDimension() {
    return new LocalDimension();
  }

  /**
   * Create an instance of {@link DerivedDimension }.
   *
   * @return the derived dimension
   */
  public DerivedDimension createDerivedDimension() {
    return new DerivedDimension();
  }

  /**
   * Create an instance of {@link Hierarchies }.
   *
   * @return the hierarchies
   */
  public Hierarchies createHierarchies() {
    return new Hierarchies();
  }

  /**
   * Create an instance of {@link ParentChildHierarchy }.
   *
   * @return the parent child hierarchy
   */
  public ParentChildHierarchy createParentChildHierarchy() {
    return new ParentChildHierarchy();
  }

  /**
   * Create an instance of {@link SiblingOrder }.
   *
   * @return the sibling order
   */
  public SiblingOrder createSiblingOrder() {
    return new SiblingOrder();
  }

  /**
   * Create an instance of {@link AttributeParentPair }.
   *
   * @return the attribute parent pair
   */
  public AttributeParentPair createAttributeParentPair() {
    return new AttributeParentPair();
  }

  /**
   * Create an instance of {@link HierarchyTimeProperties }.
   *
   * @return the hierarchy time properties
   */
  public HierarchyTimeProperties createHierarchyTimeProperties() {
    return new HierarchyTimeProperties();
  }

  /**
   * Create an instance of {@link EdgeAttribute }.
   *
   * @return the edge attribute
   */
  public EdgeAttribute createEdgeAttribute() {
    return new EdgeAttribute();
  }

  /**
   * Create an instance of {@link ExternalHierarchy }.
   *
   * @return the external hierarchy
   */
  public ExternalHierarchy createExternalHierarchy() {
    return new ExternalHierarchy();
  }

  /**
   * Create an instance of {@link LeveledHierarchy }.
   *
   * @return the leveled hierarchy
   */
  public LeveledHierarchy createLeveledHierarchy() {
    return new LeveledHierarchy();
  }

  /**
   * Create an instance of {@link Levels }.
   *
   * @return the levels
   */
  public Levels createLevels() {
    return new Levels();
  }

  /**
   * Create an instance of {@link Level }.
   *
   * @return the level
   */
  public Level createLevel() {
    return new Level();
  }

}
