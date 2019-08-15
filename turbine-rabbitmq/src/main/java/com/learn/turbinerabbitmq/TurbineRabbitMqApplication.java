package com.learn.turbinerabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.netflix.turbine.stream.TurbineApplication;

/**
 * @author Jerry
 * @Date 2019-08-15 07:19
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream

public class TurbineRabbitMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineRabbitMqApplication.class, args);
    }
}
