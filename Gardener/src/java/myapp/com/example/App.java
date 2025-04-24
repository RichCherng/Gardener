package com.example;

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
    }
}
