package com.leo.service;

import com.leo.entities.Department1;
import com.leo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Created by Liuq on 2020-01-16.
 */
@Service
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Cacheable(value = {"emp"}/*,keyGenerator = "myKeyGenerator",condition = "#a0>1",unless = "#a0==2"*/)
    public Department1 getDept(Integer id){
        System.out.println("查询"+id+"号员工");
        Department1 emp = departmentMapper.getDeptById(id);
        return emp;
    }
}
