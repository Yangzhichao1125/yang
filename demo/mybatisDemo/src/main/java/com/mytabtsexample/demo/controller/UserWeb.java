package com.mytabtsexample.demo.controller;

import com.mytabtsexample.demo.pojo.TbUser;
import com.mytabtsexample.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserWeb {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("user")
    public List<TbUser> getUser(){
        return userService.selectAll();
    }


    @RequestMapping("hello")
    public String hello(){
        System.out.println("=====");
        return "hello";
    }

}
