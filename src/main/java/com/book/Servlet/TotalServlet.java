package com.book.Servlet;

import com.book.dao.BookMapper;
import com.book.entity.Book;
import com.book.entity.BookClass;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TotalServlet", value = "/total")
public class TotalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession sqlSession= MybatisUtil.getSession();
        BookMapper mapper=sqlSession.getMapper(BookMapper.class);
        List<Book> bookList1=mapper.book();
        request.getSession().setAttribute("book",bookList1);
        request.getRequestDispatcher("/total.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
