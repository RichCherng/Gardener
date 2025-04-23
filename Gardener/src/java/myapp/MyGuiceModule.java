package app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MyGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyService.class).toInstance(new MyService());
    }

    public static Injector createInjector() {
        return Guice.createInjector(new MyGuiceModule());
    }
}
