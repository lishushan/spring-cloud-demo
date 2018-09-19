package com.mycloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value("${app.property.env}")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return String.format("Hello world! (environment: %s)", env);
    }

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello %s! (environment: %s)", name, env);
    }
}