package com.example.app2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @GetMapping("/app2")
    public String hello(){
        return "hello from app2";
    }
}
