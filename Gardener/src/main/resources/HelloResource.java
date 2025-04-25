package resources;

import com.example.MyService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    MyService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return service.greet();
    }
}
