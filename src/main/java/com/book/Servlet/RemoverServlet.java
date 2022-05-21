package com.book.Servlet;


import com.alibaba.fastjson2.JSON;
import com.book.entity.Shopingbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RemoverServlet", value = "/remover")
public class RemoverServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("id");
if (request.getSession().getAttribute("shop")==null){
    request.getRequestDispatcher("/shop.jsp").forward(request,response);
}else {
    Shopingbook booList= (Shopingbook) request.getSession().getAttribute("shop");
    booList.remover1(id);
    request.getSession().setAttribute("shop",booList);
    response.setContentType("application/json;charset=utf-8");
    response.getWriter().print(JSON.toJSON(booList));

}

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
