/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SpanningTreeService as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the SpanningTreeServiceBean Interface. The CIM class SpanningTreeService is
 * described as follows:
 * 
 * This service class represents the capability of a switch to participate in the distributed construction of a spanning tree.
 */
public class SpanningTreeService extends ForwardingService implements
		Serializable {

	/**
	 * This constructor creates a SpanningTreeServiceBeanImpl Class which implements the SpanningTreeServiceBean Interface, and encapsulates the CIM
	 * class SpanningTreeService in a Java Bean. The CIM class SpanningTreeService is described as follows:
	 * 
	 * This service class represents the capability of a switch to participate in the distributed construction of a spanning tree.
	 */
	public SpanningTreeService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property ProtocolSpec.
	 */

	public enum ProtocolSpec {
		UNKNOWN,
		DEC_LB100,
		IEEE_802D
	}

	private ProtocolSpec	protocolSpec;

	/**
	 * This method returns the SpanningTreeService.protocolSpec property value. This property is described as follows:
	 * 
	 * The version of the spanning tree protocol used by the switch.
	 * 
	 * @return int current protocolSpec property value
	 * @exception Exception
	 */
	public ProtocolSpec getProtocolSpec() {

		return this.protocolSpec;
	} // getProtocolSpec

	/**
	 * This method sets the SpanningTreeService.protocolSpec property value. This property is described as follows:
	 * 
	 * The version of the spanning tree protocol used by the switch.
	 * 
	 * @param int new protocolSpec property value
	 * @exception Exception
	 */
	public void setProtocolSpec(ProtocolSpec protocolSpec) {

		this.protocolSpec = protocolSpec;
	} // setProtocolSpec

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property priority.
	 */
	private int	priority;

	/**
	 * This method returns the SpanningTreeService.priority property value. This property is described as follows:
	 * 
	 * The format of the priority bits are the first two octets of the 8-octet long Bridge ID. The other (last) 6 octets of the Bridge ID are given by
	 * the value of the Bridge Address. A priority that can be assigned to the switch for use in constructing the spanning tree. The unique identifier
	 * for a switch is constructed by concatenating the MAC address associated with the switch for spanning tree operations to the two-byte priority.
	 * Choice of the priority value influences election of the root bridge.
	 * 
	 * @return int current priority property value
	 * @exception Exception
	 */
	public int getPriority() {

		return this.priority;
	} // getPriority

	/**
	 * This method sets the SpanningTreeService.priority property value. This property is described as follows:
	 * 
	 * The format of the priority bits are the first two octets of the 8-octet long Bridge ID. The other (last) 6 octets of the Bridge ID are given by
	 * the value of the Bridge Address. A priority that can be assigned to the switch for use in constructing the spanning tree. The unique identifier
	 * for a switch is constructed by concatenating the MAC address associated with the switch for spanning tree operations to the two-byte priority.
	 * Choice of the priority value influences election of the root bridge.
	 * 
	 * @param int new priority property value
	 * @exception Exception
	 */
	public void setPriority(int priority) {

		this.priority = priority;
	} // setPriority

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property spanningTreeBridgeAddress.
	 */
	private String	spanningTreeBridgeAddress;

	/**
	 * This method returns the SpanningTreeService.spanningTreeBridgeAddress property value. This property is described as follows:
	 * 
	 * MAC address used by the spanning tree service when it must be uniquely identified. When concatenated with a SpanningTreeService Priority, a
	 * unique bridge identifier results. This property is defined for use of switches supporting multiple spanning tree services. Note that the MAC
	 * address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address
	 * in "canonical" bit order according to RFC 2469.
	 * 
	 * @return String current spanningTreeBridgeAddress property value
	 * @exception Exception
	 */
	public String getSpanningTreeBridgeAddress() {

		return this.spanningTreeBridgeAddress;
	} // getSpanningTreeBridgeAddress

	/**
	 * This method sets the SpanningTreeService.spanningTreeBridgeAddress property value. This property is described as follows:
	 * 
	 * MAC address used by the spanning tree service when it must be uniquely identified. When concatenated with a SpanningTreeService Priority, a
	 * unique bridge identifier results. This property is defined for use of switches supporting multiple spanning tree services. Note that the MAC
	 * address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address
	 * in "canonical" bit order according to RFC 2469.
	 * 
	 * @param String
	 *            new spanningTreeBridgeAddress property value
	 * @exception Exception
	 */
	public void setSpanningTreeBridgeAddress(String spanningTreeBridgeAddress)
	{

		this.spanningTreeBridgeAddress = spanningTreeBridgeAddress;
	} // setSpanningTreeBridgeAddress

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property designatedRoot.
	 */
	private String	designatedRoot;

	/**
	 * This method returns the SpanningTreeService.designatedRoot property value. This property is described as follows:
	 * 
	 * The complete Bridge ID (Priority + MAC Address) of the root bridge. The format of the priority bits are the first two octets of the 8-octet
	 * long Bridge ID. Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of
	 * the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * 
	 * @return String current designatedRoot property value
	 * @exception Exception
	 */
	public String getDesignatedRoot() {

		return this.designatedRoot;
	} // getDesignatedRoot

	/**
	 * This method sets the SpanningTreeService.designatedRoot property value. This property is described as follows:
	 * 
	 * The complete Bridge ID (Priority + MAC Address) of the root bridge. The format of the priority bits are the first two octets of the 8-octet
	 * long Bridge ID. Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of
	 * the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * 
	 * @param String
	 *            new designatedRoot property value
	 * @exception Exception
	 */
	public void setDesignatedRoot(String designatedRoot) {

		this.designatedRoot = designatedRoot;
	} // setDesignatedRoot

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property rootCost.
	 */
	private int	rootCost;

	/**
	 * This method returns the SpanningTreeService.rootCost property value. This property is described as follows:
	 * 
	 * The cost of the path from the switch to the root.
	 * 
	 * @return int current rootCost property value
	 * @exception Exception
	 */
	public int getRootCost() {

		return this.rootCost;
	} // getRootCost

	/**
	 * This method sets the SpanningTreeService.rootCost property value. This property is described as follows:
	 * 
	 * The cost of the path from the switch to the root.
	 * 
	 * @param int new rootCost property value
	 * @exception Exception
	 */
	public void setRootCost(int rootCost) {

		this.rootCost = rootCost;
	} // setRootCost

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property rootPort.
	 */
	private int	rootPort;

	/**
	 * This method returns the SpanningTreeService.rootPort property value. This property is described as follows:
	 * 
	 * The port number of the port having the lowest cost path to the root bridge.
	 * 
	 * @return int current rootPort property value
	 * @exception Exception
	 */
	public int getRootPort() {

		return this.rootPort;
	} // getRootPort

	/**
	 * This method sets the SpanningTreeService.rootPort property value. This property is described as follows:
	 * 
	 * The port number of the port having the lowest cost path to the root bridge.
	 * 
	 * @param int new rootPort property value
	 * @exception Exception
	 */
	public void setRootPort(int rootPort) {

		this.rootPort = rootPort;
	} // setRootPort

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property maxAge.
	 */
	private long	maxAge;

	/**
	 * This method returns the SpanningTreeService.maxAge property value. This property is described as follows:
	 * 
	 * The current value for the maximum age of Spanning Tree information before discard, as learned from the network.
	 * 
	 * @return long current maxAge property value
	 * @exception Exception
	 */
	public long getMaxAge() {

		return this.maxAge;
	} // getMaxAge

	/**
	 * This method sets the SpanningTreeService.maxAge property value. This property is described as follows:
	 * 
	 * The current value for the maximum age of Spanning Tree information before discard, as learned from the network.
	 * 
	 * @param long new maxAge property value
	 * @exception Exception
	 */
	public void setMaxAge(long maxAge) {

		this.maxAge = maxAge;
	} // setMaxAge

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property helloTime.
	 */
	private long	helloTime;

	/**
	 * This method returns the SpanningTreeService.helloTime property value. This property is described as follows:
	 * 
	 * The current value of the interval between transmission of bridge PDUs by the switch, on any port for which it is the spanning tree root or
	 * trying to become so, as learned from the network.
	 * 
	 * @return long current helloTime property value
	 * @exception Exception
	 */
	public long getHelloTime() {

		return this.helloTime;
	} // getHelloTime

	/**
	 * This method sets the SpanningTreeService.helloTime property value. This property is described as follows:
	 * 
	 * The current value of the interval between transmission of bridge PDUs by the switch, on any port for which it is the spanning tree root or
	 * trying to become so, as learned from the network.
	 * 
	 * @param long new helloTime property value
	 * @exception Exception
	 */
	public void setHelloTime(long helloTime) {

		this.helloTime = helloTime;
	} // setHelloTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property holdTime.
	 */
	private long	holdTime;

	/**
	 * This method returns the SpanningTreeService.holdTime property value. This property is described as follows:
	 * 
	 * The minimum interval between transmission of bridge PDUs through a given port, as learned from the network.
	 * 
	 * @return long current holdTime property value
	 * @exception Exception
	 */
	public long getHoldTime() {

		return this.holdTime;
	} // getHoldTime

	/**
	 * This method sets the SpanningTreeService.holdTime property value. This property is described as follows:
	 * 
	 * The minimum interval between transmission of bridge PDUs through a given port, as learned from the network.
	 * 
	 * @param long new holdTime property value
	 * @exception Exception
	 */
	public void setHoldTime(long holdTime) {

		this.holdTime = holdTime;
	} // setHoldTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property forwardDelay.
	 */
	private long	forwardDelay;

	/**
	 * This method returns the SpanningTreeService.forwardDelay property value. This property is described as follows:
	 * 
	 * The time spent by a port in the listening state before transitioning to the learning state, and in the learning state before transitioning to
	 * the forwarding state, as learned from the network. This value is also used during the period of a topology change as the maximum age of
	 * Spanning Tree information before discard.
	 * 
	 * @return long current forwardDelay property value
	 * @exception Exception
	 */
	public long getForwardDelay() {

		return this.forwardDelay;
	} // getForwardDelay

	/**
	 * This method sets the SpanningTreeService.forwardDelay property value. This property is described as follows:
	 * 
	 * The time spent by a port in the listening state before transitioning to the learning state, and in the learning state before transitioning to
	 * the forwarding state, as learned from the network. This value is also used during the period of a topology change as the maximum age of
	 * Spanning Tree information before discard.
	 * 
	 * @param long new forwardDelay property value
	 * @exception Exception
	 */
	public void setForwardDelay(long forwardDelay) {

		this.forwardDelay = forwardDelay;
	} // setForwardDelay

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property bridgeMaxAge.
	 */
	private long	bridgeMaxAge;

	/**
	 * This method returns the SpanningTreeService.bridgeMaxAge property value. This property is described as follows:
	 * 
	 * The MaxAge parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @return long current bridgeMaxAge property value
	 * @exception Exception
	 */
	public long getBridgeMaxAge() {

		return this.bridgeMaxAge;
	} // getBridgeMaxAge

	/**
	 * This method sets the SpanningTreeService.bridgeMaxAge property value. This property is described as follows:
	 * 
	 * The MaxAge parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @param long new bridgeMaxAge property value
	 * @exception Exception
	 */
	public void setBridgeMaxAge(long bridgeMaxAge) {

		this.bridgeMaxAge = bridgeMaxAge;
	} // setBridgeMaxAge

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property bridgeHelloTime.
	 */
	private long	bridgeHelloTime;

	/**
	 * This method returns the SpanningTreeService.bridgeHelloTime property value. This property is described as follows:
	 * 
	 * The HelloTime parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @return long current bridgeHelloTime property value
	 * @exception Exception
	 */
	public long getBridgeHelloTime() {

		return this.bridgeHelloTime;
	} // getBridgeHelloTime

	/**
	 * This method sets the SpanningTreeService.bridgeHelloTime property value. This property is described as follows:
	 * 
	 * The HelloTime parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @param long new bridgeHelloTime property value
	 * @exception Exception
	 */
	public void setBridgeHelloTime(long bridgeHelloTime) {

		this.bridgeHelloTime = bridgeHelloTime;
	} // setBridgeHelloTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property bridgeForwardDelay.
	 */
	private long	bridgeForwardDelay;

	/**
	 * This method returns the SpanningTreeService.bridgeForwardDelay property value. This property is described as follows:
	 * 
	 * The ForwardDelay parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @return long current bridgeForwardDelay property value
	 * @exception Exception
	 */
	public long getBridgeForwardDelay() {

		return this.bridgeForwardDelay;
	} // getBridgeForwardDelay

	/**
	 * This method sets the SpanningTreeService.bridgeForwardDelay property value. This property is described as follows:
	 * 
	 * The ForwardDelay parameter to be used by all switches in the network if this switch becomes the root.
	 * 
	 * @param long new bridgeForwardDelay property value
	 * @exception Exception
	 */
	public void setBridgeForwardDelay(long bridgeForwardDelay) {

		this.bridgeForwardDelay = bridgeForwardDelay;
	} // setBridgeForwardDelay

} // Class SpanningTreeService
