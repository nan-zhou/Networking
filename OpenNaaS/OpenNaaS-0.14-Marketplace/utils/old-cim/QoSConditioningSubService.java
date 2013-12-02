/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class QoSConditioningSubService as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the QoSConditioningSubServiceBean Interface. The CIM class
 * QoSConditioningSubService is described as follows:
 * 
 * A QoSService utilizes underlying ConditioningServices as part of its overall functionality. This is modeled using the QoSConditioningSubService
 * association. Note that a ConditioningService may only be part of a single QoSService - the cardinality on the QoSService reference is Max (1).
 */
public class QoSConditioningSubService extends ServiceComponent implements
		Serializable {

	/**
	 * This constructor creates a QoSConditioningSubServiceBeanImpl Class which implements the QoSConditioningSubServiceBean Interface, and
	 * encapsulates the CIM class QoSConditioningSubService in a Java Bean. The CIM class QoSConditioningSubService is described as follows:
	 * 
	 * A QoSService utilizes underlying ConditioningServices as part of its overall functionality. This is modeled using the QoSConditioningSubService
	 * association. Note that a ConditioningService may only be part of a single QoSService - the cardinality on the QoSService reference is Max (1).
	 */
	public QoSConditioningSubService() {
	};

	/**
	 * This method create an Association of the type QoSConditioningSubService between one QoSService object and ConditioningService object
	 */
	public static QoSConditioningSubService link(QoSService
			groupComponent, ConditioningService partComponent) {

		return (QoSConditioningSubService) Association.link(QoSConditioningSubService.class, groupComponent, partComponent);
	}// link

} // Class QoSConditioningSubService
