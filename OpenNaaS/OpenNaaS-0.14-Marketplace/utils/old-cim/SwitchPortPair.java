/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SwitchPortPair as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the SwitchPortPairBean Interface. The CIM class SwitchPortPair is described as follows:
 * 
 * This association represents information regarding port pairings that is used by the SourceRoutingService of a switch.
 */
public class SwitchPortPair extends SAPSAPDependency implements Serializable
{

	/**
	 * This constructor creates a SwitchPortPairBeanImpl Class which implements the SwitchPortPairBean Interface, and encapsulates the CIM class
	 * SwitchPortPair in a Java Bean. The CIM class SwitchPortPair is described as follows:
	 * 
	 * This association represents information regarding port pairings that is used by the SourceRoutingService of a switch.
	 */
	public SwitchPortPair() {
	};

	/**
	 * This method create an Association of the type SwitchPortPair between one SwitchPort object and SwitchPort object
	 */
	public static SwitchPortPair link(SwitchPort antecedent, SwitchPort
			dependent) {

		return (SwitchPortPair) Association.link(SwitchPortPair.class, antecedent, dependent);
	}// link

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property bridgeNum.
	 */
	private int	bridgeNum;

	/**
	 * This method returns the SwitchPortPair.bridgeNum property value. This property is described as follows:
	 * 
	 * A bridge number that uniquely identifies the path provided by this source routing bridge between the segments connected to high and low ports.
	 * The purpose of bridge number is to disambiguate between multiple paths connecting the same two LANs.
	 * 
	 * @return int current bridgeNum property value
	 * @exception Exception
	 */
	public int getBridgeNum() {

		return this.bridgeNum;
	} // getBridgeNum

	/**
	 * This method sets the SwitchPortPair.bridgeNum property value. This property is described as follows:
	 * 
	 * A bridge number that uniquely identifies the path provided by this source routing bridge between the segments connected to high and low ports.
	 * The purpose of bridge number is to disambiguate between multiple paths connecting the same two LANs.
	 * 
	 * @param int new bridgeNum property value
	 * @exception Exception
	 */
	public void setBridgeNum(int bridgeNum) {

		this.bridgeNum = bridgeNum;
	} // setBridgeNum

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property BridgeState.
	 */

	public enum BridgeState {
		ENABLED,
		DISABLED,
		INVALID
	}

	private BridgeState	bridgeState;

	/**
	 * This method returns the SwitchPortPair.bridgeState property value. This property is described as follows:
	 * 
	 * The state of the pairing. Writing 'invalid(3)' to this property removes the association instance.
	 * 
	 * @return int current bridgeState property value
	 * @exception Exception
	 */
	public BridgeState getBridgeState() {

		return this.bridgeState;
	} // getBridgeState

	/**
	 * This method sets the SwitchPortPair.bridgeState property value. This property is described as follows:
	 * 
	 * The state of the pairing. Writing 'invalid(3)' to this property removes the association instance.
	 * 
	 * @param int new bridgeState property value
	 * @exception Exception
	 */
	public void setBridgeState(BridgeState bridgeState) {

		this.bridgeState = bridgeState;
	} // setBridgeState

} // Class SwitchPortPair
