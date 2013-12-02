/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class NetworkPipeComposition as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the NetworkPipeCompositionBean Interface. The CIM class NetworkPipeComposition
 * is described as follows:
 * 
 * NetworkPipeComposition describes the makeup a pipe, based on lower-level ones. If the pipe is not composed of lower-level entities (i.e., its
 * AggregationBehavior property is set to 2), then no instances of this association should be defined where the pipe has the role of GroupComponent.
 * In the context of M.3100, this semantic is modeled as a Trail that is made up of one or more Connections. Both Trails and Connections are
 * subclasses of M.3100's Pipe. Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass NetworkPipe, as was
 * done in M.3100, but merely to instantiate this association to describe the bundling of the lower-level pipes (connections), or the sequencing of
 * them. How the lower-level pipes are aggregated is described by the property, AggregationBehavior, of NetworkPipe. If the pipes are combined in a
 * sequence, the ordering is conveyed via the property, AggregationSequence, on this association.
 */
public class NetworkPipeComposition extends Component implements Serializable
{

	/**
	 * This constructor creates a NetworkPipeCompositionBeanImpl Class which implements the NetworkPipeCompositionBean Interface, and encapsulates the
	 * CIM class NetworkPipeComposition in a Java Bean. The CIM class NetworkPipeComposition is described as follows:
	 * 
	 * NetworkPipeComposition describes the makeup a pipe, based on lower-level ones. If the pipe is not composed of lower-level entities (i.e., its
	 * AggregationBehavior property is set to 2), then no instances of this association should be defined where the pipe has the role of
	 * GroupComponent. In the context of M.3100, this semantic is modeled as a Trail that is made up of one or more Connections. Both Trails and
	 * Connections are subclasses of M.3100's Pipe. Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass
	 * NetworkPipe, as was done in M.3100, but merely to instantiate this association to describe the bundling of the lower-level pipes (connections),
	 * or the sequencing of them. How the lower-level pipes are aggregated is described by the property, AggregationBehavior, of NetworkPipe. If the
	 * pipes are combined in a sequence, the ordering is conveyed via the property, AggregationSequence, on this association.
	 */
	public NetworkPipeComposition() {
	};

	/**
	 * This method create an Association of the type NetworkPipeComposition between one NetworkPipe object and NetworkPipe object
	 */
	public static NetworkPipeComposition link(NetworkPipe
			groupComponent, NetworkPipe partComponent) {

		return (NetworkPipeComposition) Association.link(NetworkPipeComposition.class, groupComponent, partComponent);
	}// link

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property aggregationSequence.
	 */
	private int	aggregationSequence;

	/**
	 * This method returns the NetworkPipeComposition.aggregationSequence property value. This property is described as follows:
	 * 
	 * Indicates the ordering of the PartComponent pipes in the GroupComponent. If the AggregationBehavior property of the GroupComponent pipe is set
	 * to 0 or 3 ("Unknown" or "Combined In Parallel"), then this property MUST be set to 0. If the AggregationBehavior is set to 4
	 * ("Combined In Sequence"), then this property SHOULD indicate the ordering of the component pipes. Ordering starts with 1 and larger numbers
	 * indicate subsequent pipes. The numbering does not have to be in sequence. The word SHOULD is used in this Description, since the specific
	 * ordering of all the component pipes may not be known. In these cases, a value of 0 would be placed in AggregationSequence to indicate that
	 * ordering information is not available.
	 * 
	 * @return int current aggregationSequence property value
	 * @exception Exception
	 */
	public int getAggregationSequence() {

		return this.aggregationSequence;
	} // getAggregationSequence

	/**
	 * This method sets the NetworkPipeComposition.aggregationSequence property value. This property is described as follows:
	 * 
	 * Indicates the ordering of the PartComponent pipes in the GroupComponent. If the AggregationBehavior property of the GroupComponent pipe is set
	 * to 0 or 3 ("Unknown" or "Combined In Parallel"), then this property MUST be set to 0. If the AggregationBehavior is set to 4
	 * ("Combined In Sequence"), then this property SHOULD indicate the ordering of the component pipes. Ordering starts with 1 and larger numbers
	 * indicate subsequent pipes. The numbering does not have to be in sequence. The word SHOULD is used in this Description, since the specific
	 * ordering of all the component pipes may not be known. In these cases, a value of 0 would be placed in AggregationSequence to indicate that
	 * ordering information is not available.
	 * 
	 * @param int new aggregationSequence property value
	 * @exception Exception
	 */
	public void setAggregationSequence(int aggregationSequence) {

		this.aggregationSequence = aggregationSequence;
	} // setAggregationSequence

} // Class NetworkPipeComposition
