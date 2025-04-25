package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.inject.Inject;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class MyResource {
    private final MyService service;

    @Inject
    public MyResource(MyService service) {
        this.service = service;
    }

    @GET
    public String hello() {
        return service.getMessage();
    }
}
