package com.leo.entities;

public class Department1 {

    private Integer id;
    private String departmentName;

    public Department1(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department1{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
