package org.opennaas.sync.blueprint.bundle.services;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.opennaas.sync.blueprint.bundle.Activator;

public class AbstractService {

	private static Log	log	= LogFactory.getLog(AbstractService.class);

	protected String	url	= "/opennaas";

	protected void registerOSGiService(String className, String path) {
		Dictionary<String, String> props = new Hashtable<String, String>();

		if (props != null) {
			props.put("service.exported.interfaces", "*");
			props.put("service.exported.configs", "org.apache.cxf.rs");
			props.put("service.exported.intents", "HTTP");
			props.put("org.apache.cxf.rs.httpservice.context", this.url + "/" + path);
			props.put("org.apache.cxf.rs.address", "/");
		}
		log.info("Registering ws in url: " + props.get("org.apache.cxf.rs.httpservice.context"));
		Activator.getBundleContext().registerService(className, this, props);
	}
}
