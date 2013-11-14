package org.devshred.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.devshred.rest.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/greeting")
public class GreetingResource {
	@Autowired
	GreetingService greetingService;

	@GET
	public Response sendGreeting() {
		return Response.status(200).entity(greetingService.greeting()).build();
	}

	@GET
	@Path("/greeting/{name}/")
	public Response sendGreeting(@PathParam("name") final String name) {
		return Response.status(200).entity(greetingService.greeting(name)).build();
	}
}
