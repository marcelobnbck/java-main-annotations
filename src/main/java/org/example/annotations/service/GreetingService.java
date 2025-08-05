package org.example.annotations.service;

import org.springframework.stereotype.Service;

/**
 * @Service marks this class as a service component for business logic.
 */
@Service
public class GreetingService {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}