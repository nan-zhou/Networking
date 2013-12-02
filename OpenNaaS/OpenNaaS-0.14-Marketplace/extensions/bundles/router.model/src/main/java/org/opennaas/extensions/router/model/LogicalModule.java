/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Mar 30
 * 18:01:50 CEST 2011.
 */

package org.opennaas.extensions.router.model;

import java.util.*;
import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class LogicalModule as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the LogicalModuleBean Interface. The CIM class LogicalModule is described as follows:
 * 
 * LogicalModule is the logical device that corresponds to a component part (such as a card or blade) in a device. For example, a line card in a
 * switch is an instance of LogicalModule, that is associated with the the switch itself. A logical module is not necessarily independently managed.
 */
public class LogicalModule extends LogicalDevice implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -8521252533557056661L;

	/**
	 * MANUALLY ADDED TO CIM (12/04/2011)<br>
	 * Add given NetworkPort as a ModulePort of this LogicalModule.
	 * 
	 * @param networkPort
	 * @return true if it has been added, false otherwise
	 */
	public boolean addModulePort(NetworkPort networkPort) {
		if (networkPort == null)
			return false;

		// check if already exists
		Association a = this.getFirstToAssociationByTypeAndElement(ModulePort.class, networkPort);
		if (a != null)
			a.unlink();

		return (ModulePort.link(this, networkPort) != null);
	}

	/**
	 * MANUALLY ADDED TO CIM (12/04/2011)<br>
	 * Remove given NetworkPort as a ModulePort of this LogicalModule (if present)
	 * 
	 * @param networkPort
	 * @return true if it has been removed, false otherwise.
	 */
	public boolean removeModulePort(NetworkPort networkPort) {
		if (networkPort == null)
			return false;
		Association a = this.getFirstToAssociationByTypeAndElement(ModulePort.class, networkPort);
		if (a == null)
			return false;
		else {
			a.unlink();
			return true;
		}
	}

	/**
	 * MANUALLY ADDED TO CIM (12/04/2011)<br>
	 * This method returns the list of NetworkPort from the toAssociation vector that match with the type ModulePort. It return the list of
	 * NetworkPort exported by this LogicalModule.
	 * 
	 * @return List<NextHopRoute>
	 */
	@SuppressWarnings("unchecked")
	public List<NetworkPort> getModulePorts() {
		return (List<NetworkPort>) this.getToAssociatedElementsByType(ModulePort.class);
	}

	/**
	 * This constructor creates a LogicalModuleBeanImpl Class which implements the LogicalModuleBean Interface, and encapsulates the CIM class
	 * LogicalModule in a Java Bean. The CIM class LogicalModule is described as follows:
	 * 
	 * LogicalModule is the logical device that corresponds to a component part (such as a card or blade) in a device. For example, a line card in a
	 * switch is an instance of LogicalModule, that is associated with the the switch itself. A logical module is not necessarily independently
	 * managed.
	 */
	public LogicalModule() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property moduleNumber.
	 */
	private int	moduleNumber;

	/**
	 * This method returns the LogicalModule.moduleNumber property value. This property is described as follows:
	 * 
	 * Logical modules are often named by the physical or logical slot that they occupy within the containing device. ModuleNumber is the number
	 * assigned to the module by its parent.
	 * 
	 * @return int current moduleNumber property value
	 * @exception Exception
	 */
	public int getModuleNumber() {

		return this.moduleNumber;
	} // getModuleNumber

	/**
	 * This method sets the LogicalModule.moduleNumber property value. This property is described as follows:
	 * 
	 * Logical modules are often named by the physical or logical slot that they occupy within the containing device. ModuleNumber is the number
	 * assigned to the module by its parent.
	 * 
	 * @param int new moduleNumber property value
	 * @exception Exception
	 */
	public void setModuleNumber(int moduleNumber) {

		this.moduleNumber = moduleNumber;
	} // setModuleNumber

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property LogicalModuleType.
	 */

	public enum LogicalModuleType {
		UNKNOWN,
		OTHER,
		DEVICE_TRAY,
		LINE_CARD,
		BLADE,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private LogicalModuleType	logicalModuleType;

	/**
	 * This method returns the LogicalModule.logicalModuleType property value. This property is described as follows:
	 * 
	 * Type identifies the type of LogicalModule this instance represents. A value of "Unknown" indicates that the LogicalModuleType is unknown. A
	 * value of "Other" indicates that the value is not one of the enumerated values. OtherLogicalModuleTypeDescription should contain additional
	 * information. A value of "Device Tray" indicates that the device is a device or media tray, for example in a modular system. A value of
	 * "Line Card" indicates that the module is a line card in a switch. A value of "Blade" indicates the module is a blade inserted into a switch.
	 * The ranges expressed by "DMTF Reserved" and "Vendor Reserved" are reserved for DMTF and Vendor extensibility, respectively.
	 * 
	 * @return int current logicalModuleType property value
	 * @exception Exception
	 */
	public LogicalModuleType getLogicalModuleType() {

		return this.logicalModuleType;
	} // getLogicalModuleType

	/**
	 * This method sets the LogicalModule.logicalModuleType property value. This property is described as follows:
	 * 
	 * Type identifies the type of LogicalModule this instance represents. A value of "Unknown" indicates that the LogicalModuleType is unknown. A
	 * value of "Other" indicates that the value is not one of the enumerated values. OtherLogicalModuleTypeDescription should contain additional
	 * information. A value of "Device Tray" indicates that the device is a device or media tray, for example in a modular system. A value of
	 * "Line Card" indicates that the module is a line card in a switch. A value of "Blade" indicates the module is a blade inserted into a switch.
	 * The ranges expressed by "DMTF Reserved" and "Vendor Reserved" are reserved for DMTF and Vendor extensibility, respectively.
	 * 
	 * @param int new logicalModuleType property value
	 * @exception Exception
	 */
	public void setLogicalModuleType(LogicalModuleType logicalModuleType) {

		this.logicalModuleType = logicalModuleType;
	} // setLogicalModuleType

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherLogicalModuleTypeDescription.
	 */
	private String	otherLogicalModuleTypeDescription;

	/**
	 * This method returns the LogicalModule.otherLogicalModuleTypeDescription property value. This property is described as follows:
	 * 
	 * OtherLogicalModuleTypeDescription provides additional information about the type of LogicalModule represented by this instance when the value
	 * of LogicalModuleType is 1 ("Other").
	 * 
	 * @return String current otherLogicalModuleTypeDescription property value
	 * @exception Exception
	 */
	public String getOtherLogicalModuleTypeDescription() {

		return this.otherLogicalModuleTypeDescription;
	} // getOtherLogicalModuleTypeDescription

	/**
	 * This method sets the LogicalModule.otherLogicalModuleTypeDescription property value. This property is described as follows:
	 * 
	 * OtherLogicalModuleTypeDescription provides additional information about the type of LogicalModule represented by this instance when the value
	 * of LogicalModuleType is 1 ("Other").
	 * 
	 * @param String
	 *            new otherLogicalModuleTypeDescription property value
	 * @exception Exception
	 */
	public void setOtherLogicalModuleTypeDescription(String
			otherLogicalModuleTypeDescription) {

		this.otherLogicalModuleTypeDescription =
				otherLogicalModuleTypeDescription;
	} // setOtherLogicalModuleTypeDescription

} // Class LogicalModule
