package com.example.mybackend.modules;

import com.google.inject.AbstractModule;
import com.example.mybackend.resources.HelloResource;

public class MyGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloResource.class);
    }
}