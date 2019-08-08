package com.learn.eruekaclienthystrix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/8 11:48
 * @description:
 **/
@RestController
public class DcController {

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        Thread.sleep(5000);
        return "dc";
    }
}
