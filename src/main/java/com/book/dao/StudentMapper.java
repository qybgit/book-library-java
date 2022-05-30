package com.book.dao;

import com.book.entity.Student;
import org.apache.ibatis.annotations.*;

public interface StudentMapper {
    @Result(property = "bj", column = "Class")
    @Select("select * from reader where Name=#{Name} and Password=#{Password} ")
    Student getstudent(@Param("Name") String Name, @Param("Password") String Password);
    @Insert("insert into reader(name,class,email,deposit,password) values(#{name},#{grade},#{email},0.00,#{password})")
    int insertStudent(@Param("name") String name, @Param("grade") String grade,@Param("email") String email,@Param("password") String password);
    @Update("update reader set password=#{pwd} where Id=#{id}")
    int updatePassword(@Param("pwd") String pwd,@Param("id") String id);
    @Update("update reader set deposit=reader.deposit+#{zj} where Id=#{id}")
    int updateDeposit(@Param("zj") String zj,@Param("id") String id);
}