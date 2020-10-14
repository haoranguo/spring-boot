package com.guo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Hello {

    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }
}