package com.bc.basecomponents.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("/bc")
public class BaseComponent {

    @GET
    @Produces("text/plain")
    @Path("/{name}")
    public String getStatus(@PathParam("name") String param)
    {
        return "Hello " + param;
    }

}
