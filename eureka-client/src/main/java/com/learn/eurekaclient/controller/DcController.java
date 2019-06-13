package com.learn.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jerry
 * @Date 2019-06-12 18:47
 */
@Controller
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String s = "service:" +discoveryClient.getServices();
        System.out.println(s);
        return s;
    }
}
