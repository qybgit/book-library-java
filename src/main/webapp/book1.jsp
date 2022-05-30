
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
    <link rel="stylesheet" type="text/css" href="static/css/my.css">
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

        <div class="page-wrapper">
            <div class="main-content">
                <!-- Page Title Start -->
                <div class="row">
                    <div class="colxl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-title-wrapper">
                            <div class="page-title-box ad-title-box-use">
                                <h4 class="page-title">罚款管理</h4>
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
                                <label>
                                <input type="radio" value="1" name="radio"><i style="color: red">未交款</i>
                            </label>
                                <label>
                                    <input type="radio" value="2" name="radio"><i style="color: #00acee">>已交款</i
                                </label>
                            </div>


                            <div class="card-body">
                                <div class="chart-holder">
                                    <div class="table-responsive">
                                        <table class="table table-styled mb-0">
                                            <thead>
                                            <tr>
                                                <th>#ID</th>
                                                <th>标题</th>
                                                <th>简介</th>
                                                <th>价格</th>
                                                <th>删除</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr id="not">
                                                <td text="">1</td>
                                                <td text="">书籍名称</td>
                                                <td text="">书籍简介</td>
                                                <td text="">价格</td>
                                                <td class="relative">
                                                    <a class="action-btn " href="">
                                                        <svg class="default-size " viewBox="0 0 341.333 341.333 ">
                                                            <g>
                                                                <g>
                                                                    <g>
                                                                        <path d="M170.667,85.333c23.573,0,42.667-19.093,42.667-42.667C213.333,19.093,194.24,0,170.667,0S128,19.093,128,42.667 C128,66.24,147.093,85.333,170.667,85.333z "></path>
                                                                        <path d="M170.667,128C147.093,128,128,147.093,128,170.667s19.093,42.667,42.667,42.667s42.667-19.093,42.667-42.667 S194.24,128,170.667,128z "></path>
                                                                        <path d="M170.667,256C147.093,256,128,275.093,128,298.667c0,23.573,19.093,42.667,42.667,42.667s42.667-19.093,42.667-42.667 C213.333,275.093,194.24,256,170.667,256z "></path>
                                                                    </g>
                                                                </g>
                                                            </g>
                                                        </svg>
                                                    </a>
                                                </td>
                                            </tr>

                                            <tr id="have">
                                                <td text="">1</td>
                                                <td text="">书籍名称</td>
                                                <td text="">书籍简介</td>
                                                <td text="">价格</td>
                                                <td class="relative">
                                                    <a class="action-btn " href="">
                                                        <svg class="default-size " viewBox="0 0 341.333 341.333 ">
                                                            <g>
                                                                <g>
                                                                    <g>
                                                                        <path d="M170.667,85.333c23.573,0,42.667-19.093,42.667-42.667C213.333,19.093,194.24,0,170.667,0S128,19.093,128,42.667 C128,66.24,147.093,85.333,170.667,85.333z "></path>
                                                                        <path d="M170.667,128C147.093,128,128,147.093,128,170.667s19.093,42.667,42.667,42.667s42.667-19.093,42.667-42.667 S194.24,128,170.667,128z "></path>
                                                                        <path d="M170.667,256C147.093,256,128,275.093,128,298.667c0,23.573,19.093,42.667,42.667,42.667s42.667-19.093,42.667-42.667 C213.333,275.093,194.24,256,170.667,256z "></path>
                                                                    </g>
                                                                </g>
                                                            </g>
                                                        </svg>
                                                    </a>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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
    <script src="static/js/remove.js"></script>
    <script src="static/js/control-chart-apexcharts.js"></script>
    <!-- Page Specific -->
    <script src="static/js/nice-select.min.js"></script>
    <!-- Custom Script -->
    <script src="static/js/custom.js"></script>
</body>

</html>