package com.learn.turbinehttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Jerry
 * @Date 2019-08-14 16:17
 */
@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
public class TurbineHttpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineHttpApplication.class, args);
    }
}
