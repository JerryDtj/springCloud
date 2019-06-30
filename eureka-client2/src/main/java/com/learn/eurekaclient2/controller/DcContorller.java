package com.learn.eurekaclient2.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-06-30 14:27
 */
@RestController
public class DcContorller {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String s = "client2 service:" + discoveryClient.getServices();
        return s;
    }
}
