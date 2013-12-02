/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class NetworksInAdminDomain as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the NetworksInAdminDomainBean Interface. The CIM class NetworksInAdminDomain is
 * described as follows:
 * 
 * This association is used to define the set of Logical Networks contained in an AdminDomain. This has the implied semantics that this set of
 * LogicalNetworks are all managed by the same network administrator that manages the domain. Since the LogicalNetwork class is deprecated in lieu of
 * ConnectivityCollection, this association is no longer necessary. It is deprecated to the HostedCollection association, that is inherited by
 * ConnectivityCollection from its superclass, SystemSpecificCollection.
 */
@Deprecated
public class NetworksInAdminDomain extends Association implements Serializable
{

	/**
	 * This constructor creates a NetworksInAdminDomainBeanImpl Class which implements the NetworksInAdminDomainBean Interface, and encapsulates the
	 * CIM class NetworksInAdminDomain in a Java Bean. The CIM class NetworksInAdminDomain is described as follows:
	 * 
	 * This association is used to define the set of Logical Networks contained in an AdminDomain. This has the implied semantics that this set of
	 * LogicalNetworks are all managed by the same network administrator that manages the domain. Since the LogicalNetwork class is deprecated in lieu
	 * of ConnectivityCollection, this association is no longer necessary. It is deprecated to the HostedCollection association, that is inherited by
	 * ConnectivityCollection from its superclass, SystemSpecificCollection.
	 */
	public NetworksInAdminDomain() {
	};

	/**
	 * This method create an Association of the type NetworksInAdminDomain between one AdminDomain object and LogicalNetwork object
	 */
	@Deprecated
	public static NetworksInAdminDomain link(AdminDomain domain, LogicalNetwork
			network) {

		return (NetworksInAdminDomain) Association.link(NetworksInAdminDomain.class, domain, network);
	}// link

} // Class NetworksInAdminDomain
