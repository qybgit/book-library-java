package com.book.Servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.book.entity.ShopingBorrow;
import com.book.entity.Shopingbook;
import com.book.entity.Student;
import com.book.service.BorrowService;
import com.book.service.impl.BorrowServiceimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShopingServlet1", value = "/shopreal")
public class BorrowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        if(request.getSession().getAttribute("s")==null){
//            request.getSession().setAttribute("msg","请登陆");
//            response.sendRedirect("login.jsp");
//        }else {
//            String id=request.getParameter("id");
//            Shopingbook bookList;
//            if(request.getSession().getAttribute("borrow")==null){
//                bookList=new Shopingbook();
//
//            }else {
//                bookList= (Shopingbook) request.getSession().getAttribute("borrow");
//            }
//            bookList.add(id);
//
//            request.getSession().setAttribute("borrow",bookList);
//            request.getRequestDispatcher("/borrow.jsp").forward(request,response);
//        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
Student student= (Student) request.getSession().getAttribute("s");
JSONArray jsonArray= JSON.parseArray(id);
jsonArray.forEach(System.out::println);
Shopingbook booList= (Shopingbook) request.getSession().getAttribute("shop");

//jsonArray.forEach(System.out::println);
        ShopingBorrow borrowList;
        if(request.getSession().getAttribute("borrow")==null){
            borrowList=new ShopingBorrow();

        }else {
            borrowList= (ShopingBorrow) request.getSession().getAttribute("borrow");
        }
        BorrowServiceimpl service=new BorrowServiceimpl();
        service.insert(1,jsonArray,borrowList,booList);
        request.getSession().setAttribute("borrow",borrowList);
        response.getWriter().print(JSON.toJSON(borrowList));

//        System.out.println(impl.insert(1, jsonArray);
    }
}