package config;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.info.Info;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/")
public class SwaggerApp extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        SwaggerConfiguration config = new SwaggerConfiguration()
            .openAPI(new io.swagger.v3.oas.models.OpenAPI()
                .info(new Info().title("Gardener API").version("1.0")));

        OpenApiResource openApiResource = new OpenApiResource();
        openApiResource.setOpenApiConfiguration(config);

        return Set.of(OpenApiResource.class);
    }
}