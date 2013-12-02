package org.opennaas.extensions.ofrouting.capability.routing.shell;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.opennaas.core.resources.IResource;
import org.opennaas.core.resources.shell.GenericKarafCommand;
import org.opennaas.extensions.ofrouting.capability.routing.RoutingCapability;

/**
 * 
 * @author josep
 * 
 */
@Command(scope = "routing", name = "deleteRoute", description = "Delete Route to a table.")
public class DeleteRouteCommand extends GenericKarafCommand {

    @Argument(index = 0, name = "resourceType:resourceName", description = "The resource id", required = true, multiValued = false)
    private String resourceName;
    @Argument(index = 1, name = "ipSource", description = "Ip Source.", required = true, multiValued = false)
    private String ipSource;
    @Argument(index = 2, name = "ipDest", description = "Destination IP", required = true, multiValued = false)
    private String ipDest;
    @Argument(index = 3, name = "switchMac", description = "Mac of the Switch", required = true, multiValued = false)
    private String switchMac;
    @Argument(index = 4, name = "inputPort", description = "Input Port of the Switch.", required = true, multiValued = false)
    private int inputPort;
    @Argument(index = 5, name = "outputPort", description = "Output Port of the Switch.", required = true, multiValued = false)
    private int outputPort;

    @Override
    protected Object doExecute() throws Exception {
        printInitCommand("Delete Route");
        try {
            IResource resource = getResourceFromFriendlyName(resourceName);
            RoutingCapability capab = (RoutingCapability) resource.getCapabilityByType("routing");
            capab.deleteRoute(ipSource, ipDest, switchMac, inputPort, outputPort);
            printInfo("Deletting... ");
        } catch (Exception e) {
            printError("Error greeting from resource " + resourceName);
            printError(e);
        } finally {
            printEndCommand();
        }
        printEndCommand();
        return null;
    }
}
