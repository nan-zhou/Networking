/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class DeviceServiceImplementation as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the DeviceServiceImplementationBean Interface. The CIM class
 * DeviceServiceImplementation is described as follows:
 * 
 * An association between a Service and how it is implemented. The cardinality of this association is many-to-many. A Service can be provided by more
 * than one Logical Device, operating in conjunction. And, any Device can provide more than one Service. When multiple Devices are associated with a
 * single Service, it is assumed that these elements operate in conjunction to provide the Service. If different implementations of a Service exist,
 * each of these implementations would result in individual instantiations of the Service object. These individual instantiations would then have
 * associations to the unique implementations.
 */
public class DeviceServiceImplementation extends Dependency implements
		Serializable {

	/**
	 * This constructor creates a DeviceServiceImplementationBeanImpl Class which implements the DeviceServiceImplementationBean Interface, and
	 * encapsulates the CIM class DeviceServiceImplementation in a Java Bean. The CIM class DeviceServiceImplementation is described as follows:
	 * 
	 * An association between a Service and how it is implemented. The cardinality of this association is many-to-many. A Service can be provided by
	 * more than one Logical Device, operating in conjunction. And, any Device can provide more than one Service. When multiple Devices are associated
	 * with a single Service, it is assumed that these elements operate in conjunction to provide the Service. If different implementations of a
	 * Service exist, each of these implementations would result in individual instantiations of the Service object. These individual instantiations
	 * would then have associations to the unique implementations.
	 */
	public DeviceServiceImplementation() {
	};

	/**
	 * This method create an Association of the type DeviceServiceImplementation between one LogicalDevice object and Service object
	 */
	public static DeviceServiceImplementation link(LogicalDevice
			antecedent, Service dependent) {

		return (DeviceServiceImplementation) Association.link(DeviceServiceImplementation.class, antecedent, dependent);
	}// link

} // Class DeviceServiceImplementation
