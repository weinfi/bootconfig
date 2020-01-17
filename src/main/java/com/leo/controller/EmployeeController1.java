package com.leo.controller;

import com.leo.entities.Employee1;
import com.leo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController1 {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp2/{id}")
    public Employee1 getEmployee(@PathVariable("id") Integer id){
        Employee1 employee = employeeService.getEmp(id);
        return employee;
    }

/*    @GetMapping("/emp")
    public Employee1 update(Employee1 employee){
        Employee1 emp = employeeService.updateEmp(employee);

        return emp;
    }

    @GetMapping("/delemp")
    public String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "success";
    }

    @GetMapping("/emp/lastname/{lastName}")
    public Employee1 getEmpByLastName(@PathVariable("lastName") String lastName){
       return employeeService.getEmpByLastName(lastName);
    }*/

}
