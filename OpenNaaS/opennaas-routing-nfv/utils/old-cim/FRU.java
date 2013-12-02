/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class FRU as well as methods comparable to the invokeMethods
 * defined for this class. This Class implements the FRUBean Interface. The CIM class FRU is described as follows:
 * 
 * The CIM_FRU class is a vendor-defined collection of Products and/or PhysicalElements that is associated with a Product for the purpose of
 * supporting, maintaining or upgrading that Product at the customer's location. FRU is an acronym for 'field replaceable unit'.
 */
public class FRU extends ManagedElement implements Serializable {

	/**
	 * This constructor creates a FRUBeanImpl Class which implements the FRUBean Interface, and encapsulates the CIM class FRU in a Java Bean. The CIM
	 * class FRU is described as follows:
	 * 
	 * The CIM_FRU class is a vendor-defined collection of Products and/or PhysicalElements that is associated with a Product for the purpose of
	 * supporting, maintaining or upgrading that Product at the customer's location. FRU is an acronym for 'field replaceable unit'.
	 */
	public FRU() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fRUNumber.
	 */
	private String	fRUNumber;

	/**
	 * This method returns the FRU.fRUNumber property value. This property is described as follows:
	 * 
	 * FRU ordering information.
	 * 
	 * @return String current fRUNumber property value
	 * @exception Exception
	 */
	public String getFRUNumber() {

		return this.fRUNumber;
	} // getFRUNumber

	/**
	 * This method sets the FRU.fRUNumber property value. This property is described as follows:
	 * 
	 * FRU ordering information.
	 * 
	 * @param String
	 *            new fRUNumber property value
	 * @exception Exception
	 */
	public void setFRUNumber(String fRUNumber) {

		this.fRUNumber = fRUNumber;
	} // setFRUNumber

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property identifyingNumber.
	 */
	private String	identifyingNumber;

	/**
	 * This method returns the FRU.identifyingNumber property value. This property is described as follows:
	 * 
	 * FRU identification such as a serial number on software or a die number on a hardware chip.
	 * 
	 * @return String current identifyingNumber property value
	 * @exception Exception
	 */
	public String getIdentifyingNumber() {

		return this.identifyingNumber;
	} // getIdentifyingNumber

	/**
	 * This method sets the FRU.identifyingNumber property value. This property is described as follows:
	 * 
	 * FRU identification such as a serial number on software or a die number on a hardware chip.
	 * 
	 * @param String
	 *            new identifyingNumber property value
	 * @exception Exception
	 */
	public void setIdentifyingNumber(String identifyingNumber) {

		this.identifyingNumber = identifyingNumber;
	} // setIdentifyingNumber

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property vendor.
	 */
	private String	vendor;

	/**
	 * This method returns the FRU.vendor property value. This property is described as follows:
	 * 
	 * The name of the FRU's supplier.
	 * 
	 * @return String current vendor property value
	 * @exception Exception
	 */
	public String getVendor() {

		return this.vendor;
	} // getVendor

	/**
	 * This method sets the FRU.vendor property value. This property is described as follows:
	 * 
	 * The name of the FRU's supplier.
	 * 
	 * @param String
	 *            new vendor property value
	 * @exception Exception
	 */
	public void setVendor(String vendor) {

		this.vendor = vendor;
	} // setVendor

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property description.
	 */
	private String	description;

	/**
	 * This method returns the FRU.description property value. This property is described as follows:
	 * 
	 * A textual description of the FRU.
	 * 
	 * @return String current description property value
	 * @exception Exception
	 */
	@Override
	public String getDescription() {

		return this.description;
	} // getDescription

	/**
	 * This method sets the FRU.description property value. This property is described as follows:
	 * 
	 * A textual description of the FRU.
	 * 
	 * @param String
	 *            new description property value
	 * @exception Exception
	 */
	@Override
	public void setDescription(String description) {

		this.description = description;
	} // setDescription

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property name.
	 */
	private String	name;

	/**
	 * This method returns the FRU.name property value. This property is described as follows:
	 * 
	 * FRU name.
	 * 
	 * @return String current name property value
	 * @exception Exception
	 */
	public String getName() {

		return this.name;
	} // getName

	/**
	 * This method sets the FRU.name property value. This property is described as follows:
	 * 
	 * FRU name.
	 * 
	 * @param String
	 *            new name property value
	 * @exception Exception
	 */
	public void setName(String name) {

		this.name = name;
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property revisionLevel.
	 */
	private String	revisionLevel;

	/**
	 * This method returns the FRU.revisionLevel property value. This property is described as follows:
	 * 
	 * The FRU's revision level.
	 * 
	 * @return String current revisionLevel property value
	 * @exception Exception
	 */
	public String getRevisionLevel() {

		return this.revisionLevel;
	} // getRevisionLevel

	/**
	 * This method sets the FRU.revisionLevel property value. This property is described as follows:
	 * 
	 * The FRU's revision level.
	 * 
	 * @param String
	 *            new revisionLevel property value
	 * @exception Exception
	 */
	public void setRevisionLevel(String revisionLevel) {

		this.revisionLevel = revisionLevel;
	} // setRevisionLevel

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property customerReplaceable.
	 */
	private boolean	customerReplaceable;

	/**
	 * This method returns the FRU.customerReplaceable property value. This property is described as follows:
	 * 
	 * Indicates whether the FRU is customer replaceable.
	 * 
	 * @return boolean current customerReplaceable property value
	 * @exception Exception
	 */
	public boolean isCustomerReplaceable() {

		return this.customerReplaceable;
	} // getCustomerReplaceable

	/**
	 * This method sets the FRU.customerReplaceable property value. This property is described as follows:
	 * 
	 * Indicates whether the FRU is customer replaceable.
	 * 
	 * @param boolean new customerReplaceable property value
	 * @exception Exception
	 */
	public void setCustomerReplaceable(boolean customerReplaceable) {

		this.customerReplaceable = customerReplaceable;
	} // setCustomerReplaceable

} // Class FRU
