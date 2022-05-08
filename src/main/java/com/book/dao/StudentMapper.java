package com.book.dao;

import com.book.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
    @Result(property = "bj",column = "Class")
    @Select("select * from reader where Name=#{Name} and Password=#{Password} ")
    Student getstudent(@Param("Name") String Name,@Param("Password") String Password);
}
