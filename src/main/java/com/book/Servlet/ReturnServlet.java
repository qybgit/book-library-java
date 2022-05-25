package com.book.Servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.book.entity.Student;
import com.book.service.ReturnService;
import com.book.service.impl.ReturnServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ReturnServlet", value = "/return")
public class ReturnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Detai");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        Student student= (Student) request.getSession().getAttribute("s");
        JSONArray jsonArray= JSON.parseArray(id);

        ReturnService service=new ReturnServiceimpl();
        service.returnData(jsonArray);

    }
}
