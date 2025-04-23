package myapp;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.inject.hk2.GuiceBridge;
import org.glassfish.jersey.inject.hk2.GuiceIntoHK2Bridge;
import org.glassfish.hk2.api.ServiceLocator;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("myapp");

        register((ServiceLocator locator) -> {
            GuiceBridge.getGuiceBridge().initializeGuiceBridge(locator);
            Injector injector = Guice.createInjector(new GuiceConfig());
            locator.getService(GuiceIntoHK2Bridge.class).bridgeGuiceInjector(injector);
        });
    }
}
