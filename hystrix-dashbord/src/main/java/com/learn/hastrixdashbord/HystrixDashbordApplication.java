package com.learn.hastrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Jerry
 * @Date 2019-08-14 07:31
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbordApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbordApplication.class, args);
    }
}
