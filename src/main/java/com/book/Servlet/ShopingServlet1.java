package com.book.Servlet;

import com.book.entity.Shopingbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShopingServlet1", value = "/shopreal")
public class ShopingServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        Shopingbook bookList;
        if(request.getSession().getAttribute("shop1")==null){
            bookList=new Shopingbook();

        }else {
            bookList= (Shopingbook) request.getSession().getAttribute("shop1");
        }
        bookList.add(id);

        request.getSession().setAttribute("shop1",bookList);
        request.getRequestDispatcher("/shop1.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
