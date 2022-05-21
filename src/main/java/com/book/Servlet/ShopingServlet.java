package com.book.Servlet;

import com.alibaba.fastjson2.JSON;
import com.book.entity.Shopingbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShopingServlet", value = "/shop")
public class ShopingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("id");

        Shopingbook bookList;
        if(request.getSession().getAttribute("shop")==null){
            bookList=new Shopingbook();

        }else {
            bookList= (Shopingbook) request.getSession().getAttribute("shop");
        }
        bookList.add1(id);

        request.getSession().setAttribute("shop",bookList);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(JSON.toJSON(bookList));
        request.getRequestDispatcher("/tran").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
