/*******************************************************************************
 * Copyright (c) 2009, 2015 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.rcptt.ecl.platform.commands.impl;



import org.eclipse.emf.ecore.EClass;
import org.eclipse.rcptt.ecl.core.impl.CommandImpl;
import org.eclipse.rcptt.ecl.platform.commands.CommandsPackage;
import org.eclipse.rcptt.ecl.platform.commands.UpdateAll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update All</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UpdateAllImpl extends CommandImpl implements UpdateAll {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.UPDATE_ALL;
	}

} //UpdateAllImpl
