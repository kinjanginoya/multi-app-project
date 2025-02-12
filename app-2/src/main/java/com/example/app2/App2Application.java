package com.example.app2;

import com.example.app2.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class App2Application {
    public static void main(String[] args) {
        SpringApplication.run(App2Application.class, args);
    }
}

