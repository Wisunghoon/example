package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/home")
    public String home() {
        return "hello world";
    }

    @GetMapping("/home")
    public String home2() {
        return "hello world";
    }
}
