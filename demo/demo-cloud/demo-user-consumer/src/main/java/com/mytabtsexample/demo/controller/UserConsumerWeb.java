package com.mytabtsexample.demo.controller;

import com.mytabtsexample.demo.pojo.User;
import com.mytabtsexample.demo.service.UserConsumerSev;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class UserConsumerWeb {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserConsumerSev userConsumerSev;


    @RequestMapping("consumers")
    public List<User> getService(){
        return userConsumerSev.queryUserById();
    }

}
