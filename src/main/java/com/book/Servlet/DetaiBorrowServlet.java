package com.book.Servlet;

import com.book.dao.BookMapper;
import com.book.entity.Borrow;
import com.book.entity.ShopingBorrow;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DetaiBorrowServlet", value = "/Detai")
public class DetaiBorrowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShopingBorrow shopingBorrow=new ShopingBorrow();
        List<Borrow> borrowList=new ArrayList<>();
        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        borrowList=mapper.selectBorrowList(1);//根据阅读者id查找借阅记录
        shopingBorrow.toBorrowinfo(borrowList);//借阅记录包装
        request.getSession().setAttribute("borrowDetai",shopingBorrow.getBorrowList());
        request.getRequestDispatcher("/borrow.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
