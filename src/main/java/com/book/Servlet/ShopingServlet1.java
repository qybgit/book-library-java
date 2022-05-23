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

        if(request.getSession().getAttribute("s")==null){
            request.getSession().setAttribute("msg","请登陆");
            response.sendRedirect("login.jsp");
        }else {
            String id=request.getParameter("id");
            Shopingbook bookList;
            if(request.getSession().getAttribute("borrow")==null){
                bookList=new Shopingbook();

            }else {
                bookList= (Shopingbook) request.getSession().getAttribute("borrow");
            }
            bookList.add(id);

            request.getSession().setAttribute("borrow",bookList);
            request.getRequestDispatcher("/shop1.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("id");

        System.out.println(id);
    }
}
