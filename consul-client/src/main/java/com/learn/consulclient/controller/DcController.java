package com.learn.consulclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jerry
 * @Date 2019-06-13 15:28
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public void dc(){
        String description = "description:"+ discoveryClient.description();
        System.out.println(description);
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);
    }
}
