package com.mytabtsexample.demo;

import com.mytabtsexample.demo.pojo.TbUser;
import com.mytabtsexample.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisDemoApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    public void contextLoads() {

        TbUser  tbUsers = userService.queryById(16L);
        System.out.println(tbUsers);


    }

}

