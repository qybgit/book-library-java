package com.book.Servlet.FineServlet;

import com.book.dao.StudentMapper;
import com.book.entity.Fine;
import com.book.entity.Student;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FineNoServlet", value = "/deposit")
public class DepositServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");
        String money = request.getParameter("money");
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        if (mapper.updateDeposit1(money, user) <1) {
            request.getSession().setAttribute("deposit", "充值失败");
            response.sendRedirect("deposit.jsp");

        }else {
            response.sendRedirect("total");
        }
    }
}
