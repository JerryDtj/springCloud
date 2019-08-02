package com.learn.feignuploadclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Jerry
 * @Date 2019-08-02 08:15
 */
@EnableFeignClients
@SpringBootApplication
public class FeignUploadClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUploadClientApplication.class, args);
    }
}
