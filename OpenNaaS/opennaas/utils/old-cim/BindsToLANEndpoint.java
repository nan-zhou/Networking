/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class BindsToLANEndpoint as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the BindsToLANEndpointBean Interface. The CIM class BindsToLANEndpoint is described
 * as follows:
 * 
 * This association makes explicit the dependency of a SAP or ProtocolEndpoint on an underlying LANEndpoint, on the same system.
 */
public class BindsToLANEndpoint extends BindsTo implements Serializable {

	/**
	 * This constructor creates a BindsToLANEndpointBeanImpl Class which implements the BindsToLANEndpointBean Interface, and encapsulates the CIM
	 * class BindsToLANEndpoint in a Java Bean. The CIM class BindsToLANEndpoint is described as follows:
	 * 
	 * This association makes explicit the dependency of a SAP or ProtocolEndpoint on an underlying LANEndpoint, on the same system.
	 */
	public BindsToLANEndpoint() {
	};

	/**
	 * This method create an Association of the type BindsToLANEndpoint between one LANEndpoint object and ServiceAccessPoint object
	 */
	public static BindsToLANEndpoint link(LANEndpoint
			antecedent, ServiceAccessPoint dependent) {

		return (BindsToLANEndpoint) Association.link(BindsToLANEndpoint.class, antecedent, dependent);
	}// link

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property FrameType.
	 */

	public enum FrameType {
		UNKNOWN,
		ETHERNET,
		_802_2,
		SNAP,
		RAW802_3
	}

	private FrameType	frameType;

	/**
	 * This method returns the BindsToLANEndpoint.frameType property value. This property is described as follows:
	 * 
	 * This describes the framing method for the upper layer SAP or Endpoint that is bound to the LANEndpoint. Note: "Raw802.3" is only known to be
	 * used with the IPX protocol.
	 * 
	 * @return int current frameType property value
	 * @exception Exception
	 */
	public FrameType getFrameType() {

		return this.frameType;
	} // getFrameType

	/**
	 * This method sets the BindsToLANEndpoint.frameType property value. This property is described as follows:
	 * 
	 * This describes the framing method for the upper layer SAP or Endpoint that is bound to the LANEndpoint. Note: "Raw802.3" is only known to be
	 * used with the IPX protocol.
	 * 
	 * @param int new frameType property value
	 * @exception Exception
	 */
	public void setFrameType(FrameType frameType) {

		this.frameType = frameType;
	} // setFrameType

} // Class BindsToLANEndpoint
