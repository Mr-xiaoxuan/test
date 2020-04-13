package com.yhx.yhx_crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yhx.yhx_crm.entity.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee> {

    IPage<Employee> selectList(Page<Employee> page);

    Employee selectByName(String empName);

    Integer add(Employee employee,Integer roleId);


    Integer update(Employee employee,Integer roleId);
}
