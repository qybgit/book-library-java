

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
    <title>SplashDash</title>
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
    <div ></div>
    <div ></div>
    <div class="page-wrapper">

        <div class="main-content">
            <!-- Page Title Start -->
            <div class="row">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="page-title-wrapper">
                        <div class="page-title-box">

                        </div>
                        <div class="breadcrumb-list">
                            <ul>
                                <li class="breadcrumb-link">
                                    <a href="javascript:void(0);"><i class="fas fa-home mr-2"></i>图书管理系统</a>
                                </li>
                                <li class="breadcrumb-link active">录入书籍信息</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- From Start -->
            <div class="from-wrapper">
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div style="width: 500px;margin-right: 500px;margin-left: 350px" class="card">
                            <div style="width: 500px;margin-right: 500px" class="card-header">
                                <h4>阅读信息</h4>
                                <p class="card-desc">请在下方确认所缴纳的 <code>罚款</code> 以及对应的 <code>借阅人</code></p>
                            </div>
                            <div style="width: 500px;margin-right: 500px" class="card-body">
                                <form class="separate-form" method="post">
                                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                        <div class="row">
                                            <c:forEach items="${FineNo}" var="fine">
                                                <c:if test="${fine.getId()==re}"
                                            </c:forEach>
                                            <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                                                <div class="form-group">
                                                    <label  class="col-form-label">书籍标题</label>
                                                </div>
                                                <div class="form-group">
                                                <label class="col-form-label">书籍标题</label>
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">价格</label>
                                                </div>
                                            </div>


                                        </div>
                                        <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">

                                        </div>
                                        <div class="form-group mb-0">
                                           <a>
                                               <button class="btn btn-primary" type="submit">缴纳</button>
                                           </a>
                                        </div>
                                    </div>
                                </form>
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