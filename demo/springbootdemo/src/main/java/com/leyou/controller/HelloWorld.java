package com.leyou.controller;

import com.leyou.bean.Student;
import com.leyou.config.DataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloWorld {

    @Autowired
    private DataSource data;
    @Autowired
    private Student s;
    @Autowired
    private DataConfig dc;


    @RequestMapping("hello")
    public String helloWorld(){
        return "hello world"
                +data.toString()+"\r"+s.toString();
    }

}
