
<%@ page import="java.util.List" %>
<%@ page import="com.book.entity.BookClass" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zxx" xmlns:th="http://www.thymeleaf.org">
<!--<![endif]-->
<!-- Begin Head -->
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="static/css/fonts.css">
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/icofont.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <link rel="stylesheet" type="text/css" href="static/css/my.css">
    <link rel="stylesheet" id="theme-change" type="text/css" href="">
</head>
<body>
<header class="header-wrapper main-header" fragment="title">
    <div class="header-inner-wrapper">
        <div class="logo-wrapper">
            <a href="" class="admin-logo">
                <img src="static/picture/logo.png" alt="">
            </a>
        </div>
        <div class="header-right">
            <div class="header-left"></div>
            <div class="header-controls">
                <div class="user-info-wrapper header-links">
                    <a href="" class="user-info">
                        <img src="static/picture/user.jpg" alt="" class="user-img">
                        <div class="blink-animation">
                            <span class="blink-circle"></span>
                            <span class="main-circle"></span>
                        </div>
                    </a>
                    <div class="user-info-box">
                        <div class="drop-down-header">
                            <h4 text="">John Brown</h4>

                        </div>
                        <ul>
                            <li>
                                <a href="api/auth/logout">
                                    <i class="fas fa-sign-out-alt"></i> 退出登录
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<aside class="sidebar-wrapper" th:fragment="aside">
    <div class="side-menu-wrap">
        <ul class="main-menu">
            <li sec:authorize="hasRole('admin')">
                <a th:href="@{/page/admin/index}">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
                            </span>
                    <span class="menu-text">
                                借阅管理
                            </span>
                </a>
            </li>
            <li sec:authorize="hasRole('admin')">
                <a th:href="@{/page/admin/book}">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-package"><line x1="16.5" y1="9.4" x2="7.5" y2="4.21"></line><path d="M21 16V8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16z"></path><polyline points="3.27 6.96 12 12.01 20.73 6.96"></polyline><line x1="12" y1="22.08" x2="12" y2="12"></line></svg>
                            </span>
                    <span class="menu-text">
                                图书管理
                            </span>
                </a>
            </li>
            <li sec:authorize="hasRole('user')">
                <a th:href="@{/page/user/index}">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
                            </span>
                    <span class="menu-text">
                                图书借阅
                            </span>
                </a>
            </li>
            <li sec:authorize="hasRole('user')">
                <a th:href="@{/page/user/book}">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-package"><line x1="16.5" y1="9.4" x2="7.5" y2="4.21"></line><path d="M21 16V8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16z"></path><polyline points="3.27 6.96 12 12.01 20.73 6.96"></polyline><line x1="12" y1="22.08" x2="12" y2="12"></line></svg>
                            </span>
                    <span class="menu-text">
                                借阅管理
                            </span>
                </a>
            </li>
        </ul>
    </div>
</aside>
</body>
</html>