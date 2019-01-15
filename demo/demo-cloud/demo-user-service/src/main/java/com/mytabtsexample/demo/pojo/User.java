package com.mytabtsexample.demo.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date created;

}
