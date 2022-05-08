package com.book.Servlet;

import com.book.dao.BookMapper;
import com.book.dao.StudentMapper;
import com.book.entity.BookClass;
import com.book.entity.Student;
import com.book.service.impl.StudentServiceimpl;
import com.book.utils.MybatisUtil;
import com.book.utils.ThymeleafUtil;
import org.apache.ibatis.session.SqlSession;
import org.thymeleaf.context.Context;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
if(request.getSession().getAttribute("s")!=null){
    response.sendRedirect("reader.jsp");
}else {
    request.getSession().setAttribute("msg","请body登陆");
    response.sendRedirect("login.jsp");
}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        SqlSession sqlSession= MybatisUtil.getSession();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        SqlSession sqlsession= MybatisUtil.getSession();
        StudentMapper studentMappermapper=sqlsession.getMapper(StudentMapper.class);
        Student student=studentMappermapper.getstudent(username,password);
        if(student!=null){
            request.getSession().setAttribute("s",student);
            System.out.println(student.toString());
          response.sendRedirect("reader.jsp");


        }else {
            request.getSession().setAttribute("msg","登陆错误，请再次登陆");
           doGet(request,response);
        }







    }
}
