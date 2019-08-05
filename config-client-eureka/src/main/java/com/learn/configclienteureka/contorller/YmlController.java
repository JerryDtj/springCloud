package com.learn.configclienteureka.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里需要添加RefreshScope注解为了修复1.5.4.RELEASE版本的springboot不会自动刷新的问题
 * 但是在1.3.7版本是可以的。这个需要研究下为什么
 *
 * @Author: jerry
 * @date: 2019/8/5 16:39
 * @description:
 **/
@RestController
@RequestMapping("/yml")
@RefreshScope
public class YmlController {

    @Value("${info.add}")
    private String add;

    @GetMapping("/add")
    public String info() {
        System.out.println(add);
        return add;
    }

}
