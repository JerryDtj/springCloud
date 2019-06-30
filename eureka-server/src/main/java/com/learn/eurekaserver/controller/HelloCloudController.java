package com.learn.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-06-30 13:27
 */
@RestController
public class HelloCloudController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,spring Cloud";
    }
}
