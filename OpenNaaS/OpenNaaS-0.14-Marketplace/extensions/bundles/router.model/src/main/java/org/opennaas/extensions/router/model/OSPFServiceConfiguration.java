/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class OSPFServiceConfiguration as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the OSPFServiceConfigurationBean Interface. The CIM class
 * OSPFServiceConfiguration is described as follows:
 * 
 * OSPFServiceConfiguration connects an OSPF service to its area configurations. The configurations are defined for the OSPF Service, and so do not
 * make sense as stand alone objects. This is the reason for the Min (1), Max (1) cardinalities on OSPFService. They mandate the instantiation of the
 * service and of this association for the referenced instance of OSPFAreaConfiguration. The area configuration acts as a focal point to bring
 * together the router (indicated as a ComputerSystem with an instance of OSPFService, associated to the AreaConfiguration using this relationship),
 * the area (indicated as an OSPFArea, associated to the AreaConfiguration using AreaOfConfiguration) and the address ranges for advertising
 * (indicated as instances of RangeOfIPAddresses, associated to the AreaConfiguration using RangesOfConfiguration). There would be an instance of
 * OSPFAreaConfiguration for each connected area of a router/OSPFService.
 */
public class OSPFServiceConfiguration extends Dependency implements
		Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -7510582691751824582L;

	/**
	 * This constructor creates a OSPFServiceConfigurationBeanImpl Class which implements the OSPFServiceConfigurationBean Interface, and encapsulates
	 * the CIM class OSPFServiceConfiguration in a Java Bean. The CIM class OSPFServiceConfiguration is described as follows:
	 * 
	 * OSPFServiceConfiguration connects an OSPF service to its area configurations. The configurations are defined for the OSPF Service, and so do
	 * not make sense as stand alone objects. This is the reason for the Min (1), Max (1) cardinalities on OSPFService. They mandate the instantiation
	 * of the service and of this association for the referenced instance of OSPFAreaConfiguration. The area configuration acts as a focal point to
	 * bring together the router (indicated as a ComputerSystem with an instance of OSPFService, associated to the AreaConfiguration using this
	 * relationship), the area (indicated as an OSPFArea, associated to the AreaConfiguration using AreaOfConfiguration) and the address ranges for
	 * advertising (indicated as instances of RangeOfIPAddresses, associated to the AreaConfiguration using RangesOfConfiguration). There would be an
	 * instance of OSPFAreaConfiguration for each connected area of a router/OSPFService.
	 */
	public OSPFServiceConfiguration() {
	};

	/**
	 * This method create an Association of the type OSPFServiceConfiguration between one OSPFService object and OSPFAreaConfiguration object
	 */
	public static OSPFServiceConfiguration link(OSPFService
			antecedent, OSPFAreaConfiguration dependent) {

		return (OSPFServiceConfiguration) Association.link(OSPFServiceConfiguration.class, antecedent, dependent);
	}// link

} // Class OSPFServiceConfiguration
