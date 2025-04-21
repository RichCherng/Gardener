package com.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServer;
import org.springframework.web.bind.annotation.*;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.main.guice.AppModule;

@SpringBootApplication
@RestController
public class GardenderApplication {

    public static void main(String[] args) {
        System.out.println("Starting the application...");

        // 1. Configure Guice DI
        Injector injector = Guice.createInjector(new AppModule());
        
        SpringApplication.run(GardenderApplication.class, args);
        
        // System.out.println("Application started successfully.");
    }

    @GetMapping("/")
    public String home() {
        System.out.println("Home endpoint accessed.");
        return "Hello, world!";
    }
}
