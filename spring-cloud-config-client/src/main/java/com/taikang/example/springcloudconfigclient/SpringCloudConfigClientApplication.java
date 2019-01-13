package com.taikang.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableCircuitBreaker
public class SpringCloudConfigClientApplication {
    @Value("${name: hello}")
    private String name;
    @Value("${age: 30}")
    private int age;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }


    @RequestMapping("/hello")
    public String getInf() {
        return "name:" + name + ",age:" + age;
    }

}

