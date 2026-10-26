package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
    	System.out.println("test----ooo");
        return "Hello from Spring Boot on Java 8!";
    }
}
