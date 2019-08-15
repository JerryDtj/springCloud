package com.learn.eureakrabbionhystrixrabbitmq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/8 11:19
 * @description:
 **/
@RestController
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hystrix")
    @HystrixCommand(fallbackMethod = "timeout")
    public String hystrix() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String timeout() {
        return "time out";
    }


    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registration.addUrlMappings("/hystrix.stream");
        return registration;
    }
}
