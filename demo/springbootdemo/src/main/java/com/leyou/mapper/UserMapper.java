package com.leyou.mapper;

import com.leyou.bean.User;
public interface UserMapper {
    User selectByPrimaryKey(Long Id);
}
