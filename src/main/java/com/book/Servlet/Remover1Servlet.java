package com.book.Servlet;

import com.book.entity.Shopingbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RemoverServlet1", value = "/removerreal")
public class Remover1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        if (request.getSession().getAttribute("shop1")==null){
            request.getRequestDispatcher("/shop1.jsp").forward(request,response);
        }else {
            Shopingbook booList= (Shopingbook) request.getSession().getAttribute("shop1");
            booList.remover(id);
            request.getSession().setAttribute("shop1",booList);
            request.getRequestDispatcher("/shop1.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
