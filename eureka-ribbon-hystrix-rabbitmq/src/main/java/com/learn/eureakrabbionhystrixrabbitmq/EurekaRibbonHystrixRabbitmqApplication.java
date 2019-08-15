package com.learn.eureakrabbionhystrixrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/8 11:08
 * @description:
 **/
@SpringCloudApplication
public class EurekaRibbonHystrixRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonHystrixRabbitmqApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
