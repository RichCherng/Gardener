package com.example;

import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import jakarta.inject.Inject;

@Path("/")
public class FrontEndResource {
    @Inject
    ServletContext servletContext;

    @GET
    @Path("{path:.*}") // Matches all paths
    public Response serveFile(@PathParam("path") String path) {
        InputStream stream = servletContext.getResourceAsStream("/web/" + path);
        if (stream == null) {
            stream = servletContext.getResourceAsStream("/web/index.html");
        }
        return stream != null ? Response.ok(stream).build() : Response.status(404).build();
    }
}
