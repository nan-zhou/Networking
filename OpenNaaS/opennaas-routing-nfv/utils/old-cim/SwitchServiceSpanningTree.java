/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SwitchServiceSpanningTree as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the SwitchServiceSpanningTreeBean Interface. The CIM class
 * SwitchServiceSpanningTree is described as follows:
 * 
 * An association linking SwitchService to a component SpanningTreeService. The cardinality of the SpanningTreeService is 0..1 for a VLAN-unaware
 * switch.
 */
public class SwitchServiceSpanningTree extends ServiceComponent implements
		Serializable {

	/**
	 * This constructor creates a SwitchServiceSpanningTreeBeanImpl Class which implements the SwitchServiceSpanningTreeBean Interface, and
	 * encapsulates the CIM class SwitchServiceSpanningTree in a Java Bean. The CIM class SwitchServiceSpanningTree is described as follows:
	 * 
	 * An association linking SwitchService to a component SpanningTreeService. The cardinality of the SpanningTreeService is 0..1 for a VLAN-unaware
	 * switch.
	 */
	public SwitchServiceSpanningTree() {
	};

	/**
	 * This method create an Association of the type SwitchServiceSpanningTree between one SwitchService object and SpanningTreeService object
	 */
	public static SwitchServiceSpanningTree link(SwitchService
			groupComponent, SpanningTreeService partComponent) {

		return (SwitchServiceSpanningTree) Association.link(SwitchServiceSpanningTree.class, groupComponent, partComponent);
	}// link

} // Class SwitchServiceSpanningTree
