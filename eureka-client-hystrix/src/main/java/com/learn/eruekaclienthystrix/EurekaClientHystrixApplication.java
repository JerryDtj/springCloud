package com.learn.eruekaclienthystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/8 11:45
 * @description:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHystrixApplication.class,args);
    }
}
