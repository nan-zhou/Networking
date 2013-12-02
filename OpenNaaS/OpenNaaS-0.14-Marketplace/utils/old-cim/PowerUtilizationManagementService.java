/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class PowerUtilizationManagementService as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the PowerUtilizationManagementServiceBean Interface. The CIM class
 * PowerUtilizationManagementService is described as follows:
 * 
 * PowerUtilizationManagementService represents the ability of a platform or component to perform autonomic management of its power utilization.
 */
public class PowerUtilizationManagementService extends Service implements
		Serializable {

	/**
	 * This constructor creates a PowerUtilizationManagementServiceBeanImpl Class which implements the PowerUtilizationManagementServiceBean
	 * Interface, and encapsulates the CIM class PowerUtilizationManagementService in a Java Bean. The CIM class PowerUtilizationManagementService is
	 * described as follows:
	 * 
	 * PowerUtilizationManagementService represents the ability of a platform or component to perform autonomic management of its power utilization.
	 */
	public PowerUtilizationManagementService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property PowerUtilizationMode.
	 */

	public enum PowerUtilizationMode {
		NONE,
		DYNAMIC,
		STATIC,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private PowerUtilizationMode	powerUtilizationMode;

	/**
	 * This method returns the PowerUtilizationManagementService.powerUtilizationMode property value. This property is described as follows:
	 * 
	 * PowerUtilizationMode indicates the current power utilization mode implemented by the service. The mode selection is a generally made
	 * infrequently as part of element configuration. A value of "None" shall indicate that no effort is being made to reduce the power consumed by
	 * the system below nominal. A value of "Dynamic" shall indicate the PowerUtilizationManagementService is actively modifying the configuration of
	 * one or more system components in order to reduce the power consumed. A value of "Static" shall indicate the system whose power utilization
	 * functionality is represented by the PowerUtilizationManagementService is operating with a fixed configuration resulting in a lower level of
	 * power consumption than nominal. Static mode differs from dynamic in that the mode corresponds to a single fixed configuration, while dynamic
	 * mode implies frequent changes in system configuration.
	 * 
	 * @return int current powerUtilizationMode property value
	 * @exception Exception
	 */
	public PowerUtilizationMode getPowerUtilizationMode() {

		return this.powerUtilizationMode;
	} // getPowerUtilizationMode

	/**
	 * This method sets the PowerUtilizationManagementService.powerUtilizationMode property value. This property is described as follows:
	 * 
	 * PowerUtilizationMode indicates the current power utilization mode implemented by the service. The mode selection is a generally made
	 * infrequently as part of element configuration. A value of "None" shall indicate that no effort is being made to reduce the power consumed by
	 * the system below nominal. A value of "Dynamic" shall indicate the PowerUtilizationManagementService is actively modifying the configuration of
	 * one or more system components in order to reduce the power consumed. A value of "Static" shall indicate the system whose power utilization
	 * functionality is represented by the PowerUtilizationManagementService is operating with a fixed configuration resulting in a lower level of
	 * power consumption than nominal. Static mode differs from dynamic in that the mode corresponds to a single fixed configuration, while dynamic
	 * mode implies frequent changes in system configuration.
	 * 
	 * @param int new powerUtilizationMode property value
	 * @exception Exception
	 */
	public void setPowerUtilizationMode(PowerUtilizationMode
			powerUtilizationMode) {

		this.powerUtilizationMode = powerUtilizationMode;
	} // setPowerUtilizationMode

} // Class PowerUtilizationManagementService
