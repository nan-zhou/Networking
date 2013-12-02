/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SwitchesAmong as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the SwitchesAmongBean Interface. The CIM class SwitchesAmong is described as follows:
 * 
 * A SwitchService switches frames between SwitchPorts. This association makes that relationship explicit.
 */
public class SwitchesAmong extends ForwardsAmong implements Serializable {

	/**
	 * This constructor creates a SwitchesAmongBeanImpl Class which implements the SwitchesAmongBean Interface, and encapsulates the CIM class
	 * SwitchesAmong in a Java Bean. The CIM class SwitchesAmong is described as follows:
	 * 
	 * A SwitchService switches frames between SwitchPorts. This association makes that relationship explicit.
	 */
	public SwitchesAmong() {
	};

	/**
	 * This method create an Association of the type SwitchesAmong between one SwitchPort object and SwitchService object
	 */
	public static SwitchesAmong link(SwitchPort antecedent, SwitchService
			dependent) {

		return (SwitchesAmong) Association.link(SwitchesAmong.class, antecedent, dependent);
	}// link

} // Class SwitchesAmong
