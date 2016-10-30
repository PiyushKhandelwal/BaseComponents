package com.bc.basecomponents.rest;

import com.bc.basecomponents.services.BaseService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("/bc")
public class BaseComponent {

    @Inject
    private BaseService baseService;

    @GET
    @Produces("text/plain")
    @Path("/{name}")
    public String getStatus(@PathParam("name") String name)
    {
        return baseService.sayHello(name);
    }

}
