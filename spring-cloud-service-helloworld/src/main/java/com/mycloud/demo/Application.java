package com.mycloud.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Application.class);

    @Value("${app.property.env}")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(String.format("--------------Environment: %s---------------", env));
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