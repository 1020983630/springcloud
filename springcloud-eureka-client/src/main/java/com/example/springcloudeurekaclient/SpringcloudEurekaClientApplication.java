package com.example.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringcloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "hello, client from port: " + port;
    }
}
