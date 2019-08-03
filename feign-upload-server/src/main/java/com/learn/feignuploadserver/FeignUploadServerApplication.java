package com.learn.feignuploadserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jerry
 */

@EnableDiscoveryClient
@SpringBootApplication
public class FeignUploadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUploadServerApplication.class, args);
    }

}
