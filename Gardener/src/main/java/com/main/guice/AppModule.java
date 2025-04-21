package com.main.guice;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        // bind(MyService.class).to(MyServiceImpl.class);
    }
}