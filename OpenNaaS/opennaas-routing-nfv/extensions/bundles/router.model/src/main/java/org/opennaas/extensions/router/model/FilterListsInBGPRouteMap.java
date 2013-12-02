/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class FilterListsInBGPRouteMap as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the FilterListsInBGPRouteMapBean Interface. The CIM class
 * FilterListsInBGPRouteMap is described as follows:
 * 
 * RouteMaps do not have to use FilterLists, but if they do, this association defines which FilterList is used by a particular RouteMap.
 */
public class FilterListsInBGPRouteMap extends Dependency implements
		Serializable {

	/**
	 * This constructor creates a FilterListsInBGPRouteMapBeanImpl Class which implements the FilterListsInBGPRouteMapBean Interface, and encapsulates
	 * the CIM class FilterListsInBGPRouteMap in a Java Bean. The CIM class FilterListsInBGPRouteMap is described as follows:
	 * 
	 * RouteMaps do not have to use FilterLists, but if they do, this association defines which FilterList is used by a particular RouteMap.
	 */
	public FilterListsInBGPRouteMap() {
	};

	/**
	 * This method create an Association of the type FilterListsInBGPRouteMap between one FilterList object and BGPRouteMap object
	 */
	public static FilterListsInBGPRouteMap link(FilterList
			antecedent, BGPRouteMap dependent) {

		return (FilterListsInBGPRouteMap) Association.link(FilterListsInBGPRouteMap.class, antecedent, dependent);
	}// link

} // Class FilterListsInBGPRouteMap
