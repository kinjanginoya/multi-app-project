package com.example.app1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    @GetMapping("/app1")
    public String hello(){
        return "hello from app1";
    }
}
