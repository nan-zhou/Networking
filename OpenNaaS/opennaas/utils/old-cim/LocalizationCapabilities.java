/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class LocalizationCapabilities as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the LocalizationCapabilitiesBean Interface. The CIM class
 * LocalizationCapabilities is described as follows:
 * 
 * This class is being deprecated to avoid conflicts with localization implementations using CIM/XML over HTTP protocol, the preferred mechanism.
 * Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
 */
@Deprecated
public class LocalizationCapabilities extends Capabilities implements
		Serializable {

	/**
	 * This constructor creates a LocalizationCapabilitiesBeanImpl Class which implements the LocalizationCapabilitiesBean Interface, and encapsulates
	 * the CIM class LocalizationCapabilities in a Java Bean. The CIM class LocalizationCapabilities is described as follows:
	 * 
	 * This class is being deprecated to avoid conflicts with localization implementations using CIM/XML over HTTP protocol, the preferred mechanism.
	 * Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
	 */
	public LocalizationCapabilities() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property supportedInputLocales.
	 */
	@Deprecated
	private String[]	supportedInputLocales;

	/**
	 * This method returns the LocalizationCapabilities.supportedInputLocales property value. This property is described as follows:
	 * 
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. A
	 * locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose
	 * entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the
	 * ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. The
	 * SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default
	 * locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the
	 * default locale is en_US (English). Each array entry consists of three sub-strings, separated by underscores: - The first sub-string is the
	 * language code, as specified in ISO639. - The second sub-string is the country code, as specified in ISO3166. - The third sub-string is a
	 * variant, which is vendor specific. For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows
	 * browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily
	 * recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. The language and country codes are required; the variant may
	 * be empty.
	 * 
	 * @return String[] current supportedInputLocales property value
	 * @exception Exception
	 */
	@Deprecated
	public String[] getSupportedInputLocales() {

		return this.supportedInputLocales;
	} // getSupportedInputLocales

	/**
	 * This method sets the LocalizationCapabilities.supportedInputLocales property value. This property is described as follows:
	 * 
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. A
	 * locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose
	 * entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the
	 * ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. The
	 * SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default
	 * locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the
	 * default locale is en_US (English). Each array entry consists of three sub-strings, separated by underscores: - The first sub-string is the
	 * language code, as specified in ISO639. - The second sub-string is the country code, as specified in ISO3166. - The third sub-string is a
	 * variant, which is vendor specific. For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows
	 * browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily
	 * recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. The language and country codes are required; the variant may
	 * be empty.
	 * 
	 * @param String
	 *            [] new supportedInputLocales property value
	 * @exception Exception
	 */
	@Deprecated
	public void setSupportedInputLocales(String[] supportedInputLocales) {

		this.supportedInputLocales = supportedInputLocales;
	} // setSupportedInputLocales

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property supportedOutputLocales.
	 */
	@Deprecated
	private String[]	supportedOutputLocales;

	/**
	 * This method returns the LocalizationCapabilities.supportedOutputLocales property value. This property is described as follows:
	 * 
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. A
	 * locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose
	 * entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be
	 * defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note
	 * that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be
	 * returned in each language specified, and indicated as supported by this Capabilities instance. The SupportedOutputLocales property publishes an
	 * element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated
	 * with the ManagedElement). If the SupportedOutput Locales property is empty, it is assumed that the default locale is en_US (English). Each
	 * array entry consists of three sub-strings, separated by underscores: - The first sub-string is the language code, as specified in ISO639. - The
	 * second sub-string is the country code, as specified in ISO3166. - The third sub-string is a variant, which is vendor specific. For example, US
	 * English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant
	 * is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in
	 * standard environments. The language and country codes are required; the variant may be empty.
	 * 
	 * @return String[] current supportedOutputLocales property value
	 * @exception Exception
	 */
	@Deprecated
	public String[] getSupportedOutputLocales() {

		return this.supportedOutputLocales;
	} // getSupportedOutputLocales

	/**
	 * This method sets the LocalizationCapabilities.supportedOutputLocales property value. This property is described as follows:
	 * 
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. A
	 * locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose
	 * entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be
	 * defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note
	 * that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be
	 * returned in each language specified, and indicated as supported by this Capabilities instance. The SupportedOutputLocales property publishes an
	 * element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated
	 * with the ManagedElement). If the SupportedOutput Locales property is empty, it is assumed that the default locale is en_US (English). Each
	 * array entry consists of three sub-strings, separated by underscores: - The first sub-string is the language code, as specified in ISO639. - The
	 * second sub-string is the country code, as specified in ISO3166. - The third sub-string is a variant, which is vendor specific. For example, US
	 * English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant
	 * is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in
	 * standard environments. The language and country codes are required; the variant may be empty.
	 * 
	 * @param String
	 *            [] new supportedOutputLocales property value
	 * @exception Exception
	 */
	@Deprecated
	public void setSupportedOutputLocales(String[] supportedOutputLocales) {

		this.supportedOutputLocales = supportedOutputLocales;
	} // setSupportedOutputLocales

} // Class LocalizationCapabilities
