package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/book")
    public String home(){
        return "Welcome to Spring Boot on AWS EC2 Instance TestEnv3";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
