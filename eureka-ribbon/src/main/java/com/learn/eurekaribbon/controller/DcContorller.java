package com.learn.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jerry
 * @Date 2019-06-16 16:12
 */
@RestController
public class DcContorller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }
}
