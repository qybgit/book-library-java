package com.book.Servlet.FineServlet;

import com.book.entity.Fine;
import com.book.service.impl.FineServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FineServlet", value = "/fine")
public class FineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Fine> fineList;
        FineServiceimpl service=new FineServiceimpl();
        if(request.getSession().getAttribute("Fine")==null){
            fineList=new ArrayList<>();

            service.selectBorrow();
            service.crateFine(fineList,1);
            request.getSession().setAttribute("Fine",service.getFineList());

        }

            fineList= (List<Fine>) request.getSession().getAttribute("Fine");
List<Fine> fineList1=service.fineNo();
List<Fine> fineList2=service.fineYes();
        request.getSession().setAttribute("FineNo",fineList1);
        request.getSession().setAttribute("FineYes",fineList2);
        request.getRequestDispatcher("/book1.jsp").forward(request,response);
    }

}
