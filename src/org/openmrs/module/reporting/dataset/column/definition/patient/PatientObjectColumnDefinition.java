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
package org.openmrs.module.reporting.dataset.column.definition.patient;

import org.openmrs.module.reporting.dataset.column.definition.person.PersonPropertyColumnDefinition;
import org.openmrs.module.reporting.dataset.column.converter.ColumnConverter;

/**
 * Patient Object Column
 */
public class PatientObjectColumnDefinition extends PatientPropertyColumnDefinition {
	
	public static final long serialVersionUID = 1L;
	
	/**
	 * Default Constructor
	 */
	public PatientObjectColumnDefinition() {
		super();
	}
	
	/**
	 * Constructor to populate name only
	 */
	public PatientObjectColumnDefinition(String name) {
		super(name);
	}
	
	/**
	 * Constructor to populate name and transform
	 */
	public PatientObjectColumnDefinition(String name, ColumnConverter transform) {
		super(name, transform);
	}

	/** 
	 * @see PersonPropertyColumnDefinition#getProperty()
	 */
	@Override
	public String getProperty() {
		return null;
	}
}