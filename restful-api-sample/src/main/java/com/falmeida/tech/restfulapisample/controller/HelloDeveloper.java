package com.falmeida.tech.restfulapisample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDeveloper {

    @GetMapping(path = "/hello-developer")
    public String helloDeveloper(){
        return "Hello Developer";
    }

}
