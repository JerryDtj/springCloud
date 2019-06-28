package com.learn.consulconsumer.controller;

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
 * @Date 2019-06-13 19:03
 */
@RestController
@RequestMapping("/dc")
public class DCController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public String dc(){
        List<String> list = discoveryClient.getServices();
        list.forEach(System.out::println);
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-client");
        String url = "http://" +serviceInstance.getHost()+":"+serviceInstance.getHost()+"/dc";
        String s = restTemplate.getForObject(url,String.class);
        return s;
    }
}
