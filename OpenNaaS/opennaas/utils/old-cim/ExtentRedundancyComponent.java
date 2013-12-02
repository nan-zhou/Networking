/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ExtentRedundancyComponent as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the ExtentRedundancyComponentBean Interface. The CIM class
 * ExtentRedundancyComponent is described as follows:
 * 
 * Describes the StorageExtents participating in a Storage RedundancyGroup. The use of this class is being deprecated in lieu of using
 * MemberOfCollection in conjunction with StorageRedundancySet.
 */
@Deprecated
public class ExtentRedundancyComponent extends RedundancyComponent implements
		Serializable {

	/**
	 * This constructor creates a ExtentRedundancyComponentBeanImpl Class which implements the ExtentRedundancyComponentBean Interface, and
	 * encapsulates the CIM class ExtentRedundancyComponent in a Java Bean. The CIM class ExtentRedundancyComponent is described as follows:
	 * 
	 * Describes the StorageExtents participating in a Storage RedundancyGroup. The use of this class is being deprecated in lieu of using
	 * MemberOfCollection in conjunction with StorageRedundancySet.
	 */
	public ExtentRedundancyComponent() {
	};

	/**
	 * This method create an Association of the type ExtentRedundancyComponent between one StorageRedundancyGroup object and StorageExtent object
	 */
	@Deprecated
	public static ExtentRedundancyComponent link(StorageRedundancyGroup
			groupComponent, StorageExtent partComponent) {

		return (ExtentRedundancyComponent) Association.link(ExtentRedundancyComponent.class, groupComponent, partComponent);
	}// link

} // Class ExtentRedundancyComponent
