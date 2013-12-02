package org.opennaas.sync.blueprint.bundle.services;

public class ServiceA extends AbstractService implements IServiceA {

	private static final String	path	= "serviceA";

	public void init() {
		registerOSGiService(IServiceA.class.getName(), path);
	}

	public String sayHello(String name) {

		return "Hello " + name;

	}

}
