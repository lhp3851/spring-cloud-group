package com.lhp.regsiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegsiterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegsiterApplication.class, args);
    }
}
