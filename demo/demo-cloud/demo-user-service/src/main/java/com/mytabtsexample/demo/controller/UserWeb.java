package com.mytabtsexample.demo.controller;

import com.mytabtsexample.demo.pojo.User;
import com.mytabtsexample.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserWeb {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "userService/{id}",method = RequestMethod.GET)
    public User hello(@PathVariable(value = "id") Long id){
        return userService.getUserById(id);
    }

}
