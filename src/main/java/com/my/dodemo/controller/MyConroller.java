package com.my.dodemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConroller {
    @GetMapping("/api/v1/test")
    public String getData(){
        return "Testing";
    }
}
