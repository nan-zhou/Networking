package org.opennaas.sync.blueprint.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext	context;

	public void start(BundleContext context) throws Exception {
		this.context = context;

	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

	public static BundleContext getBundleContext() {
		return context;
	}

}
