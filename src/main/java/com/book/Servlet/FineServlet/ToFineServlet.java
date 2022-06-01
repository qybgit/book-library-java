package com.book.Servlet.FineServlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.book.service.Money;
import com.book.service.impl.Moneyimpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "ToFineServlet", value = "/ToFine")
public class ToFineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        int data;
        Money service = new Moneyimpl();
        if (service.returnMoney(Integer.parseInt(id), 50, 1)) {
           data =0;
        }else data=1;
        response.getWriter().print(JSON.toJSON(data));

    }
}
