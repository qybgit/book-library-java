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

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession= MybatisUtil.getSession();
        BookMapper mapper=sqlSession.getMapper(BookMapper.class);
        List<BookClass> bookList=mapper.selectBook();
        request.getSession().setAttribute("bookList",bookList);
        String search=request.getParameter("search");

        BookMapper bmapper=sqlSession.getMapper(BookMapper.class);
        List<Book> bookList2=  mapper.selectsearch(search);
        request.getSession().setAttribute("book",bookList2);
       request.getRequestDispatcher("/book.jsp").forward(request,response);
    }
}
