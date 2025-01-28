package com.example.hellomaven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")

public class SiteResource {

  @GET
  @Path("/health")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getHealth(){
    String health = "I am alive";
    return Response.status(200).entity(health).build();
  }

  @GET
  @Path("{clientName}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response greetClient(@PathParam("clientName") String name) {
    String output = "Hi " + name;
    return Response.status(200).entity(output).build();
  }

}
