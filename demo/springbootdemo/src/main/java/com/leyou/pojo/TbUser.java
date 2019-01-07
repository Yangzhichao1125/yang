package com.leyou.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class TbUser {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long Id;
    private String username;
    private String password;
    private String phone;
    private Date created ;
    @Transient
    private Date modified;


}
