package com.learn.eurekaconsumerfeign.controller;

import com.learn.eurekaconsumerfeign.clinets.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-06-30 13:03
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        String result = dcClient.consumer();
        return result + "  eureck-consumer-feign";
    }
}
