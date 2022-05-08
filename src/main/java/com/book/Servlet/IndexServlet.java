package com.book.Servlet;

import com.book.dao.BookMapper;
import com.book.entity.Book;
import com.book.entity.BookClass;
import com.book.utils.MybatisUtil;

import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SqlSession sqlSession= MybatisUtil.getSession();
        BookMapper mapper=sqlSession.getMapper(BookMapper.class);
        List<BookClass> bookList=mapper.selectBook();
        req.getSession().setAttribute("bookList",bookList);
        List<Book> bookList1=mapper.book();
        req.getSession().setAttribute("book",bookList1);
        req.getRequestDispatcher("/book.jsp").forward(req,resp);
    }
}
