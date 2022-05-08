package com.book.Servlet;

import com.book.dao.BookMapper;
import com.book.entity.Book;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("id");
        SqlSession sqlSession= MybatisUtil.getSession();
        BookMapper mapper=sqlSession.getMapper(BookMapper.class);
       List<Book> bookList= mapper.selectBookByid(id);
       request.getSession().setAttribute("book",bookList);
       request.getRequestDispatcher("/book.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
