package com.book.Servlet;

import com.book.entity.Student;
import com.book.service.StudentService;
import com.book.service.impl.StudentServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ChangPasswordServlet", value = "/change")
public class ChangPasswordServlet extends HttpServlet {
    private String pwd;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("s") == null) {
            request.getSession().setAttribute("msg", "请登陆后修改");
            response.sendRedirect("login.jsp");

        } else {
            this.doPost(request,response);

        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("s") == null) {
            request.getSession().setAttribute("msg", "请登陆后修改");
            response.sendRedirect("login.jsp");
        } else {
            request.setCharacterEncoding("utf-8");
            String pwd = request.getParameter("password");
            Student student= (Student) request.getSession().getAttribute("s");
            StudentService service = new StudentServiceimpl();
            service.changePassword(student.getId(),pwd);
            request.getSession().setAttribute("msg", "修改成功请登陆");
            request.getSession().setAttribute("s",null);
            response.sendRedirect("login.jsp");
        }
    }
}
