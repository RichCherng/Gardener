package com.example.mybackend;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.mybackend.modules.MyGuiceModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.example.mybackend.resources.HelloResource;

public class MyApp extends Application<MyAppConfig> {

    public static void main(String[] args) throws Exception {
        new MyApp().run(args);
    }

    @Override
    public void initialize(Bootstrap<MyAppConfig> bootstrap) {
        // Initialization logic if needed
    }

    @Override
    public void run(MyAppConfig configuration, Environment environment) {

        
        // Set up Guice injector
        Injector injector = Guice.createInjector(new MyGuiceModule());

        // Register resources
        environment.jersey().register(injector.getInstance(HelloResource.class));
    }
}