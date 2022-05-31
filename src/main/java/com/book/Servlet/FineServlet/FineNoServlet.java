package com.book.Servlet.FineServlet;

import com.book.entity.Fine;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FineNoServlet", value = "/FineNoServlet")
public class FineNoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.getParameter("id");
        List<Fine> list= (List<Fine>) request.getSession().getAttribute("FineNo");
        int p=0;
    }
}
