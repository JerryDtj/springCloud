package com.learn.eurekaserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-06-12 17:20
 */
@RestController
@RequestMapping("/all")
public class TestController {
    @GetMapping
    public void getIp(){
        System.out.println(1);
    }
}
