package app;


import com.google.inject.Guice;
import com.google.inject.Injector;
import config.AppModule;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.ws.rs.*;
import javax.servlet.http.HttpServlet;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector(new AppModule());

        ResourceConfig config = new ResourceConfig();
        config.register(injector.getInstance(resources.GreetingResource.class));

        ServletHolder servlet = new ServletHolder(new ServletContainer(config));
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(server, "/");
        context.addServlet(servlet, "/*");

        server.start();
        server.join();
    }
}