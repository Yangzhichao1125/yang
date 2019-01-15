package com.yangyou.test;

import com.mytabtsexample.demo.UserConsumerApp;
import com.mytabtsexample.demo.pojo.User;
import com.mytabtsexample.demo.service.UserConsumerSev;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserConsumerApp.class)
@Slf4j
public class HttpDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    RibbonLoadBalancerClient client;
    @Autowired
    UserConsumerSev userConsumerSev;

    @Test
    public void test(){
        for (int i = 0; i < 20; i++) {
            ServiceInstance instance = this.client.choose("user-service");
            log.info(instance.getHost() + ":" + instance.getPort()+"   "+i);
        }
    }

    @Test
    public void getService(){
        User forObject = restTemplate.getForObject("http://localhost:8083/userService/18", User.class);
        log.info(forObject.toString());
    }

    @Test
    public void HyTest(){
        List<User> users = userConsumerSev.queryUserById();
        log.info(users.toString());
    }

}
