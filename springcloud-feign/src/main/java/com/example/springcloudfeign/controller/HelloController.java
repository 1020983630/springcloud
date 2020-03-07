package com.example.springcloudfeign.controller;

import com.example.springcloudfeign.service.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private FeignTestService feignTestService;

    @GetMapping("/hello")
    public String hello() {
        return feignTestService.hello();
    }
}
