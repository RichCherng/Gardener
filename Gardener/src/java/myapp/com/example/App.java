package com.example;

import com.example.guice.GuiceConfig;
import com.google.inject.Guice;
import com.google.inject.Injector;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<MyConfig> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void initialize(Bootstrap<MyConfig> bootstrap) {}

    @Override
    public void run(MyConfig config, Environment environment) {
        System.out.println("Hello Dropwizard!");

        Injector injector = Guice.createInjector(new GuiceConfig());

        MyResource myResource = injector.getInstance(MyResource.class);


        environment.jersey().register(myResource);

        environment.jersey().register(new MyResource(injector.getInstance(MyService.class)));

        // environment.jersey().register(new MyResource(new MyServiceImpl()));

        HelloHealthCheck healthCheck = new HelloHealthCheck();
        environment.healthChecks().register("hello", healthCheck);

    }
}
