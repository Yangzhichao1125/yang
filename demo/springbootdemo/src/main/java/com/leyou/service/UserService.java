package com.leyou.service;

import com.leyou.dao.UserMapper;
import com.leyou.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public TbUser queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<TbUser> queryAll(){
        return userMapper.selectAll();
    }

    @Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }


}