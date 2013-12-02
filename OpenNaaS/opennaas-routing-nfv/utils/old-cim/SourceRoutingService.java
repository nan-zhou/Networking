/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SourceRoutingService as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the SourceRoutingServiceBean Interface. The CIM class SourceRoutingService is
 * described as follows:
 * 
 * SourceRoutingService represents the capability of a switch to participate in the source routing of frames received at its ports. It is a
 * system-level Service that provides and supports local switching only. The SourceRouting Service is aggregated into a higher level SwitchService
 * through the SwitchServiceSourceRouting association.
 */
public class SourceRoutingService extends ForwardingService implements
		Serializable {

	/**
	 * This constructor creates a SourceRoutingServiceBeanImpl Class which implements the SourceRoutingServiceBean Interface, and encapsulates the CIM
	 * class SourceRoutingService in a Java Bean. The CIM class SourceRoutingService is described as follows:
	 * 
	 * SourceRoutingService represents the capability of a switch to participate in the source routing of frames received at its ports. It is a
	 * system-level Service that provides and supports local switching only. The SourceRouting Service is aggregated into a higher level SwitchService
	 * through the SwitchServiceSourceRouting association.
	 */
	public SourceRoutingService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property BridgeLfMode.
	 */

	public enum BridgeLfMode {
		MODE3,
		MODE6
	}

	private BridgeLfMode	bridgeLfMode;

	/**
	 * This method returns the SourceRoutingService.bridgeLfMode property value. This property is described as follows:
	 * 
	 * Indicates whether the bridge operates using older 3 bit length negotiation fields or the newer 6 bit length field in its RIF.
	 * 
	 * @return int current bridgeLfMode property value
	 * @exception Exception
	 */
	public BridgeLfMode getBridgeLfMode() {

		return this.bridgeLfMode;
	} // getBridgeLfMode

	/**
	 * This method sets the SourceRoutingService.bridgeLfMode property value. This property is described as follows:
	 * 
	 * Indicates whether the bridge operates using older 3 bit length negotiation fields or the newer 6 bit length field in its RIF.
	 * 
	 * @param int new bridgeLfMode property value
	 * @exception Exception
	 */
	public void setBridgeLfMode(BridgeLfMode bridgeLfMode) {

		this.bridgeLfMode = bridgeLfMode;
	} // setBridgeLfMode

} // Class SourceRoutingService
