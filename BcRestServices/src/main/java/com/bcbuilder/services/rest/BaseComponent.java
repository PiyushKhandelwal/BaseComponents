package com.bcbuilder.services.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path("/bc")
public class BaseComponent {

    @GET
    @Produces("text/plain")
    public String getStatus()
    {
        return "Hello " + System.currentTimeMillis();
    }

}
