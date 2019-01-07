package com.leyou.controller;

import com.leyou.pojo.Student;
import com.leyou.config.DataConfig;
import com.leyou.pojo.TbUser;
import com.leyou.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@Slf4j
public class HelloWorld {

    @Autowired
    private DataSource data;
    @Autowired
    private Student s;
    @Autowired
    private DataConfig dc;
    @Autowired
    private UserService userService;



    @RequestMapping("hello")
    public TbUser helloWorld(){
        TbUser tbUser = userService.queryById(18L);
        log.info(tbUser.toString());
        return tbUser;
    }

}
