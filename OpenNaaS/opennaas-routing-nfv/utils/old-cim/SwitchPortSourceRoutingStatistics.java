/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SwitchPortSourceRoutingStatistics as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the SwitchPortSourceRoutingStatisticsBean Interface. The CIM class
 * SwitchPortSourceRoutingStatistics is described as follows:
 * 
 * Statistical information regarding a SwitchPort supporting source routing.
 */
public class SwitchPortSourceRoutingStatistics extends
		SAPStatisticalInformation implements Serializable {

	/**
	 * This constructor creates a SwitchPortSourceRoutingStatisticsBeanImpl Class which implements the SwitchPortSourceRoutingStatisticsBean
	 * Interface, and encapsulates the CIM class SwitchPortSourceRoutingStatistics in a Java Bean. The CIM class SwitchPortSourceRoutingStatistics is
	 * described as follows:
	 * 
	 * Statistical information regarding a SwitchPort supporting source routing.
	 */
	public SwitchPortSourceRoutingStatistics() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property specInFrames.
	 */
	private long	specInFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.specInFrames property value. This property is described as follows:
	 * 
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that have been received from the segment attached to the
	 * port.
	 * 
	 * @return long current specInFrames property value
	 * @exception Exception
	 */
	public long getSpecInFrames() {

		return this.specInFrames;
	} // getSpecInFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.specInFrames property value. This property is described as follows:
	 * 
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that have been received from the segment attached to the
	 * port.
	 * 
	 * @param long new specInFrames property value
	 * @exception Exception
	 */
	public void setSpecInFrames(long specInFrames) {

		this.specInFrames = specInFrames;
	} // setSpecInFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property specOutFrames.
	 */
	private long	specOutFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.specOutFrames property value. This property is described as follows:
	 * 
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that the port has transmitted on its segment.
	 * 
	 * @return long current specOutFrames property value
	 * @exception Exception
	 */
	public long getSpecOutFrames() {

		return this.specOutFrames;
	} // getSpecOutFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.specOutFrames property value. This property is described as follows:
	 * 
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that the port has transmitted on its segment.
	 * 
	 * @param long new specOutFrames property value
	 * @exception Exception
	 */
	public void setSpecOutFrames(long specOutFrames) {

		this.specOutFrames = specOutFrames;
	} // setSpecOutFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property apeInFrames.
	 */
	private long	apeInFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.apeInFrames property value. This property is described as follows:
	 * 
	 * The number of All Paths Explorer frames, also referred to as All Routes Explorer frames, that have been received by the port from its segment.
	 * 
	 * @return long current apeInFrames property value
	 * @exception Exception
	 */
	public long getApeInFrames() {

		return this.apeInFrames;
	} // getApeInFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.apeInFrames property value. This property is described as follows:
	 * 
	 * The number of All Paths Explorer frames, also referred to as All Routes Explorer frames, that have been received by the port from its segment.
	 * 
	 * @param long new apeInFrames property value
	 * @exception Exception
	 */
	public void setApeInFrames(long apeInFrames) {

		this.apeInFrames = apeInFrames;
	} // setApeInFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property apeOutFrames.
	 */
	private long	apeOutFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.apeOutFrames property value. This property is described as follows:
	 * 
	 * The number of all Paths Explorer Frames, also referred to as All Routes Explorer frames, that have been transmitted by the port on its segment.
	 * 
	 * @return long current apeOutFrames property value
	 * @exception Exception
	 */
	public long getApeOutFrames() {

		return this.apeOutFrames;
	} // getApeOutFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.apeOutFrames property value. This property is described as follows:
	 * 
	 * The number of all Paths Explorer Frames, also referred to as All Routes Explorer frames, that have been transmitted by the port on its segment.
	 * 
	 * @param long new apeOutFrames property value
	 * @exception Exception
	 */
	public void setApeOutFrames(long apeOutFrames) {

		this.apeOutFrames = apeOutFrames;
	} // setApeOutFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property steInFrames.
	 */
	private long	steInFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.steInFrames property value. This property is described as follows:
	 * 
	 * The number of spanning tree explorer frames that have been received by the port from its segment.
	 * 
	 * @return long current steInFrames property value
	 * @exception Exception
	 */
	public long getSteInFrames() {

		return this.steInFrames;
	} // getSteInFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.steInFrames property value. This property is described as follows:
	 * 
	 * The number of spanning tree explorer frames that have been received by the port from its segment.
	 * 
	 * @param long new steInFrames property value
	 * @exception Exception
	 */
	public void setSteInFrames(long steInFrames) {

		this.steInFrames = steInFrames;
	} // setSteInFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property steOutFrames.
	 */
	private long	steOutFrames;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.steOutFrames property value. This property is described as follows:
	 * 
	 * The number of spanning tree explorer frames that have been transmitted by the port on its segment.
	 * 
	 * @return long current steOutFrames property value
	 * @exception Exception
	 */
	public long getSteOutFrames() {

		return this.steOutFrames;
	} // getSteOutFrames

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.steOutFrames property value. This property is described as follows:
	 * 
	 * The number of spanning tree explorer frames that have been transmitted by the port on its segment.
	 * 
	 * @param long new steOutFrames property value
	 * @exception Exception
	 */
	public void setSteOutFrames(long steOutFrames) {

		this.steOutFrames = steOutFrames;
	} // setSteOutFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property segmentMismatchDiscards.
	 */
	private long	segmentMismatchDiscards;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.segmentMismatchDiscards property value. This property is described as follows:
	 * 
	 * The number of explorer frames that have been discarded by the port because the routing descriptor field contained an invalid adjacent segment
	 * value.
	 * 
	 * @return long current segmentMismatchDiscards property value
	 * @exception Exception
	 */
	public long getSegmentMismatchDiscards() {

		return this.segmentMismatchDiscards;
	} // getSegmentMismatchDiscards

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.segmentMismatchDiscards property value. This property is described as follows:
	 * 
	 * The number of explorer frames that have been discarded by the port because the routing descriptor field contained an invalid adjacent segment
	 * value.
	 * 
	 * @param long new segmentMismatchDiscards property value
	 * @exception Exception
	 */
	public void setSegmentMismatchDiscards(long segmentMismatchDiscards) {

		this.segmentMismatchDiscards = segmentMismatchDiscards;
	} // setSegmentMismatchDiscards

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property duplicateSegmentDiscards.
	 */
	private long	duplicateSegmentDiscards;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.duplicateSegmentDiscards property value. This property is described as follows:
	 * 
	 * The number of frames that have been discarded by the port because the routing descriptor field contained a duplicate segment identifier.
	 * 
	 * @return long current duplicateSegmentDiscards property value
	 * @exception Exception
	 */
	public long getDuplicateSegmentDiscards() {

		return this.duplicateSegmentDiscards;
	} // getDuplicateSegmentDiscards

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.duplicateSegmentDiscards property value. This property is described as follows:
	 * 
	 * The number of frames that have been discarded by the port because the routing descriptor field contained a duplicate segment identifier.
	 * 
	 * @param long new duplicateSegmentDiscards property value
	 * @exception Exception
	 */
	public void setDuplicateSegmentDiscards(long duplicateSegmentDiscards) {

		this.duplicateSegmentDiscards = duplicateSegmentDiscards;
	} // setDuplicateSegmentDiscards

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property hopCountExceedsDiscards.
	 */
	private long	hopCountExceedsDiscards;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.hopCountExceedsDiscards property value. This property is described as follows:
	 * 
	 * The number of explorer frames that have been discarded by the port because the Routing Information Field has exceeded the maximum route
	 * descriptor length.
	 * 
	 * @return long current hopCountExceedsDiscards property value
	 * @exception Exception
	 */
	public long getHopCountExceedsDiscards() {

		return this.hopCountExceedsDiscards;
	} // getHopCountExceedsDiscards

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.hopCountExceedsDiscards property value. This property is described as follows:
	 * 
	 * The number of explorer frames that have been discarded by the port because the Routing Information Field has exceeded the maximum route
	 * descriptor length.
	 * 
	 * @param long new hopCountExceedsDiscards property value
	 * @exception Exception
	 */
	public void setHopCountExceedsDiscards(long hopCountExceedsDiscards) {

		this.hopCountExceedsDiscards = hopCountExceedsDiscards;
	} // setHopCountExceedsDiscards

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property dupLanIdOrTreeErrors.
	 */
	private long	dupLanIdOrTreeErrors;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.dupLanIdOrTreeErrors property value. This property is described as follows:
	 * 
	 * The number of duplicate LAN IDs or Tree errors. This helps in detection of problems in networks containing older Source Routing Bridges.
	 * 
	 * @return long current dupLanIdOrTreeErrors property value
	 * @exception Exception
	 */
	public long getDupLanIdOrTreeErrors() {

		return this.dupLanIdOrTreeErrors;
	} // getDupLanIdOrTreeErrors

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.dupLanIdOrTreeErrors property value. This property is described as follows:
	 * 
	 * The number of duplicate LAN IDs or Tree errors. This helps in detection of problems in networks containing older Source Routing Bridges.
	 * 
	 * @param long new dupLanIdOrTreeErrors property value
	 * @exception Exception
	 */
	public void setDupLanIdOrTreeErrors(long dupLanIdOrTreeErrors) {

		this.dupLanIdOrTreeErrors = dupLanIdOrTreeErrors;
	} // setDupLanIdOrTreeErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property lanIdMismatches.
	 */
	private long	lanIdMismatches;

	/**
	 * This method returns the SwitchPortSourceRoutingStatistics.lanIdMismatches property value. This property is described as follows:
	 * 
	 * The number of ARE and STE frames that were discarded because the last LAN ID in the routing information field did not equal the LAN-in ID. This
	 * error can occur in implementations which do only a LAN-in ID and Bridge Number check instead of a LAN-in ID, Bridge Number, and LAN-out ID
	 * check before they forward broadcast frames.
	 * 
	 * @return long current lanIdMismatches property value
	 * @exception Exception
	 */
	public long getLanIdMismatches() {

		return this.lanIdMismatches;
	} // getLanIdMismatches

	/**
	 * This method sets the SwitchPortSourceRoutingStatistics.lanIdMismatches property value. This property is described as follows:
	 * 
	 * The number of ARE and STE frames that were discarded because the last LAN ID in the routing information field did not equal the LAN-in ID. This
	 * error can occur in implementations which do only a LAN-in ID and Bridge Number check instead of a LAN-in ID, Bridge Number, and LAN-out ID
	 * check before they forward broadcast frames.
	 * 
	 * @param long new lanIdMismatches property value
	 * @exception Exception
	 */
	public void setLanIdMismatches(long lanIdMismatches) {

		this.lanIdMismatches = lanIdMismatches;
	} // setLanIdMismatches

} // Class SwitchPortSourceRoutingStatistics