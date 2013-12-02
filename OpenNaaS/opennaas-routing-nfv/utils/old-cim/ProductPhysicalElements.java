/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ProductPhysicalElements as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the ProductPhysicalElementsBean Interface. The CIM class ProductPhysicalElements
 * is described as follows:
 * 
 * Indicates the PhysicalElement(s) that make up a Product. This association is deprecated in order to correctly place it in the inheritance hierarchy
 * and align the definition with other new classes that are being added to the model, such as CIM_ProductServiceComponent. ProductPhysicalElements was
 * defined in the original CIM V2.0 release, when a Managed Element and a Component relationship between ManagedElements did not exist.
 */
@Deprecated
public class ProductPhysicalElements extends Association implements
		Serializable {

	/**
	 * This constructor creates a ProductPhysicalElementsBeanImpl Class which implements the ProductPhysicalElementsBean Interface, and encapsulates
	 * the CIM class ProductPhysicalElements in a Java Bean. The CIM class ProductPhysicalElements is described as follows:
	 * 
	 * Indicates the PhysicalElement(s) that make up a Product. This association is deprecated in order to correctly place it in the inheritance
	 * hierarchy and align the definition with other new classes that are being added to the model, such as CIM_ProductServiceComponent.
	 * ProductPhysicalElements was defined in the original CIM V2.0 release, when a Managed Element and a Component relationship between
	 * ManagedElements did not exist.
	 */
	public ProductPhysicalElements() {
	};

	/**
	 * This method create an Association of the type ProductPhysicalElements between one Product object and PhysicalElement object
	 */
	@Deprecated
	public static ProductPhysicalElements link(Product product, PhysicalElement
			component) {

		return (ProductPhysicalElements) Association.link(ProductPhysicalElements.class, product, component);
	}// link

} // Class ProductPhysicalElements
