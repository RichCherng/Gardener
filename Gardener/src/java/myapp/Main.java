package app;

// import jakarta.ws.rs.core.Application;
// import org.eclipse.jetty.server.Server;
// import org.eclipse.jetty.servlet.ServletContextHandler;
// import org.eclipse.jetty.servlet.ServletHolder;
// import org.glassfish.jersey.inject.hk2.Hk2InjectionBinder;
// import org.glassfish.jersey.server.ResourceConfig;
// import org.glassfish.jersey.servlet.ServletContainer;
// import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
// import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
// import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;
// import org.glassfish.hk2.api.ServiceLocator;

public class Main {
    // public static void main(String[] args) throws Exception {
        // ResourceConfig config = new ResourceConfig()
        //     .packages("com.example.resources")
        //     .register(new Hk2InjectionBinder());

        // ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        // GuiceBridge.getGuiceBridge().initializeGuiceBridge(locator);
        // GuiceIntoHK2Bridge bridge = locator.getService(GuiceIntoHK2Bridge.class);
        // bridge.bridgeGuiceInjector(MyGuiceModule.createInjector());

        // ServletHolder servletHolder = new ServletHolder(new ServletContainer(config));

        // ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        // context.setContextPath("/");
        // context.addServlet(servletHolder, "/*");

        // Server server = new Server(8080);
        // server.setHandler(context);

        // System.out.println("Server started on http://localhost:8080");
        // server.start();
        // server.join();
    // }
}
