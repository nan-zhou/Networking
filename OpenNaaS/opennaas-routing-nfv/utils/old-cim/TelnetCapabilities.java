/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class TelnetCapabilities as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the TelnetCapabilitiesBean Interface. The CIM class TelnetCapabilities is described
 * as follows:
 * 
 * A subclass of ProtocolServiceCapabilities that defines the capabilities of a Telnet Service. An instance of TelnetCapabilities is associated with
 * the ProtocolService using ElementCapabilities.
 */
public class TelnetCapabilities extends ProtocolServiceCapabilities implements
		Serializable {

	/**
	 * This constructor creates a TelnetCapabilitiesBeanImpl Class which implements the TelnetCapabilitiesBean Interface, and encapsulates the CIM
	 * class TelnetCapabilities in a Java Bean. The CIM class TelnetCapabilities is described as follows:
	 * 
	 * A subclass of ProtocolServiceCapabilities that defines the capabilities of a Telnet Service. An instance of TelnetCapabilities is associated
	 * with the ProtocolService using ElementCapabilities.
	 */
	public TelnetCapabilities() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property SupportedTerminalModes.
	 */

	public enum SupportedTerminalModes {
		UNKNOWN,
		OTHER,
		VT100,
		ANSI,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private SupportedTerminalModes	supportedTerminalModes;

	/**
	 * This method returns the TelnetCapabilities.supportedTerminalModes property value. This property is described as follows:
	 * 
	 * An array of integers indicating the terminal modes that the service supports.
	 * 
	 * @return int current supportedTerminalModes property value
	 * @exception Exception
	 */
	public SupportedTerminalModes getSupportedTerminalModes() {

		return this.supportedTerminalModes;
	} // getSupportedTerminalModes

	/**
	 * This method sets the TelnetCapabilities.supportedTerminalModes property value. This property is described as follows:
	 * 
	 * An array of integers indicating the terminal modes that the service supports.
	 * 
	 * @param int new supportedTerminalModes property value
	 * @exception Exception
	 */
	public void setSupportedTerminalModes(SupportedTerminalModes
			supportedTerminalModes) {

		this.supportedTerminalModes = supportedTerminalModes;
	} // setSupportedTerminalModes

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherSupportedTerminalMode.
	 */
	private String[]	otherSupportedTerminalMode;

	/**
	 * This method returns the TelnetCapabilities.otherSupportedTerminalMode property value. This property is described as follows:
	 * 
	 * If the SupportedTerminalModes property is set to 1, "Other" then free form string providing more information about supported terminal modes. If
	 * not set to 1, this string has no meaning.
	 * 
	 * @return String[] current otherSupportedTerminalMode property value
	 * @exception Exception
	 */
	public String[] getOtherSupportedTerminalMode() {

		return this.otherSupportedTerminalMode;
	} // getOtherSupportedTerminalMode

	/**
	 * This method sets the TelnetCapabilities.otherSupportedTerminalMode property value. This property is described as follows:
	 * 
	 * If the SupportedTerminalModes property is set to 1, "Other" then free form string providing more information about supported terminal modes. If
	 * not set to 1, this string has no meaning.
	 * 
	 * @param String
	 *            [] new otherSupportedTerminalMode property value
	 * @exception Exception
	 */
	public void setOtherSupportedTerminalMode(String[]
			otherSupportedTerminalMode) {

		this.otherSupportedTerminalMode = otherSupportedTerminalMode;
	} // setOtherSupportedTerminalMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property SupportedCharacterDisplayModes.
	 */

	public enum SupportedCharacterDisplayModes {
		UNKNOWN,
		OTHER,
		CONSOLE,
		STREAM,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private SupportedCharacterDisplayModes	supportedCharacterDisplayModes;

	/**
	 * This method returns the TelnetCapabilities.supportedCharacterDisplayModes property value. This property is described as follows:
	 * 
	 * An array of integers indicating the Character display modes supported by the service.
	 * 
	 * @return int current supportedCharacterDisplayModes property value
	 * @exception Exception
	 */
	public SupportedCharacterDisplayModes
			getSupportedCharacterDisplayModes() {

		return this.supportedCharacterDisplayModes;
	} // getSupportedCharacterDisplayModes

	/**
	 * This method sets the TelnetCapabilities.supportedCharacterDisplayModes property value. This property is described as follows:
	 * 
	 * An array of integers indicating the Character display modes supported by the service.
	 * 
	 * @param int new supportedCharacterDisplayModes property value
	 * @exception Exception
	 */
	public void
			setSupportedCharacterDisplayModes(SupportedCharacterDisplayModes
					supportedCharacterDisplayModes) {

		this.supportedCharacterDisplayModes = supportedCharacterDisplayModes;
	} // setSupportedCharacterDisplayModes

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherSupportedCharacterDisplayMode.
	 */
	private String[]	otherSupportedCharacterDisplayMode;

	/**
	 * This method returns the TelnetCapabilities.otherSupportedCharacterDisplayMode property value. This property is described as follows:
	 * 
	 * If the SupportedCharacterDisplayModes property is set to 1 "Other" then free form string providing more information about the supported modes.
	 * If not set to 1, this string has no meaning.
	 * 
	 * @return String[] current otherSupportedCharacterDisplayMode property value
	 * @exception Exception
	 */
	public String[] getOtherSupportedCharacterDisplayMode() {

		return this.otherSupportedCharacterDisplayMode;
	} // getOtherSupportedCharacterDisplayMode

	/**
	 * This method sets the TelnetCapabilities.otherSupportedCharacterDisplayMode property value. This property is described as follows:
	 * 
	 * If the SupportedCharacterDisplayModes property is set to 1 "Other" then free form string providing more information about the supported modes.
	 * If not set to 1, this string has no meaning.
	 * 
	 * @param String
	 *            [] new otherSupportedCharacterDisplayMode property value
	 * @exception Exception
	 */
	public void setOtherSupportedCharacterDisplayMode(String[]
			otherSupportedCharacterDisplayMode) {

		this.otherSupportedCharacterDisplayMode =
				otherSupportedCharacterDisplayMode;
	} // setOtherSupportedCharacterDisplayMode

} // Class TelnetCapabilities
