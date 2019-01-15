package com.mytabtsexample.demo.service;

import com.mytabtsexample.demo.dao.UserConsumerMap;
import com.mytabtsexample.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserConsumerSev {

    @Autowired
    private UserConsumerMap userConsumerMap;

    public List<User> queryUserById(){
        List<User> users = new ArrayList<>();
        for(int i = 16 ; i < 22 ; i++){
            users.add(userConsumerMap.getUserById((long) i));
        }
        return users;
    }

}
