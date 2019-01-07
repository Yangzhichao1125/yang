package com.yang.controller;


import com.yang.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("aaa")
    public TbUser getUser(){
        return this.restTemplate.getForObject("http://localhost/hello", TbUser.class);
    }

}
