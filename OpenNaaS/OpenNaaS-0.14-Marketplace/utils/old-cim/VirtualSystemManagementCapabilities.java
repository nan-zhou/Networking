/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class VirtualSystemManagementCapabilities as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the VirtualSystemManagementCapabilitiesBean Interface. The CIM class
 * VirtualSystemManagementCapabilities is described as follows:
 * 
 * Capabilities of a CIM_VirtualSystemManagementService.
 */
public class VirtualSystemManagementCapabilities extends
		EnabledLogicalElementCapabilities implements Serializable {

	/**
	 * This constructor creates a VirtualSystemManagementCapabilitiesBeanImpl Class which implements the VirtualSystemManagementCapabilitiesBean
	 * Interface, and encapsulates the CIM class VirtualSystemManagementCapabilities in a Java Bean. The CIM class VirtualSystemManagementCapabilities
	 * is described as follows:
	 * 
	 * Capabilities of a CIM_VirtualSystemManagementService.
	 */
	public VirtualSystemManagementCapabilities() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property virtualSystemTypesSupported.
	 */
	private String[]	virtualSystemTypesSupported;

	/**
	 * This method returns the VirtualSystemManagementCapabilities.virtualSystemTypesSupported property value. This property is described as follows:
	 * 
	 * Enumeration of strings each designating a type of virtual system that the implementation supports. The value of each non-NULL array element
	 * shall conform to the format defined for the CIM_VirtualSystemSettingData.VirtualSystemType property.
	 * 
	 * @return String[] current virtualSystemTypesSupported property value
	 * @exception Exception
	 */
	public String[] getVirtualSystemTypesSupported() {

		return this.virtualSystemTypesSupported;
	} // getVirtualSystemTypesSupported

	/**
	 * This method sets the VirtualSystemManagementCapabilities.virtualSystemTypesSupported property value. This property is described as follows:
	 * 
	 * Enumeration of strings each designating a type of virtual system that the implementation supports. The value of each non-NULL array element
	 * shall conform to the format defined for the CIM_VirtualSystemSettingData.VirtualSystemType property.
	 * 
	 * @param String
	 *            [] new virtualSystemTypesSupported property value
	 * @exception Exception
	 */
	public void setVirtualSystemTypesSupported(String[]
			virtualSystemTypesSupported) {

		this.virtualSystemTypesSupported = virtualSystemTypesSupported;
	} // setVirtualSystemTypesSupported

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property SynchronousMethodsSupported.
	 */

	public enum SynchronousMethodsSupported {
		DEFINESYSTEMSUPPORTED,
		DESTROYSYSTEMSUPPORTED,
		DESTROYSYSTEMCONFIGURATIONSUPPORTED,
		MODIFYRESOURCESETTINGSSUPPORTED,
		MODIFYSYSTEMSETTINGSSUPPORTED,
		REMOVERESOURCESSUPPORTED,
		SELECTSYSTEMCONFIGURATIONSUPPORTED,
		SNAPSHOTSYSTEMSUPPORTED,
		ADDRESOURCESSUPPORTED,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private SynchronousMethodsSupported	synchronousMethodsSupported;

	/**
	 * This method returns the VirtualSystemManagementCapabilities.synchronousMethodsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the
	 * implementation.
	 * 
	 * @return int current synchronousMethodsSupported property value
	 * @exception Exception
	 */
	public SynchronousMethodsSupported getSynchronousMethodsSupported() {

		return this.synchronousMethodsSupported;
	} // getSynchronousMethodsSupported

	/**
	 * This method sets the VirtualSystemManagementCapabilities.synchronousMethodsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the
	 * implementation.
	 * 
	 * @param int new synchronousMethodsSupported property value
	 * @exception Exception
	 */
	public void setSynchronousMethodsSupported(SynchronousMethodsSupported
			synchronousMethodsSupported) {

		this.synchronousMethodsSupported = synchronousMethodsSupported;
	} // setSynchronousMethodsSupported

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property AsynchronousMethodsSupported.
	 */

	public enum AsynchronousMethodsSupported {
		DEFINESYSTEMSUPPORTED,
		DESTROYSYSTEMSUPPORTED,
		DESTROYSYSTEMCONFIGURATIONSUPPORTED,
		MODIFYRESOURCESETTINGSSUPPORTED,
		MODIFYSYSTEMSETTINGSSUPPORTED,
		REMOVERESOURCESSUPPORTED,
		SELECTSYSTEMCONFIGURATIONSUPPORTED,
		SNAPSHOTSYSTEMSUPPORTED,
		ADDRESOURCESSUPPORTED,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private AsynchronousMethodsSupported	asynchronousMethodsSupported;

	/**
	 * This method returns the VirtualSystemManagementCapabilities.asynchronousMethodsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the
	 * implementation.
	 * 
	 * @return int current asynchronousMethodsSupported property value
	 * @exception Exception
	 */
	public AsynchronousMethodsSupported getAsynchronousMethodsSupported() {

		return this.asynchronousMethodsSupported;
	} // getAsynchronousMethodsSupported

	/**
	 * This method sets the VirtualSystemManagementCapabilities.asynchronousMethodsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the
	 * implementation.
	 * 
	 * @param int new asynchronousMethodsSupported property value
	 * @exception Exception
	 */
	public void setAsynchronousMethodsSupported(AsynchronousMethodsSupported
			asynchronousMethodsSupported) {

		this.asynchronousMethodsSupported = asynchronousMethodsSupported;
	} // setAsynchronousMethodsSupported

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property IndicationsSupported.
	 */

	public enum IndicationsSupported {
		VIRTUALRESOURCESTATECHANGEINDICATIONSSUPPORTED,
		CONCRETEJOBSTATECHANGEINDICATIONSSUPPORTED,
		VIRTUALSYSTEMSTATECHANGEINDICATIONSSUPPORTED,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private IndicationsSupported	indicationsSupported;

	/**
	 * This method returns the VirtualSystemManagementCapabilities.indicationsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
	 * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of
	 * CIM_ComputerSystem instances representing virtual systems. VirtualResourceStateChangeIndicationsSupported indicates whether or not the
	 * implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
	 * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of
	 * CIM_ConcreteJob instances.
	 * 
	 * @return int current indicationsSupported property value
	 * @exception Exception
	 */
	public IndicationsSupported getIndicationsSupported() {

		return this.indicationsSupported;
	} // getIndicationsSupported

	/**
	 * This method sets the VirtualSystemManagementCapabilities.indicationsSupported property value. This property is described as follows:
	 * 
	 * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
	 * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of
	 * CIM_ComputerSystem instances representing virtual systems. VirtualResourceStateChangeIndicationsSupported indicates whether or not the
	 * implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
	 * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of
	 * CIM_ConcreteJob instances.
	 * 
	 * @param int new indicationsSupported property value
	 * @exception Exception
	 */
	public void setIndicationsSupported(IndicationsSupported
			indicationsSupported) {

		this.indicationsSupported = indicationsSupported;
	} // setIndicationsSupported

} // Class VirtualSystemManagementCapabilities
