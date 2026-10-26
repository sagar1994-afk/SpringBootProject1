package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
<<<<<<< HEAD
    	System.out.println("test----ooo1111");
=======
    	System.out.println("test----oooewewewewe");
>>>>>>> 220af5d (Update greeting controller)
        return "Hello from Spring Boot on Java 8!";
    }
}
