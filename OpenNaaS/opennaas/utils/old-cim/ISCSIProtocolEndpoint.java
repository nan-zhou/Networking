/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ISCSIProtocolEndpoint as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the ISCSIProtocolEndpointBean Interface. The CIM class ISCSIProtocolEndpoint is
 * described as follows:
 * 
 * This is an iSCSI-specific SCSIProtocolEndpoint. ConnectionType MUST be 'iSCSI'. An iSCSIProtocolEndpoint represents an iSCSI port, which is the
 * usage of a subset of network portals (TCP+IP ProtocolEndpoints) in a Portal Group by an iSCSI node. The BindsTo associations from
 * iSCSIProtocolEndpoint to TCPProtocolEndpoints makes this relationship explicit. For an iSCSI target, the Identifier property (the Target Portal
 * Group Tag) makes the relationship unique. For an iSCSI initiator, the session identifier makes the initiator port unique within the node.
 */
public class ISCSIProtocolEndpoint extends SCSIProtocolEndpoint implements
		Serializable {

	/**
	 * This constructor creates a ISCSIProtocolEndpointBeanImpl Class which implements the ISCSIProtocolEndpointBean Interface, and encapsulates the
	 * CIM class ISCSIProtocolEndpoint in a Java Bean. The CIM class ISCSIProtocolEndpoint is described as follows:
	 * 
	 * This is an iSCSI-specific SCSIProtocolEndpoint. ConnectionType MUST be 'iSCSI'. An iSCSIProtocolEndpoint represents an iSCSI port, which is the
	 * usage of a subset of network portals (TCP+IP ProtocolEndpoints) in a Portal Group by an iSCSI node. The BindsTo associations from
	 * iSCSIProtocolEndpoint to TCPProtocolEndpoints makes this relationship explicit. For an iSCSI target, the Identifier property (the Target Portal
	 * Group Tag) makes the relationship unique. For an iSCSI initiator, the session identifier makes the initiator port unique within the node.
	 */
	public ISCSIProtocolEndpoint() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property name.
	 */
	private String	name;

	/**
	 * This method returns the iSCSIProtocolEndpoint.name property value. This property is described as follows:
	 * 
	 * The format of Name is based on the ConnectionType property. For iSCSI, the Name property of an SCSIProtocolEndpoint MUST contain the iSCSI port
	 * name as described in the iSCSI RFC (currently http://www.ietf.org/internet-drafts/draft-ietf- ips-iscsi-20.txt) - <iSCSI node name> + 'i,' +
	 * ISID for initiators, <iSCSI node name> + 't,' + TPGT for targets, where <iSCSI node name> can be any of the standard iSCSI name namespaces (eg.
	 * iqn, eui); and includes the namespace prefix.
	 * 
	 * @return String current name property value
	 * @exception Exception
	 */
	@Override
	public String getName() {

		return this.name;
	} // getName

	/**
	 * This method sets the iSCSIProtocolEndpoint.name property value. This property is described as follows:
	 * 
	 * The format of Name is based on the ConnectionType property. For iSCSI, the Name property of an SCSIProtocolEndpoint MUST contain the iSCSI port
	 * name as described in the iSCSI RFC (currently http://www.ietf.org/internet-drafts/draft-ietf- ips-iscsi-20.txt) - <iSCSI node name> + 'i,' +
	 * ISID for initiators, <iSCSI node name> + 't,' + TPGT for targets, where <iSCSI node name> can be any of the standard iSCSI name namespaces (eg.
	 * iqn, eui); and includes the namespace prefix.
	 * 
	 * @param String
	 *            new name property value
	 * @exception Exception
	 */
	@Override
	public void setName(String name) {

		this.name = name;
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property identifier.
	 */
	private String	identifier;

	/**
	 * This method returns the iSCSIProtocolEndpoint.identifier property value. This property is described as follows:
	 * 
	 * If this is an Initiator PE, Identifier MUST contain the ISID, if this is a Target PE, Identifier MUST contain the Target Portal Group Tag
	 * (TGPT). Each iSCSIProtocolEndpoint associated to a common SCSIProtocolController (iSCSI node) MUST have a unique Identifier. This field is
	 * formatted as 12 hexadecimal digits.
	 * 
	 * @return String current identifier property value
	 * @exception Exception
	 */
	public String getIdentifier() {

		return this.identifier;
	} // getIdentifier

	/**
	 * This method sets the iSCSIProtocolEndpoint.identifier property value. This property is described as follows:
	 * 
	 * If this is an Initiator PE, Identifier MUST contain the ISID, if this is a Target PE, Identifier MUST contain the Target Portal Group Tag
	 * (TGPT). Each iSCSIProtocolEndpoint associated to a common SCSIProtocolController (iSCSI node) MUST have a unique Identifier. This field is
	 * formatted as 12 hexadecimal digits.
	 * 
	 * @param String
	 *            new identifier property value
	 * @exception Exception
	 */
	public void setIdentifier(String identifier) {

		this.identifier = identifier;
	} // setIdentifier

} // Class ISCSIProtocolEndpoint
