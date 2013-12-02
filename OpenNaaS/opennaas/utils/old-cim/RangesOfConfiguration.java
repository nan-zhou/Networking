/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class RangesOfConfiguration as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the RangesOfConfigurationBean Interface. The CIM class RangesOfConfiguration is
 * described as follows:
 * 
 * This association connects address ranges to the OSPF area configuration. When network administrators want to control the advertisements of OSPF
 * routers by filters, they first define the relevant ranges. In order for a router to handle a range, an instance of RangeOfIPAddresses MUST be
 * associated to the router's OSPFAreaConfiguration, using this relationship. The association between the range and area configuration contains a
 * property (EnableAdvertise) defining the handling - to allow or disallow advertismenets in the range.
 */
public class RangesOfConfiguration extends Dependency implements Serializable
{

	/**
	 * This constructor creates a RangesOfConfigurationBeanImpl Class which implements the RangesOfConfigurationBean Interface, and encapsulates the
	 * CIM class RangesOfConfiguration in a Java Bean. The CIM class RangesOfConfiguration is described as follows:
	 * 
	 * This association connects address ranges to the OSPF area configuration. When network administrators want to control the advertisements of OSPF
	 * routers by filters, they first define the relevant ranges. In order for a router to handle a range, an instance of RangeOfIPAddresses MUST be
	 * associated to the router's OSPFAreaConfiguration, using this relationship. The association between the range and area configuration contains a
	 * property (EnableAdvertise) defining the handling - to allow or disallow advertismenets in the range.
	 */
	public RangesOfConfiguration() {
	};

	/**
	 * This method create an Association of the type RangesOfConfiguration between one RangeOfIPAddresses object and OSPFAreaConfiguration object
	 */
	public static RangesOfConfiguration link(RangeOfIPAddresses
			antecedent, OSPFAreaConfiguration dependent) {

		return (RangesOfConfiguration) Association.link(RangesOfConfiguration.class, antecedent, dependent);
	}// link

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property enableAdvertise.
	 */
	private boolean	enableAdvertise;

	/**
	 * This method returns the RangesOfConfiguration.enableAdvertise property value. This property is described as follows:
	 * 
	 * The address range is advertised (TRUE) or not (FALSE), see C.2 in RFC 2328.
	 * 
	 * @return boolean current enableAdvertise property value
	 * @exception Exception
	 */
	public boolean isEnableAdvertise() {

		return this.enableAdvertise;
	} // getEnableAdvertise

	/**
	 * This method sets the RangesOfConfiguration.enableAdvertise property value. This property is described as follows:
	 * 
	 * The address range is advertised (TRUE) or not (FALSE), see C.2 in RFC 2328.
	 * 
	 * @param boolean new enableAdvertise property value
	 * @exception Exception
	 */
	public void setEnableAdvertise(boolean enableAdvertise) {

		this.enableAdvertise = enableAdvertise;
	} // setEnableAdvertise

} // Class RangesOfConfiguration
