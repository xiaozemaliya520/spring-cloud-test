package com.itheima.controller;


import com.itheima.pojo.User;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("/{id}")
    @HystrixCommand(fallbackMethod = "fallbackMethoda")
    public String getUserById(@PathVariable("id") Long id){
//        User user = restTemplate.getForObject("http://localhost:8091/user/8", User.class);
        List<ServiceInstance> fuchengbo = discoveryClient.getInstances("fuchengbo");
        ServiceInstance serviceInstance = fuchengbo.get(0);

        System.out.println(serviceInstance.getPort());
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;
        return restTemplate.getForObject(url,String.class);
    }

    public String  fallbackMethoda(Long id){
        log.debug("查询用户失败啦！！！");
        return "网络故障了，孩子 早点睡觉";
    }
}
