package com.mycloud.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${app.property.env}")
    private String propertyEnv;

    public String getPropertyEnv() {
        return propertyEnv;
    }
}
