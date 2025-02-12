package com.example.app2.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @Value("${app.configValue}")
    private String configValue;

    @GetMapping("/app2")
    public String hello(){
        return ("hello from app2"+configValue);
    }
}
