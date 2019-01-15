package com.mytabtsexample.demo.service;

import com.mytabtsexample.demo.dao.UserMapper;
import com.mytabtsexample.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
