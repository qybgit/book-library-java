package com.book.Servlet;

import com.book.service.DeleteService;
import com.book.service.impl.DeleteServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleateServlet", value = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        DeleteService service=new DeleteServiceimpl();
        service.deleteborrow(Integer.parseInt(id));
        response.sendRedirect("Detai");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
