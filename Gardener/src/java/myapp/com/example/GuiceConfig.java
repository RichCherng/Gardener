package com.example;

import com.google.inject.AbstractModule;

public class GuiceConfig extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageService.class).toInstance(() -> "Hello from Guice!");
    }
}
