/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class PeerIDPayloadFilterEntry as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the PeerIDPayloadFilterEntryBean Interface. The CIM class
 * PeerIDPayloadFilterEntry is described as follows:
 * 
 * PeerIDPayloadFilterEntry defines filters used to match the Identification Type field in the ID Payload of the IKE protocol exchange. It permits the
 * specification of ID values such as "*@example.com" or "192.0.2.0/24".
 */
public class PeerIDPayloadFilterEntry extends FilterEntryBase implements
		Serializable {

	/**
	 * This constructor creates a PeerIDPayloadFilterEntryBeanImpl Class which implements the PeerIDPayloadFilterEntryBean Interface, and encapsulates
	 * the CIM class PeerIDPayloadFilterEntry in a Java Bean. The CIM class PeerIDPayloadFilterEntry is described as follows:
	 * 
	 * PeerIDPayloadFilterEntry defines filters used to match the Identification Type field in the ID Payload of the IKE protocol exchange. It permits
	 * the specification of ID values such as "*@example.com" or "192.0.2.0/24".
	 */
	public PeerIDPayloadFilterEntry() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property MatchIdentityType.
	 */

	public enum MatchIdentityType {
		OTHER,
		IPV4_ADDRESS,
		FQDN,
		USER_FQDN,
		IPV4_SUBNET_ADDRESS,
		IPV6_ADDRESS,
		IPV6_SUBNET_ADDRESS,
		IPV4_ADDRESS_RANGE,
		IPV6_ADDRESS_RANGE,
		DER_ASN1_DN,
		DER_ASN1_GN,
		KEY_ID,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private MatchIdentityType	matchIdentityType;

	/**
	 * This method returns the PeerIDPayloadFilterEntry.matchIdentityType property value. This property is described as follows:
	 * 
	 * MatchIdentityType specifies the Identification Type provided by the peer in the payload. The list of identities was generated from Section
	 * 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	 * 
	 * @return int current matchIdentityType property value
	 * @exception Exception
	 */
	public MatchIdentityType getMatchIdentityType() {

		return this.matchIdentityType;
	} // getMatchIdentityType

	/**
	 * This method sets the PeerIDPayloadFilterEntry.matchIdentityType property value. This property is described as follows:
	 * 
	 * MatchIdentityType specifies the Identification Type provided by the peer in the payload. The list of identities was generated from Section
	 * 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	 * 
	 * @param int new matchIdentityType property value
	 * @exception Exception
	 */
	public void setMatchIdentityType(MatchIdentityType matchIdentityType) {

		this.matchIdentityType = matchIdentityType;
	} // setMatchIdentityType

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property matchIdentityValue.
	 */
	private String	matchIdentityValue;

	/**
	 * This method returns the PeerIDPayloadFilterEntry.matchIdentityValue property value. This property is described as follows:
	 * 
	 * MatchIdentityValue is the filter value for comparison with the ID payload, e,g, "*@company.com". The syntax may need to be converted for
	 * comparison. For example, if the type of identity is a DER-encoded distinguished name, (for example, MatchIdentityType = 10, "DER_ASN1_DN"), the
	 * MatchIdentityValue MUST be converted into a DER-encoded string. This allows it to be matched against the values extracted from the ID payload
	 * at runtime. Note that a wildcard mechanism may be used when MatchIdentityType specifies a general character string (for example, if
	 * MatchIdentityType=3, 'FQDN'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for
	 * 'FQDN', a MatchFieldValue of '*@example.com' will successfully match an ID payload of 'janedoe@example.com'. A wildcard can be used to
	 * represent 0 or more characters as is appropriate for the type specified in MatchIdentityType.
	 * 
	 * @return String current matchIdentityValue property value
	 * @exception Exception
	 */
	public String getMatchIdentityValue() {

		return this.matchIdentityValue;
	} // getMatchIdentityValue

	/**
	 * This method sets the PeerIDPayloadFilterEntry.matchIdentityValue property value. This property is described as follows:
	 * 
	 * MatchIdentityValue is the filter value for comparison with the ID payload, e,g, "*@company.com". The syntax may need to be converted for
	 * comparison. For example, if the type of identity is a DER-encoded distinguished name, (for example, MatchIdentityType = 10, "DER_ASN1_DN"), the
	 * MatchIdentityValue MUST be converted into a DER-encoded string. This allows it to be matched against the values extracted from the ID payload
	 * at runtime. Note that a wildcard mechanism may be used when MatchIdentityType specifies a general character string (for example, if
	 * MatchIdentityType=3, 'FQDN'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for
	 * 'FQDN', a MatchFieldValue of '*@example.com' will successfully match an ID payload of 'janedoe@example.com'. A wildcard can be used to
	 * represent 0 or more characters as is appropriate for the type specified in MatchIdentityType.
	 * 
	 * @param String
	 *            new matchIdentityValue property value
	 * @exception Exception
	 */
	public void setMatchIdentityValue(String matchIdentityValue) {

		this.matchIdentityValue = matchIdentityValue;
	} // setMatchIdentityValue

} // Class PeerIDPayloadFilterEntry
