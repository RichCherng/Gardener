package config;

import com.google.inject.AbstractModule;
import service.*;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(GreetingService.class).to(GreetingServiceImpl.class);
    }
}