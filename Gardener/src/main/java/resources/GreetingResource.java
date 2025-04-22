package resources;

import jakarta.inject.Inject;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import service.GreetingService;

@Path("/api/hello")
public class GreetingResource {

    private final GreetingService greetingService;

    @Inject
    public GreetingResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(summary = "Greet someone by name", description = "Returns a hello message")
    public String hello(
        @Parameter(description = "Name to greet") 
        @QueryParam("name") 
        @DefaultValue("World") String name) 
    {
        return greetingService.greet(name);
    }
}