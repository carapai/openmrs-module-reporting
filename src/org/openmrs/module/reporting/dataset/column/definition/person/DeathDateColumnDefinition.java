/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.dataset.column.definition.person;

import org.openmrs.module.reporting.dataset.column.definition.PropertyColumnDefinition;
import org.openmrs.module.reporting.dataset.column.converter.ColumnConverter;

/**
 * Death Date Column
 */
public class DeathDateColumnDefinition extends PersonPropertyColumnDefinition {
	
	public static final long serialVersionUID = 1L;
	
	/**
	 * Default Constructor
	 */
	public DeathDateColumnDefinition() {
		super();
	}
	
	/**
	 * Constructor to populate name only
	 */
	public DeathDateColumnDefinition(String name) {
		super(name);
	}
	
	/**
	 * Constructor to populate name and transform
	 */
	public DeathDateColumnDefinition(String name, ColumnConverter transform) {
		super(name, transform);
	}
	
	/** 
	 * @see PropertyColumnDefinition#getProperty()
	 */
	@Override
	public String getProperty() {
		return "deathDate";
	}
}