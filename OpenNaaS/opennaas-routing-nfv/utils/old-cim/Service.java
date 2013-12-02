/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;
import java.util.List;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class Service as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ServiceBean Interface. The CIM class Service is described as follows:
 * 
 * A Service is a LogicalElement that represents the availability of functionality that can be managed. This functionality may be provided by a
 * seperately modeled entity such as a LogicalDevice or a SoftwareFeature, or both. The modeled Service typically provides only functionality required
 * for management of itself or the elements it affects.
 */
public class Service extends EnabledLogicalElement implements Serializable {

	/* HOSTED SERVICE */

	/**
	 * @return System associated with this Service through HostedService dependency.
	 */
	public System getHostSystem() {
		return (System) this.getFirstFromAssociatedElementByType(HostedService.class);
	}

	/**
	 * 
	 * @param host
	 *            System to be associated with this Service through HostedService dependency.
	 */
	public void setHostSystem(System host) {
		if (host != null)
			HostedService.link(host, this);
	}

	/**
	 * This constructor creates a ServiceBeanImpl Class which implements the ServiceBean Interface, and encapsulates the CIM class Service in a Java
	 * Bean. The CIM class Service is described as follows:
	 * 
	 * A Service is a LogicalElement that represents the availability of functionality that can be managed. This functionality may be provided by a
	 * seperately modeled entity such as a LogicalDevice or a SoftwareFeature, or both. The modeled Service typically provides only functionality
	 * required for management of itself or the elements it affects.
	 */
	protected Service() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemCreationClassName.
	 */
	private String	systemCreationClassName;

	/**
	 * This method returns the Service.systemCreationClassName property value. This property is described as follows:
	 * 
	 * The CreationClassName of the scoping System.
	 * 
	 * @return String current systemCreationClassName property value
	 * @exception Exception
	 */
	public String getSystemCreationClassName() {

		return this.systemCreationClassName;
	} // getSystemCreationClassName

	/**
	 * This method sets the Service.systemCreationClassName property value. This property is described as follows:
	 * 
	 * The CreationClassName of the scoping System.
	 * 
	 * @param String
	 *            new systemCreationClassName property value
	 * @exception Exception
	 */
	public void setSystemCreationClassName(String systemCreationClassName) {

		this.systemCreationClassName = systemCreationClassName;
	} // setSystemCreationClassName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemName.
	 */
	private String	systemName;

	/**
	 * This method returns the Service.systemName property value. This property is described as follows:
	 * 
	 * The Name of the scoping System.
	 * 
	 * @return String current systemName property value
	 * @exception Exception
	 */
	public String getSystemName() {

		return this.systemName;
	} // getSystemName

	/**
	 * This method sets the Service.systemName property value. This property is described as follows:
	 * 
	 * The Name of the scoping System.
	 * 
	 * @param String
	 *            new systemName property value
	 * @exception Exception
	 */
	public void setSystemName(String systemName) {

		this.systemName = systemName;
	} // setSystemName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property creationClassName.
	 */
	private String	creationClassName;

	/**
	 * This method returns the Service.creationClassName property value. This property is described as follows:
	 * 
	 * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key
	 * properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * 
	 * @return String current creationClassName property value
	 * @exception Exception
	 */
	public String getCreationClassName() {

		return this.creationClassName;
	} // getCreationClassName

	/**
	 * This method sets the Service.creationClassName property value. This property is described as follows:
	 * 
	 * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key
	 * properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * 
	 * @param String
	 *            new creationClassName property value
	 * @exception Exception
	 */
	public void setCreationClassName(String creationClassName) {

		this.creationClassName = creationClassName;
	} // setCreationClassName

	// /**
	// * The following constants are defined for use with the ValueMap/Values
	// * qualified property name.
	// */
	// private String name;
	/**
	 * This method returns the Service.name property value. This property is described as follows:
	 * 
	 * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is
	 * described in more detail in the Description property of the object.
	 * 
	 * @return String current name property value
	 * @exception Exception
	 */
	@Override
	public String getName() {
		return super.getName();
	} // getName

