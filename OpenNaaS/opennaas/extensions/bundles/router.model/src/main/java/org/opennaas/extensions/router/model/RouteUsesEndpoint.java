/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class RouteUsesEndpoint as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the RouteUsesEndpointBean Interface. The CIM class RouteUsesEndpoint is described as
 * follows:
 * 
 * RouteUsesEndpoint depicts the relationship between a next hop route and the local Endpoint that is used to transmit the traffic to the 'next hop'.
 */
public class RouteUsesEndpoint extends Dependency implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -7590142293729346806L;

	/**
	 * This constructor creates a RouteUsesEndpointBeanImpl Class which implements the RouteUsesEndpointBean Interface, and encapsulates the CIM class
	 * RouteUsesEndpoint in a Java Bean. The CIM class RouteUsesEndpoint is described as follows:
	 * 
	 * RouteUsesEndpoint depicts the relationship between a next hop route and the local Endpoint that is used to transmit the traffic to the 'next
	 * hop'.
	 */
	public RouteUsesEndpoint() {
	};

	/**
	 * This method create an Association of the type RouteUsesEndpoint between one ProtocolEndpoint object and NextHopRoute object
	 */
	public static RouteUsesEndpoint link(ProtocolEndpoint
			antecedent, NextHopRoute dependent) {

		return (RouteUsesEndpoint) Association.link(RouteUsesEndpoint.class, antecedent, dependent);
	}// link

} // Class RouteUsesEndpoint
