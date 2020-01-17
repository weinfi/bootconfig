package com.leo.mapper;


import com.leo.entities.Employee1;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee1 getEmpById(Integer id);

    public void insertEmp(Employee1 employee);
}
