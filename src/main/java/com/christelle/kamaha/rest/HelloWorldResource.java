package com.christelle.kamaha.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("helloworld")
public class HelloWorldResource {

	public static final String CLICHED_MESSAGE = "Hello World!";
    
	
	@Path("/bean/{p}")
	@GET
	@Produces("text/plain")
	public String getHello(@javax.ws.rs.BeanParam  BeanParametre bean) {
		
		return CLICHED_MESSAGE;
	}
}
