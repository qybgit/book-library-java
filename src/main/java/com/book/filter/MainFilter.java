//package com.book.filter;
//
//
//
//import com.book.entity.Student;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("")
//public class MainFilter extends HttpFilter {
//
//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
////        String url = req.getRequestURL().toString();
////        if(!url.contains("/static/") && !url.endsWith("login.jsp")){
////            HttpSession session = req.getSession();
////            Student user  = (Student) session.getAttribute("Student");
////            if(user == null) {
////                res.sendRedirect("login.jsp");
////                return;
////            }
////        }
////        chain.doFilter(req, res);
//    }
//}
