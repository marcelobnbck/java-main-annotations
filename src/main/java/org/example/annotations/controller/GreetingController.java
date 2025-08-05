package org.example.annotations.controller;

import org.example.annotations.service.GreetingService;
import com.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @RestController handles HTTP requests.
 */
@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    /**
     * @GetMapping maps GET requests to /api/greet.
     */
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = \"World\") String name) {
            return greetingService.greet(name);
}