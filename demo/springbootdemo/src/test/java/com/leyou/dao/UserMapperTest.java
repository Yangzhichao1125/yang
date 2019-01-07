package com.leyou.dao;

import com.leyou.pojo.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUser(){
        TbUser tbUser = userMapper.selectByPrimaryKey(18L);

        TbUser tbUser1 = userMapper.selectByPrimaryKey(19L);

        List<TbUser> tbUsers = Arrays.asList(tbUser);
        log.info(tbUsers.toString());
    }




}