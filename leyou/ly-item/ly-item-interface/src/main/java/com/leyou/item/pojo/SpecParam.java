package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "tb_spec_param")
public class SpecParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private Long groupid;// 1级类目
    private String sname;
    private Boolean ifnumeric;// 是否有效，逻辑删除用
    private String unit;
    private Boolean generic ;
    private Boolean searching;
    private String segments;
}
