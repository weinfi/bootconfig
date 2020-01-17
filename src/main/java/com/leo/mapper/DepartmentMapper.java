package com.leo.mapper;

import com.leo.entities.Department1;
import org.apache.ibatis.annotations.*;


//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department1 where id=#{id}")
    public Department1 getDeptById(Integer id);

    @Delete("delete from department1 where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department1(departmentname) values(#{departmentName})")
    public int insertDept(Department1 department);

    @Update("update department1 set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department1 department);
}
