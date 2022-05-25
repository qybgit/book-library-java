package com.book.service.impl;

import com.book.dao.StudentMapper;
import com.book.entity.Student;
import com.book.service.StudentService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpSession;

public class StudentServiceimpl implements StudentService {
    @Override
    public boolean pangduan(String username, String password, HttpSession session) {
        SqlSession sqlsession= MybatisUtil.getSession();
        StudentMapper mapper=sqlsession.getMapper(StudentMapper.class);
        Student student=mapper.getstudent(username,password);
        if(student==null)
           return false;
        session.setAttribute("student",student);

        return true;
    }
}
