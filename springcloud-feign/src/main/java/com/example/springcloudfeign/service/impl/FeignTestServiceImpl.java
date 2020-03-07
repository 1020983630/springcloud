package com.example.springcloudfeign.service.impl;

import com.example.springcloudfeign.service.FeignTestService;
import org.springframework.stereotype.Component;

@Component
public class FeignTestServiceImpl implements FeignTestService {
    @Override
    public String hello() {
        return "server error (feign)";
    }
}
