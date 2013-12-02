/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class BGPRoutingPolicy as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the BGPRoutingPolicyBean Interface. The CIM class BGPRoutingPolicy is described as
 * follows:
 * 
 * This is a specialization of the Dependency association, and defines the relationship between a BGPService and the RoutingPolicy that control it.
 */
public class BGPRoutingPolicy extends Dependency implements Serializable {

	/**
	 * This constructor creates a BGPRoutingPolicyBeanImpl Class which implements the BGPRoutingPolicyBean Interface, and encapsulates the CIM class
	 * BGPRoutingPolicy in a Java Bean. The CIM class BGPRoutingPolicy is described as follows:
	 * 
	 * This is a specialization of the Dependency association, and defines the relationship between a BGPService and the RoutingPolicy that control
	 * it.
	 */
	public BGPRoutingPolicy() {
	};

	/**
	 * This method create an Association of the type BGPRoutingPolicy between one RoutingPolicy object and BGPService object
	 */
	public static BGPRoutingPolicy link(RoutingPolicy antecedent, BGPService
			dependent) {

		return (BGPRoutingPolicy) Association.link(BGPRoutingPolicy.class, antecedent, dependent);
	}// link

} // Class BGPRoutingPolicy