	/**
	 * This method sets the Service.name property value. This property is described as follows:
	 * 
	 * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is
	 * described in more detail in the Description property of the object.
	 * 
	 * @param String
	 *            new name property value
	 * @exception Exception
	 */
	@Override
	public void setName(String name) {
		super.setName(name);
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property primaryOwnerName.
	 */
	private String	primaryOwnerName;

	/**
	 * This method returns the Service.primaryOwnerName property value. This property is described as follows:
	 * 
	 * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
	 * 
	 * @return String current primaryOwnerName property value
	 * @exception Exception
	 */
	public String getPrimaryOwnerName() {

		return this.primaryOwnerName;
	} // getPrimaryOwnerName

	/**
	 * This method sets the Service.primaryOwnerName property value. This property is described as follows:
	 * 
	 * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
	 * 
	 * @param String
	 *            new primaryOwnerName property value
	 * @exception Exception
	 */
	public void setPrimaryOwnerName(String primaryOwnerName) {

		this.primaryOwnerName = primaryOwnerName;
	} // setPrimaryOwnerName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property primaryOwnerContact.
	 */
	private String	primaryOwnerContact;

	/**
	 * This method returns the Service.primaryOwnerContact property value. This property is described as follows:
	 * 
	 * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so
	 * on).
	 * 
	 * @return String current primaryOwnerContact property value
	 * @exception Exception
	 */
	public String getPrimaryOwnerContact() {

		return this.primaryOwnerContact;
	} // getPrimaryOwnerContact

	/**
	 * This method sets the Service.primaryOwnerContact property value. This property is described as follows:
	 * 
	 * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so
	 * on).
	 * 
	 * @param String
	 *            new primaryOwnerContact property value
	 * @exception Exception
	 */
	public void setPrimaryOwnerContact(String primaryOwnerContact) {

		this.primaryOwnerContact = primaryOwnerContact;
	} // setPrimaryOwnerContact

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property StartMode.
	 */
	@Deprecated
	public enum StartMode {
		AUTOMATIC,
		MANUAL
	}

	@Deprecated
	private StartMode	startMode;

	/**
	 * This method returns the Service.startMode property value. This property is described as follows:
	 * 
	 * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The
	 * EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing
	 * V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema.
	 * Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using
	 * EnabledDefault. Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an
	 * Operating System, and so on, or is started only upon request.
	 * 
	 * @return String current startMode property value
	 * @exception Exception
	 */
	@Deprecated
	public StartMode getStartMode() {

		return this.startMode;
	} // getStartMode

	/**
	 * This method sets the Service.startMode property value. This property is described as follows:
	 * 
	 * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The
	 * EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing
	 * V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema.
	 * Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using
	 * EnabledDefault. Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an
	 * Operating System, and so on, or is started only upon request.
	 * 
	 * @param String
	 *            new startMode property value
	 * @exception Exception
	 */
	@Deprecated
	public void setStartMode(StartMode startMode) {

		this.startMode = startMode;
	} // setStartMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property started.
	 */
	private boolean	started;

	/**
	 * This method returns the Service.started property value. This property is described as follows:
	 * 
	 * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
	 * 
	 * @return boolean current started property value
	 * @exception Exception
	 */
	public boolean isStarted() {

		return this.started;
	} // getStarted

	/**
	 * This method sets the Service.started property value. This property is described as follows:
	 * 
	 * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
	 * 
	 * @param boolean new started property value
	 * @exception Exception
	 */
	public void setStarted(boolean started) {

		this.started = started;
	} // setStarted

	/**
	 * Adds a new ProvidesEndpoint association between a given ProtocolEndpoint and this element.
	 * 
	 * @param protocolEndpoint
	 */
	public void addProtocolEndpoint(ProtocolEndpoint protocolEndpoint) {
		if (protocolEndpoint != null)
			ProvidesEndpoint.link(this, protocolEndpoint);
	}

	/**
	 * Removes the ProvidesEndpoint association between the given ProtocolEndpoint and this element.
	 * 
	 * @param protocolEndpoint
	 */
	public void removeProtocolEndpoint(ProtocolEndpoint protocolEndpoint) {
		if (protocolEndpoint != null) {
			Association a = this.getFirstToAssociationByTypeAndElement(ProvidesEndpoint.class, protocolEndpoint);
			if (a != null)
				a.unlink();
		}
	}

	/**
	 * Returns the list of all ProtocolEndpoint associated to this element.
	 * 
	 * @return
	 */
	public List<ProtocolEndpoint> getProtocolEndpoint() {
		return (List<ProtocolEndpoint>) this.getToAssociatedElementsByType(ProvidesEndpoint.class);

	}

} // Class Service
