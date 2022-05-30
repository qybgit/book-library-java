package com.book.Servlet;

import com.book.service.StudentService;
import com.book.service.impl.StudentServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
        String user=request.getParameter("username");
        String email=request.getParameter("email");
        String grade=request.getParameter("grade");
        String pwd=request.getParameter("password");
        StudentService service=new StudentServiceimpl();
        service.register(user,email,grade,pwd);
        response.sendRedirect("login.jsp");
    }
}
