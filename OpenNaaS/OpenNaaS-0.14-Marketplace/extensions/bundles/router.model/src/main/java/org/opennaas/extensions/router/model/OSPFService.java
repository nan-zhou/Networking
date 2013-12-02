/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class OSPFService as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the OSPFServiceBean Interface. The CIM class OSPFService is described as follows:
 * 
 * This class is used to represent the basic operation of OSPF. It is derived from the RouteCalculationService, the superclass of all routing
 * protocols.
 */
@XmlRootElement
public class OSPFService extends RouteCalculationService implements
		Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -8149792005737519557L;

	/* OSPFServiceConfiguration */
	/**
	 * @return list of OSPFAreaConfiguration associated to this OSPFService through OSPFServiceConfiguration dependency.
	 */
	public List<OSPFAreaConfiguration> getOSPFAreaConfiguration() {
		return (List<OSPFAreaConfiguration>) this.getToAssociatedElementsByType(OSPFServiceConfiguration.class);
	}

	/**
	 * Associates areaConfig to this OSPFService through OSPFServiceConfiguration dependency.
	 * 
	 * @param areaConfig
	 * @return
	 */
	public boolean addOSPFAreaConfiguration(OSPFAreaConfiguration areaConfig) {
		if (areaConfig == null)
			return false;
		return (OSPFServiceConfiguration.link(this, areaConfig) != null);
	}

	/**
	 * Remove OSPFServiceConfiguration association between areaConfig and this OSPFService, if present.
	 * 
	 * @param areaConfig
	 * @return
	 */
	public boolean removeOSPFAreaConfiguration(OSPFAreaConfiguration areaConfig) {
		if (areaConfig == null)
			return false;

		Association a = this.getFirstToAssociationByTypeAndElement(OSPFServiceConfiguration.class, areaConfig);
		if (a == null)
			return false;

		a.unlink();
		return true;
	}

	/**
	 * This constructor creates a OSPFServiceBeanImpl Class which implements the OSPFServiceBean Interface, and encapsulates the CIM class OSPFService
	 * in a Java Bean. The CIM class OSPFService is described as follows:
	 * 
	 * This class is used to represent the basic operation of OSPF. It is derived from the RouteCalculationService, the superclass of all routing
	 * protocols.
	 */
	public OSPFService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property runningMOSPF.
	 */
	private boolean	runningMOSPF;

	/**
	 * This method returns the OSPFService.runningMOSPF property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router is running MOSPF (multicast enhancements to OSPF) or not, see B.1 in RFC 1584. This attribute only
	 * can be true, when the SupportMOSPF property in OSPFService Capabilities is also true. If SupportMOSPF is false, then this property has no
	 * meaning.
	 * 
	 * @return boolean current runningMOSPF property value
	 * @exception Exception
	 */
	public boolean isRunningMOSPF() {

		return this.runningMOSPF;
	} // getRunningMOSPF

	/**
	 * This method sets the OSPFService.runningMOSPF property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router is running MOSPF (multicast enhancements to OSPF) or not, see B.1 in RFC 1584. This attribute only
	 * can be true, when the SupportMOSPF property in OSPFService Capabilities is also true. If SupportMOSPF is false, then this property has no
	 * meaning.
	 * 
	 * @param boolean new runningMOSPF property value
	 * @exception Exception
	 */
	public void setRunningMOSPF(boolean runningMOSPF) {

		this.runningMOSPF = runningMOSPF;
	} // setRunningMOSPF

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property isInterAreaMulticastForwarder.
	 */
	private boolean	isInterAreaMulticastForwarder;

	/**
	 * This method returns the OSPFService.isInterAreaMulticastForwarder property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router will forward multicast datagrams between OSPF areas or not, see B.1 in RFC 1584.
	 * 
	 * @return boolean current isInterAreaMulticastForwarder property value
	 * @exception Exception
	 */
	public boolean isIsInterAreaMulticastForwarder() {

		return this.isInterAreaMulticastForwarder;
	} // getIsInterAreaMulticastForwarder

	/**
	 * This method sets the OSPFService.isInterAreaMulticastForwarder property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router will forward multicast datagrams between OSPF areas or not, see B.1 in RFC 1584.
	 * 
	 * @param boolean new isInterAreaMulticastForwarder property value
	 * @exception Exception
	 */
	public void setIsInterAreaMulticastForwarder(boolean
			isInterAreaMulticastForwarder) {

		this.isInterAreaMulticastForwarder = isInterAreaMulticastForwarder;
	} // setIsInterAreaMulticastForwarder

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property isInterAsMulticastForwarder.
	 */
	private boolean	isInterAsMulticastForwarder;

	/**
	 * This method returns the OSPFService.isInterAsMulticastForwarder property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router will forward multicast datagrams between Autonomous Systems or not, see B.1 in RFC 1584.
	 * 
	 * @return boolean current isInterAsMulticastForwarder property value
	 * @exception Exception
	 */
	public boolean isIsInterAsMulticastForwarder() {

		return this.isInterAsMulticastForwarder;
	} // getIsInterAsMulticastForwarder

	/**
	 * This method sets the OSPFService.isInterAsMulticastForwarder property value. This property is described as follows:
	 * 
	 * This attribute indicates whether this router will forward multicast datagrams between Autonomous Systems or not, see B.1 in RFC 1584.
	 * 
	 * @param boolean new isInterAsMulticastForwarder property value
	 * @exception Exception
	 */
	public void setIsInterAsMulticastForwarder(boolean
			isInterAsMulticastForwarder) {

		this.isInterAsMulticastForwarder = isInterAsMulticastForwarder;
	} // setIsInterAsMulticastForwarder

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property exitOverflowInterval.
	 */
	private long	exitOverflowInterval;

	/**
	 * This method returns the OSPFService.exitOverflowInterval property value. This property is described as follows:
	 * 
	 * The number of seconds that, after entering OverflowState, a router will attempt to leave OverflowState. When set to 0, the router will not
	 * leave OverflowState until restarted, see 2.1 in RFC 1765.
	 * 
	 * @return long current exitOverflowInterval property value
	 * @exception Exception
	 */
	public long getExitOverflowInterval() {

		return this.exitOverflowInterval;
	} // getExitOverflowInterval

	/**
	 * This method sets the OSPFService.exitOverflowInterval property value. This property is described as follows:
	 * 
	 * The number of seconds that, after entering OverflowState, a router will attempt to leave OverflowState. When set to 0, the router will not
	 * leave OverflowState until restarted, see 2.1 in RFC 1765.
	 * 
	 * @param long new exitOverflowInterval property value
	 * @exception Exception
	 */
	public void setExitOverflowInterval(long exitOverflowInterval) {

		this.exitOverflowInterval = exitOverflowInterval;
	} // setExitOverflowInterval

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property rFC1583Compatibility.
	 */
	private boolean	rFC1583Compatibility;

	/**
	 * This method returns the OSPFService.rFC1583Compatibility property value. This property is described as follows:
	 * 
	 * Controls the preference rules used in choosing among multiple AS-external-LSAs advertising the same destination. When set to TRUE, the
	 * preference rules remain those specified by RFC 1583. When set to FALSE, the preference rules are those stated in RFC 2328, which prevent
	 * routing loops when AS-external-LSAs for the same destination have been originated from different areas. See C.1 in RFC2328.
	 * 
	 * @return boolean current rFC1583Compatibility property value
	 * @exception Exception
	 */
	public boolean isRFC1583Compatibility() {

		return this.rFC1583Compatibility;
	} // getRFC1583Compatibility

	/**
	 * This method sets the OSPFService.rFC1583Compatibility property value. This property is described as follows:
	 * 
	 * Controls the preference rules used in choosing among multiple AS-external-LSAs advertising the same destination. When set to TRUE, the
	 * preference rules remain those specified by RFC 1583. When set to FALSE, the preference rules are those stated in RFC 2328, which prevent
	 * routing loops when AS-external-LSAs for the same destination have been originated from different areas. See C.1 in RFC2328.
	 * 
	 * @param boolean new rFC1583Compatibility property value
	 * @exception Exception
	 */
	public void setRFC1583Compatibility(boolean rFC1583Compatibility) {

		this.rFC1583Compatibility = rFC1583Compatibility;
	} // setRFC1583Compatibility

} // Class OSPFService
