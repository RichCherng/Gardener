package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Starting the application...");
        
        SpringApplication.run(DemoApplication.class, args);
        
        System.out.println("Application started successfully.");
    }

    @GetMapping("/")
    public String home() {
        System.out.println("Home endpoint accessed.");
        return "Hello, world!";
    }
}
