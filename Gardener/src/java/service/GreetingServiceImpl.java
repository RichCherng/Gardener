package service;

public class GreetingServiceImpl implements GreetingService {
    public String greet(String name) {
        return "Hello, " + name;
    }
}