package com.falmeida.tech.restfulapisample.controller;

import com.falmeida.tech.restfulapisample.controller.beans.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBeanController {

    @GetMapping(path = "/hello-bean")
    public HelloBean helloBean(){
        return new HelloBean("Hello World");
    }

}
