package com.learn.configclient.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/5 16:39
 * @description:
 **/
@RestController
@RequestMapping("/yml")
public class YmlController {

    @Value("${info.add}")
    private String add;

    @GetMapping("/add")
    public String info(){
        System.out.println(add);
        return add;
    }

}
