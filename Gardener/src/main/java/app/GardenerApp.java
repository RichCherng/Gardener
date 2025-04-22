package app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import config.AppModule;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import resources.GreetingResource;

public class GardenerApp {
    public static void main(String[] args) throws Exception {
        boolean isDev = true; // Set to false in production

        // Guice injector
        Injector injector = Guice.createInjector(new AppModule());

        // Jersey config
        ResourceConfig config = new ResourceConfig();
        config.packages("resources");
        config.register(OpenApiResource.class);
        config.register(injector.getInstance(GreetingResource.class));

        ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(config));
        jerseyServlet.setInitOrder(0);

        // Jersey context handler
        ServletContextHandler apiContext = new ServletContextHandler();
        apiContext.setContextPath("/");
        apiContext.addServlet(jerseyServlet, "/*");

        // Swagger UI ResourceHandler (DEV only)
        HandlerCollection handlers = new HandlerCollection();
        handlers.addHandler(apiContext);

        if (isDev) {
            ResourceHandler swaggerStaticHandler = new ResourceHandler();
            swaggerStaticHandler.setDirectoriesListed(true);
            swaggerStaticHandler.setWelcomeFiles(new String[]{"index.html"});
            swaggerStaticHandler.setResourceBase("src/main/resources/swagger-ui");

            ContextHandler staticContext = new ContextHandler("/swagger-ui");
            staticContext.setHandler(swaggerStaticHandler);

            handlers.addHandler(staticContext);

            System.out.println("[DEV] Serving Swagger UI from: " + swaggerStaticHandler.getResourceBase());
        }

        Server server = new Server(8080);
        server.setHandler(handlers);
        server.start();
        server.join();
    }
}
