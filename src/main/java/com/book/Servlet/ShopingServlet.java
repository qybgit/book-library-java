package com.book.Servlet;

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
        bookList.add(id);

        request.getSession().setAttribute("shop",bookList);
        request.getRequestDispatcher("/shop.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
