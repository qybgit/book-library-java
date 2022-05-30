package com.book.service.impl;

import com.book.dao.StudentMapper;
import com.book.entity.Student;
import com.book.service.StudentService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpSession;

public class StudentServiceimpl implements StudentService {
    SqlSession sqlsession= MybatisUtil.getSession();
    StudentMapper mapper=sqlsession.getMapper(StudentMapper.class);
    @Override
    public boolean pangduan(String username, String password, HttpSession session) {

        Student student=mapper.getstudent(username,password);
        if(student==null)
           return false;
        session.setAttribute("student",student);

        return true;
    }

    @Override
    public boolean register(String name, String email, String grade, String pwd) {
       mapper.insertStudent(name, email, grade, pwd);
       return true;

    }

    @Override
    public boolean changePassword(String id, String pwd) {
        try {
            mapper.updatePassword(pwd,id);
        }catch (Exception e){
            sqlsession.rollback();
            throw  e;
        }
        return true;
    }

}
