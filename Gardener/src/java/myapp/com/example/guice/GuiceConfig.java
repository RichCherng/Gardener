package com.example.guice;

import com.example.MyResource;
import com.example.MyService;
import com.example.MyServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GuiceConfig extends AbstractModule {
    @Override
    protected void configure() {
        // Bind your services and other dependencies here
        bind(MyService.class).to(MyServiceImpl.class);
    }

    @Provides
    public MyResource getMyResource(MyService myService) {
        return new MyResource(myService);
    }
    
}
