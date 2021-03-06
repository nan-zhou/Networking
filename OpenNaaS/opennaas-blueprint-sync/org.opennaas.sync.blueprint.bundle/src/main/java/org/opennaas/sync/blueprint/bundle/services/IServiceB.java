package org.opennaas.sync.blueprint.bundle.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface IServiceB {

	@Path("/sayBye/{name}")
	@GET
	@Consumes(MediaType.APPLICATION_XML)
	public String sayBye(@PathParam("name ") String name);

}
