package com.leo.controller;


import com.leo.entities.Department1;
import com.leo.entities.Employee1;
import com.leo.mapper.DepartmentMapper;
import com.leo.mapper.EmployeeMapper;
import com.leo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DeptService deptService;


    @GetMapping("/dept2/{id}")
    public Department1 getDepartment1(@PathVariable("id") Integer id){
        Department1 department1 = deptService.getDept(id);
        return department1;
    }

    @GetMapping("/dept/{id}")
    public Department1 getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department1 insertDept(Department1 department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp1/{id}")
    public Employee1 getEmp(@PathVariable("id") Integer id){
       return employeeMapper.getEmpById(id);
    }

}
