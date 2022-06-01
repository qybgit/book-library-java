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
        <div style="margin-right: 100px" class="main-content">
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
                <div style="margin-right: 1000px" class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div style="width: 1100px;margin-right: 300px;margin-top: -100px" class="card table-card">
                        <div class="form-group mb-0">
                            <a href="total">
                                <button style="margin-left: 28px;margin-top: 30px" class="btn btn-primary"
                                        type="submit"><i><&nbsp;&nbsp; </i>返回
                                </button>
                            </a>
                        </div>
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
                                                                                <%--                                                <th>#ID</th>--%>
                                                                                <th>书名</th>
                                                                                <th>还书时间</th>
                                                                                <th>欠款金额</th>
                                                                                <th>去交款</th>
                                                                            </tr>
                                                                            </thead>
                                                                            <tbody>
                                                                            <%--                                            已缴纳的页面--%>
                                                                            <c:forEach items="${FineYes}" var="fine">
                                                                                <tr class="have">
                                                                                        <%--                                                <td text="">${fine.getId()}</td>--%>
                                                                                    <td text="">${fine.getName()}</td>
                                                                                    <td text="">${fine.getReturnedDate()}</td>
                                                                                    <td text="">${fine.getPrice()}</td>
                                                                                    <td>

                                                                                        <a>
                                                                                            <button style="" class="btn btn-primary" type="submit">已缴纳
                                                                                            </button>
                                                                                        </a>
                                                                                    </td>
                                                                                </tr>
                                                                                <%--                                                未缴纳的页面--%>
                                                                            </c:forEach>
                                                                            </tbody>
                                                                            <tbody>
                                                                            <c:forEach items="${FineNo}" var="fine">
                                                                                <tr class="not" data="${fine.getId()}">
                                                                                        <%--                                                <td text="">${fine.getId()}</td>--%>
                                                                                    <td text="" class="finename" >${fine.getName()}</td>
                                                                                    <td text="">${fine.getReturnedDate()}</td>
                                                                                    <td text="" class="finemoney">${fine.getPrice()}</td>
                                                                                    <td class="relative">
                                                                                        <a class="pay" href="javaScript:void(0)">
                                                                                            <button style="" class="btn btn-primary" type="submit">缴纳罚款
                                                                                            </button>
                                                                                        </a>
                                                                                    </td>
                                                                                </tr>
                                                                            </c:forEach>
                                                                            </tbody>
                                                                        </table>
                                </div>

                            </div>

                        </div>
                        <div class="cover">
                            <div class="order">
                                <div class="close">
                                    <a href="javascript:;">X</a>
                                </div>
                                <div class="order-test"></div>
                                <div  class="hid"></div>
                                <div>确认罚款金额:<i class="order-test2"></i></div>
                                <div>
                                    <a class="tofine">
                                        <button style="" class="btn btn-primary" type="submit">去缴纳
                                        </button>
                                    </a>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <%--            付款页面--%>


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