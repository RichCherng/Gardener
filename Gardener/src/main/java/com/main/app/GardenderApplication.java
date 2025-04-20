package com.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GardenderApplication {

    public static void main(String[] args) {
        System.out.println("Starting the application...");
        
        SpringApplication.run(GardenderApplication.class, args);
        
        System.out.println("Application started successfully.");
    }

    @GetMapping("/")
    public String home() {
        System.out.println("Home endpoint accessed.");
        return "Hello, world!";
    }
}
