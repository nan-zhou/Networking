package org.opennaas.sync.blueprint.bundle.services;

public class ServiceB extends AbstractService implements IServiceB {

	private static final String	path	= "serviceB";

	public void init() {
		registerOSGiService(IServiceB.class.getName(), path);
	}

	public String sayBye(String name) {
		return "Bye " + name;

	}

}
