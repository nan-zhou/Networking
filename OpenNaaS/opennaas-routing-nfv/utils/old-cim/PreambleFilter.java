/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class PreambleFilter as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the PreambleFilterBean Interface. The CIM class PreambleFilter is described as follows:
 * 
 * PreambleFilter allows the classification of packets using traffic-conditioning results (where the results are determined by a PreambleMarkerService
 * and stored in a 'packet preamble'). This permits information about the treatment that a packet receives on an ingress interface to be communicated
 * along with the packet to the egress interface. An instance of PreambleFilter selects packets based on a two-part string (type and value pair)
 * identifying a specific entry in the preamble. The logic for this match is 'at least one.' That is, a packet with multiple entries/results in its
 * preamble matches a filter if at least one of these matches the filter.
 */
public class PreambleFilter extends FilterEntryBase implements Serializable
{

	/**
	 * This constructor creates a PreambleFilterBeanImpl Class which implements the PreambleFilterBean Interface, and encapsulates the CIM class
	 * PreambleFilter in a Java Bean. The CIM class PreambleFilter is described as follows:
	 * 
	 * PreambleFilter allows the classification of packets using traffic-conditioning results (where the results are determined by a
	 * PreambleMarkerService and stored in a 'packet preamble'). This permits information about the treatment that a packet receives on an ingress
	 * interface to be communicated along with the packet to the egress interface. An instance of PreambleFilter selects packets based on a two-part
	 * string (type and value pair) identifying a specific entry in the preamble. The logic for this match is 'at least one.' That is, a packet with
	 * multiple entries/results in its preamble matches a filter if at least one of these matches the filter.
	 */
	public PreambleFilter() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property filterItemList.
	 */
	private String[]	filterItemList;

	/**
	 * This method returns the PreambleFilter.filterItemList property value. This property is described as follows:
	 * 
	 * To foster interoperability, the basic format of the information captured by a PreambleMarker is specified. That information is contained in the
	 * FilterItemList property (an ordered, string array). Each entry in the array takes the form 'type,value'. When entries are added, they are
	 * appended to the end of the list. A limited set of standardized 'type's exist. They are: - ConformingFromMeter, NonConformingFromMeter and
	 * PartConformingFromMeter to convey metering results (where the 'value' is the name of the meter) - VlanId to describe the traffic's VLAN
	 * information (where the 'value' is the VLAN ID). An implementation is free to define and use other preamble 'types'. Note that a wildcard value
	 * of "any" is allowed to indicate that the preamble entry matches for any 'value' of the specified 'type'. For example, using the wildcard, an
	 * administrator can define a filter to select all packets that were found to be conforming ('type' = "ConformingFromMeter") without having to
	 * name each meter individually.
	 * 
	 * @return String[] current filterItemList property value
	 * @exception Exception
	 */
	public String[] getFilterItemList() {

		return this.filterItemList;
	} // getFilterItemList

	/**
	 * This method sets the PreambleFilter.filterItemList property value. This property is described as follows:
	 * 
	 * To foster interoperability, the basic format of the information captured by a PreambleMarker is specified. That information is contained in the
	 * FilterItemList property (an ordered, string array). Each entry in the array takes the form 'type,value'. When entries are added, they are
	 * appended to the end of the list. A limited set of standardized 'type's exist. They are: - ConformingFromMeter, NonConformingFromMeter and
	 * PartConformingFromMeter to convey metering results (where the 'value' is the name of the meter) - VlanId to describe the traffic's VLAN
	 * information (where the 'value' is the VLAN ID). An implementation is free to define and use other preamble 'types'. Note that a wildcard value
	 * of "any" is allowed to indicate that the preamble entry matches for any 'value' of the specified 'type'. For example, using the wildcard, an
	 * administrator can define a filter to select all packets that were found to be conforming ('type' = "ConformingFromMeter") without having to
	 * name each meter individually.
	 * 
	 * @param String
	 *            [] new filterItemList property value
	 * @exception Exception
	 */
	public void setFilterItemList(String[] filterItemList) {

		this.filterItemList = filterItemList;
	} // setFilterItemList

} // Class PreambleFilter
