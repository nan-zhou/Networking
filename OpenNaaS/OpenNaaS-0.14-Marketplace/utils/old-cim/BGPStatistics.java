/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class BGPStatistics as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the BGPStatisticsBean Interface. The CIM class BGPStatistics is described as follows:
 * 
 * This class contains statistical information for a Service's sessions. It is deprecated since the statistics are defined in the BGP4 MIB at the
 * level of individual peers/ endpoints.
 */
@Deprecated
public class BGPStatistics extends ServiceStatisticalInformation implements
		Serializable {

	/**
	 * This constructor creates a BGPStatisticsBeanImpl Class which implements the BGPStatisticsBean Interface, and encapsulates the CIM class
	 * BGPStatistics in a Java Bean. The CIM class BGPStatistics is described as follows:
	 * 
	 * This class contains statistical information for a Service's sessions. It is deprecated since the statistics are defined in the BGP4 MIB at the
	 * level of individual peers/ endpoints.
	 */
	public BGPStatistics() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property inUpdates.
	 */
	@Deprecated
	private long	inUpdates;

	/**
	 * This method returns the BGPStatistics.inUpdates property value. This property is described as follows:
	 * 
	 * This is the number of BGP UPDATE messages received on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @return long current inUpdates property value
	 * @exception Exception
	 */
	@Deprecated
	public long getInUpdates() {

		return this.inUpdates;
	} // getInUpdates

	/**
	 * This method sets the BGPStatistics.inUpdates property value. This property is described as follows:
	 * 
	 * This is the number of BGP UPDATE messages received on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @param long new inUpdates property value
	 * @exception Exception
	 */
	@Deprecated
	public void setInUpdates(long inUpdates) {

		this.inUpdates = inUpdates;
	} // setInUpdates

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property outUpdates.
	 */
	@Deprecated
	private long	outUpdates;

	/**
	 * This method returns the BGPStatistics.outUpdates property value. This property is described as follows:
	 * 
	 * This is the number of BGP UPDATE messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @return long current outUpdates property value
	 * @exception Exception
	 */
	@Deprecated
	public long getOutUpdates() {

		return this.outUpdates;
	} // getOutUpdates

	/**
	 * This method sets the BGPStatistics.outUpdates property value. This property is described as follows:
	 * 
	 * This is the number of BGP UPDATE messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @param long new outUpdates property value
	 * @exception Exception
	 */
	@Deprecated
	public void setOutUpdates(long outUpdates) {

		this.outUpdates = outUpdates;
	} // setOutUpdates

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property inTotalMessages.
	 */
	@Deprecated
	private long	inTotalMessages;

	/**
	 * This method returns the BGPStatistics.inTotalMessages property value. This property is described as follows:
	 * 
	 * This is the total number of BGP messages received on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @return long current inTotalMessages property value
	 * @exception Exception
	 */
	@Deprecated
	public long getInTotalMessages() {

		return this.inTotalMessages;
	} // getInTotalMessages

	/**
	 * This method sets the BGPStatistics.inTotalMessages property value. This property is described as follows:
	 * 
	 * This is the total number of BGP messages received on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @param long new inTotalMessages property value
	 * @exception Exception
	 */
	@Deprecated
	public void setInTotalMessages(long inTotalMessages) {

		this.inTotalMessages = inTotalMessages;
	} // setInTotalMessages

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property outTotalMessages.
	 */
	@Deprecated
	private long	outTotalMessages;

	/**
	 * This method returns the BGPStatistics.outTotalMessages property value. This property is described as follows:
	 * 
	 * This is the total number of BGP messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @return long current outTotalMessages property value
	 * @exception Exception
	 */
	@Deprecated
	public long getOutTotalMessages() {

		return this.outTotalMessages;
	} // getOutTotalMessages

	/**
	 * This method sets the BGPStatistics.outTotalMessages property value. This property is described as follows:
	 * 
	 * This is the total number of BGP messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * 
	 * @param long new outTotalMessages property value
	 * @exception Exception
	 */
	@Deprecated
	public void setOutTotalMessages(long outTotalMessages) {

		this.outTotalMessages = outTotalMessages;
	} // setOutTotalMessages

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property lastError.
	 */
	@Deprecated
	private short[]	lastError;

	/**
	 * This method returns the BGPStatistics.lastError property value. This property is described as follows:
	 * 
	 * This contains the last error code and error subcode for this router's BGP connection. If no error has occurred, then each integer in the array
	 * is zero.
	 * 
	 * @return short[] current lastError property value
	 * @exception Exception
	 */
	@Deprecated
	public short[] getLastError() {

		return this.lastError;
	} // getLastError

	/**
	 * This method sets the BGPStatistics.lastError property value. This property is described as follows:
	 * 
	 * This contains the last error code and error subcode for this router's BGP connection. If no error has occurred, then each integer in the array
	 * is zero.
	 * 
	 * @param short[] new lastError property value
	 * @exception Exception
	 */
	@Deprecated
	public void setLastError(short[] lastError) {

		this.lastError = lastError;
	} // setLastError

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fsmEstablishedTransitions.
	 */
	@Deprecated
	private long	fsmEstablishedTransitions;

	/**
	 * This method returns the BGPStatistics.fsmEstablishedTransitions property value. This property is described as follows:
	 * 
	 * This contains the total number of times that the BGP Finite State Machine has transitioned into the established state for this router's BGP
	 * connection. This is a 32-bit counter.
	 * 
	 * @return long current fsmEstablishedTransitions property value
	 * @exception Exception
	 */
	@Deprecated
	public long getFsmEstablishedTransitions() {

		return this.fsmEstablishedTransitions;
	} // getFsmEstablishedTransitions

	/**
	 * This method sets the BGPStatistics.fsmEstablishedTransitions property value. This property is described as follows:
	 * 
	 * This contains the total number of times that the BGP Finite State Machine has transitioned into the established state for this router's BGP
	 * connection. This is a 32-bit counter.
	 * 
	 * @param long new fsmEstablishedTransitions property value
	 * @exception Exception
	 */
	@Deprecated
	public void setFsmEstablishedTransitions(long fsmEstablishedTransitions)
	{

		this.fsmEstablishedTransitions = fsmEstablishedTransitions;
	} // setFsmEstablishedTransitions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fsmEstablishedTime.
	 */
	@Deprecated
	private long	fsmEstablishedTime;

	/**
	 * This method returns the BGPStatistics.fsmEstablishedTime property value. This property is described as follows:
	 * 
	 * This indicates how long, in seconds, this peer has been in the established state, or how long since this peer was last in the established
	 * state. It is set to zero when a new peer is configured or when the router is booted. This has the semantics of a 32-bit gauge.
	 * 
	 * @return long current fsmEstablishedTime property value
	 * @exception Exception
	 */
	@Deprecated
	public long getFsmEstablishedTime() {

		return this.fsmEstablishedTime;
	} // getFsmEstablishedTime

	/**
	 * This method sets the BGPStatistics.fsmEstablishedTime property value. This property is described as follows:
	 * 
	 * This indicates how long, in seconds, this peer has been in the established state, or how long since this peer was last in the established
	 * state. It is set to zero when a new peer is configured or when the router is booted. This has the semantics of a 32-bit gauge.
	 * 
	 * @param long new fsmEstablishedTime property value
	 * @exception Exception
	 */
	@Deprecated
	public void setFsmEstablishedTime(long fsmEstablishedTime) {

		this.fsmEstablishedTime = fsmEstablishedTime;
	} // setFsmEstablishedTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property inUpdateElapsedTime.
	 */
	@Deprecated
	private long	inUpdateElapsedTime;

	/**
	 * This method returns the BGPStatistics.inUpdateElapsedTime property value. This property is described as follows:
	 * 
	 * This defines the time in seconds since the last BGP UPDATE message was received from the peer. This has the semantics of a 32-bit gauge.
	 * 
	 * @return long current inUpdateElapsedTime property value
	 * @exception Exception
	 */
	@Deprecated
	public long getInUpdateElapsedTime() {

		return this.inUpdateElapsedTime;
	} // getInUpdateElapsedTime

	/**
	 * This method sets the BGPStatistics.inUpdateElapsedTime property value. This property is described as follows:
	 * 
	 * This defines the time in seconds since the last BGP UPDATE message was received from the peer. This has the semantics of a 32-bit gauge.
	 * 
	 * @param long new inUpdateElapsedTime property value
	 * @exception Exception
	 */
	@Deprecated
	public void setInUpdateElapsedTime(long inUpdateElapsedTime) {

		this.inUpdateElapsedTime = inUpdateElapsedTime;
	} // setInUpdateElapsedTime

} // Class BGPStatistics
