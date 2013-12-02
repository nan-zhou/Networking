/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Mon Apr 18
 * 09:34:15 CEST 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class PortOnDevice as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the PortOnDeviceBean Interface. The CIM class PortOnDevice is described as follows:
 * 
 * PortOnDevice associates a Port or connection point with its Device.
 */
public class PortOnDevice extends HostedDependency implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -1797949005308296111L;

	/**
	 * This constructor creates a PortOnDeviceBeanImpl Class which implements the PortOnDeviceBean Interface, and encapsulates the CIM class
	 * PortOnDevice in a Java Bean. The CIM class PortOnDevice is described as follows:
	 * 
	 * PortOnDevice associates a Port or connection point with its Device.
	 */
	public PortOnDevice() {
	};

	/**
	 * This method create an Association of the type PortOnDevice between one LogicalDevice object and LogicalPort object
	 */
	public static PortOnDevice link(LogicalDevice antecedent, LogicalPort
			dependent) {

		return (PortOnDevice) Association.link(PortOnDevice.class, antecedent, dependent);
	}// link

} // Class PortOnDevice