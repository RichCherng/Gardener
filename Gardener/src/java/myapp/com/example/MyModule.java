package com.example;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyService.class).to(MyServiceImpl.class);
        bind(MyResource.class); // Resource gets injected
    }
}
