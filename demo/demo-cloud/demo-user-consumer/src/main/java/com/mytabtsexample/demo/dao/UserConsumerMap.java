package com.mytabtsexample.demo.dao;

import com.mytabtsexample.demo.client.UserClient;
import com.mytabtsexample.demo.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
@Slf4j
public class UserConsumerMap {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @HystrixCommand(fallbackMethod="queryUserByIdFallback")
    public User getUserById(Long id){
        return userClient.queryById(id);
    }


    public User queryUserByIdFallback(Long id){
        User user = new User();
        user.setId(id);
        log.info("用户信息查询出现异常！");
        user.setUsername("用户信息查询出现异常！");
        return user;
    }

}
