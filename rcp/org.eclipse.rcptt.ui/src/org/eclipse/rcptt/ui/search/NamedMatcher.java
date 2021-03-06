/*******************************************************************************
 * Copyright (c) 2009, 2014 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.rcptt.ui.search;

import org.eclipse.core.runtime.SubMonitor;

import org.eclipse.rcptt.core.model.IQ7NamedElement;
import org.eclipse.rcptt.core.model.ModelException;
import org.eclipse.rcptt.core.model.search.Q7SearchCore;
import org.eclipse.rcptt.internal.ui.Q7UIPlugin;

public class NamedMatcher implements Matcher {

	public boolean matches(IQ7NamedElement object, String query,
			SubMonitor monitor) {
		try {
			String name = Q7SearchCore.findNameByDocument(object);
			if (name == null) {
				name = object.getElementName();
			}
			if (name != null && name.toLowerCase().contains(query)) {
				return true;
			}
			if (object.getDescription() != null
					&& object.getDescription().toLowerCase().contains(query)) {
				return true;
			}
			String[] tags = Q7SearchCore.findTagsByDocument(object);
			for (String t : tags) {
				if (t.toLowerCase().contains(query)) {
					return true;
				}
			}
		} catch (ModelException e) {
			Q7UIPlugin.log(e);
		}
		return false;
	}
}
