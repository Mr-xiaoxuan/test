package com.yhx.yhx_crm.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yhx.yhx_crm.entity.Role;
import com.yhx.yhx_crm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService service;

    @GetMapping("/role")
    public List<Role> roles(){

        return service.list();
    }

}
