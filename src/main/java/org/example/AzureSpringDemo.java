package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringDemo {

    @GetMapping("/message")
    public String message() {
        return "Hello World, Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringDemo.class, args);
       // System.out.println("Hello world!");
    }
}
