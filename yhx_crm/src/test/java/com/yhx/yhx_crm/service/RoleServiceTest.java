package com.yhx.yhx_crm.service;

import com.yhx.yhx_crm.entity.Role;
import com.yhx.yhx_crm.mapper.RoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void select(){
        System.out.println(roleMapper.selectById(1));
    }


}