
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
    <title>图书管理系统</title>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="">
    <meta name="MobileOptimized" content="320">
    <!--Start Style -->
    <link rel="stylesheet" type="text/css" href="static/css/fonts.css">
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/icofont.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <link rel="stylesheet" id="theme-change" type="text/css" href="">
</head>

<body>
<div class="loader">
    <div class="spinner">
        <img src="static/picture/loader.gif" alt="">
    </div>
</div>
<!-- Main Body -->
<div class="page-wrapper">
    <%@include file="header.jsp"%>
    <div ></div>

    <!-- Sidebar Start -->
    <aside class="sidebar-wrapper">
        <div class="side-menu-wrap">
            <ul class="main-menu">
                <li>
                    <a href="total" class="active">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
                            </span>
                        <span class="menu-text">
                                首页
                            </span>
                    </a>
                </li>

                <li>
                    <a href="index" class="active">
                              <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-package"><line x1="16.5" y1="9.4" x2="7.5" y2="4.21"></line><path d="M21 16V8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16z"></path><polyline points="3.27 6.96 12 12.01 20.73 6.96"></polyline><line x1="12" y1="22.08" x2="12" y2="12"></line></svg>
                            </span>
                        <span class="menu-text">
                                图书分类
                            </span></a>

                </li>
                <li>
                    <a href="shop.jsp">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-users"><path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path><circle cx="9" cy="7" r="4"></circle><path d="M23 21v-2a4 4 0 0 0-3-3.87"></path><path d="M16 3.13a4 4 0 0 1 0 7.75"></path></svg>
                            </span>
                        <span class="menu-text">
                                我的书架
                            </span>
                    </a>
                </li>
                <li>
                    <a href="shop1.jsp">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-map"><polygon points="1 6 1 22 8 18 16 22 23 18 23 2 16 6 8 2 1 6"></polygon><line x1="8" y1="2" x2="8" y2="18"></line><line x1="16" y1="6" x2="16" y2="22"></line></svg>
                            </span>
                        <span class="menu-text">
                                我的借阅
                            </span>
                    </a>
                </li>
            </ul>
        </div>
    </aside>
    <!-- Container Start -->
    <div class="page-wrapper">
        <div class="main-content">
            <!-- Page Title Start -->
            <div class="row">
                <div class="colxl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="page-title-wrapper">
                        <div class="page-title-box ad-title-box-use">
                            <h4 class="page-title">书籍管理</h4>
                        </div>

                        <div class="ad-breadcrumb">
                            <form action="search" method="post">
                                <ul>
                                    <li>
                                        <div class="ad-user-btn">
                                            <input class="form-control" type="text" placeholder="输入书籍标题..." id="text-input" name="search">

                                        </div>
                                    </li>
                                    <li>
                                        <div class="add-group">
                                            <input class="ad-btn" type="submit" value="搜索">
                                        </div>
                                    </li>
                                </ul></form>
                        </div>


                    </div>
                </div>
            </div>
            <!-- Table Start -->
            <div class="row">
                <!-- Styled Table Card-->
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="card table-card">
                        <div class="card-header pb-0">
                            <h4>书籍列表</h4>
                        </div>
                        <div class="card-body">
                            <div class="chart-holder">
                                <div class="table-responsive">
                                    <table class="table table-styled mb-0">
                                        <thead>
                                        <tr>
                                            <th><input type="checkbox" name="check" value="all" id="del"  ></th>
                                            <th>样式</th>
                                            <th>书籍编号</th>
                                            <th>书籍名称</th>
                                            <th>书籍作者</th>
                                            <th>书籍出版社</th>
                                            <th>图书状态</th>
                                            <th>是否借阅</th>
                                            <th></th>
                                        </tr>
                                        </thead>
                                        <c:forEach items="${shop.getBookList()}" var="book">
                                            <tbody>
                                            <tr id="${book.getId()}">
                                                <td> <c:if test="${book.getStatus() == '无货'}">
                                                </c:if>
                                                    <c:if test="${book.getStatus() == '有货'}">
                                                        <input type="checkbox" name="${book.getId()}" value="check" >
                                                    </c:if>

                                                </td>
                                                <td><img src="static/book/${book.getImageUrl()}"> </td>
                                                <td >${book.getCode()}</td>
                                                <td >${book.getName()}</td>
                                                <td >${book.getAuthors()}</td>
                                                <td>${book.getPress()}</td>
                                                <td>
                                                    <c:if test="${book.getStatus() == '无货'}">
                                                        <label class="mb-0 badge badge-success" title="" data-original-title="Pending"> ${book.getStatus()}</label>
                                                    </c:if>
                                                    <c:if test="${book.getStatus() == '有货'}">
                                                        <label class="mb-0 badge badge-primary" title="" data-original-title="Pending">${book.getStatus()}</label>
                                                    </c:if>                                                </td>
                                                <td>
                                                    <c:if test="${book.getStatus()== '有货'}">
                                                        <a style="color: #00acee" href="shopreal?id=${book.getId()}">借阅</a>
                                                    </c:if>
                                                    <c:if test="${book.getStatus()== '无货'}">
                                                        <p style="color: red">无法借阅</p>
                                                    </c:if>
                                                    </td>
                                                <td><a style="color: red" href="javascript:doRequst(${book.getId()})" >移除</a></td>



                                            </tr>
                                            </tbody>
                                        </c:forEach>

                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="ad-footer-btm">
                <p>Copyright © 2021.Company name All rights reserved.<a target="_blank" href="https://sc.chinaz.com/moban/">网页模板</a></p>
            </div>
        </div>
    </div>
</div>

<!-- Script Start -->
<script src="static/js/jquery.min.js"></script>
<script src="static/js/remove.js"></script>
<script src="static/js/popper.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/swiper.min.js"></script>
<script src="static/js/apexcharts.min.js"></script>
<script src="static/js/control-chart-apexcharts.js"></script>
<!-- Page Specific -->
<script src="static/js/nice-select.min.js"></script>
<!-- Custom Script -->
<script src="static/js/custom.js"></script>
</body>

</html>