package com.mytabtsexample.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class TbUser {

    private Long id;

    private String username;

    private String password;

    private String phone;

    private Date created;

}
