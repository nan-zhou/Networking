/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ReflectorService as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ReflectorServiceBean Interface. The CIM class ReflectorService is described as
 * follows:
 * 
 * This association will serve as the base class for defining and distributing BGP routing information for the reflector of this Cluster.
 */
public class ReflectorService extends Dependency implements Serializable {

	/**
	 * This constructor creates a ReflectorServiceBeanImpl Class which implements the ReflectorServiceBean Interface, and encapsulates the CIM class
	 * ReflectorService in a Java Bean. The CIM class ReflectorService is described as follows:
	 * 
	 * This association will serve as the base class for defining and distributing BGP routing information for the reflector of this Cluster.
	 */
	public ReflectorService() {
	};

	/**
	 * This method create an Association of the type ReflectorService between one BGPCluster object and BGPService object
	 */
	public static ReflectorService link(BGPCluster antecedent, BGPService
			dependent) {

		return (ReflectorService) Association.link(ReflectorService.class, antecedent, dependent);
	}// link

} // Class ReflectorService
