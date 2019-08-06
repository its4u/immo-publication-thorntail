package com.its4u.immo.publication.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("application/json")
	@Operation(summary="Greet the world")
	public Response doGet() {
		return Response.ok(new HelloWorld("Hello from Thorntail!")).build();
	}
}
