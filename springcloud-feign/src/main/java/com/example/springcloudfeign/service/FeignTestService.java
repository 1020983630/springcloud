package com.example.springcloudfeign.service;

import com.example.springcloudfeign.service.impl.FeignTestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client", fallback = FeignTestServiceImpl.class)
public interface FeignTestService {
    @GetMapping("/hello")
    String hello();
}
