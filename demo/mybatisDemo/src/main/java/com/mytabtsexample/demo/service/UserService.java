package com.mytabtsexample.demo.service;

import com.mytabtsexample.demo.dao.UserMapper;
import com.mytabtsexample.demo.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<TbUser> selectAll(){
        return userMapper.selectAll();
    }

    public TbUser queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

}
