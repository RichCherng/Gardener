package com.example;

import com.codahale.metrics.health.HealthCheck;


public class HelloHealthCheck extends HealthCheck {
    
    @Override
    protected Result check() throws Exception {
        // Basic ping check
        return Result.healthy();
    }
}
