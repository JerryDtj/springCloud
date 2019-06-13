package com.learn.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Jerry
 * @Date 2019-06-13 16:22
 */
@RestController
@RequestMapping("/dc")
public class DCController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String dc(){
        List<String> s=  discoveryClient.getServices();
        s.forEach(System.out::println);
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://"+ serviceInstance.getHost()+":"+serviceInstance.getPort()+"/dc";
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }
}
