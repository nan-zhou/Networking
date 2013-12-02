/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class Component as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ComponentBean Interface. The CIM class Component is described as follows:
 * 
 * CIM_Component is a generic association used to establish 'part of' relationships between Managed Elements. For example, it could be used to define
 * the components or parts of a System.
 */
public class Component extends Association implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 8099874308217780129L;

	/**
	 * This constructor creates a ComponentBeanImpl Class which implements the ComponentBean Interface, and encapsulates the CIM class Component in a
	 * Java Bean. The CIM class Component is described as follows:
	 * 
	 * CIM_Component is a generic association used to establish 'part of' relationships between Managed Elements. For example, it could be used to
	 * define the components or parts of a System.
	 */
	protected Component() {
	};

	/**
	 * This method create an Association of the type Component between one ManagedElement object and ManagedElement object
	 */
	public static Component link(ManagedElement groupComponent, ManagedElement
			partComponent) {

		return (Component) Association.link(Component.class, groupComponent, partComponent);
	}// link

} // Class Component
