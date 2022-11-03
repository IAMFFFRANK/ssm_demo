package com.jony.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jony.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    /*
     * 查询所有
     * */
    List<Employee> getAllEmployee();

    /*
     * 获取分页信息
     * */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
