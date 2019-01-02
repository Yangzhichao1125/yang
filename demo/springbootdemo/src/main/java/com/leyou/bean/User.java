package com.leyou.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long Id;
    private String userName;
    private String password;
    private int age;
    private int sex;
    private Date create ;
    private Date modified;


}
