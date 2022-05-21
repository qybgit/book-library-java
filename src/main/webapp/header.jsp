<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<body>
    <header class="header-wrapper main-header" th:fragment="title">
    <div class="header-inner-wrapper">
        <div class="logo-wrapper">
            <a href="" class="admin-logo">
                <img src="static/picture/logo.png" alt="">
            </a>
        </div>
        <div class="header-right">
            <div class="header-left">
                <div class="header-links">
                    <a href="javascript:void(0);" class="toggle-btn">
                        <span></span>
                    </a>
                </div>
            </div>
            <div class="header-controls">
                <div class="user-info-wrapper header-links">
                    <a href="javascript:void(0);" class="user-info">
                        <img src="static/picture/user.jpg" alt="" class="user-img">
                        <div class="blink-animation">
                            <span class="blink-circle"></span>
                            <span class="main-circle"></span>
                        </div>
                    </a>
                    <div class="user-info-box">
                        <div class="drop-down-header">
                            <c:if test="${s.getName()!=null}">
                                <h4 >${s.getName()}</h4>
                                <li>
                                    <a href="login.jsp">
                                        <i class="fas fa-sign-out-alt"></i> 退出登陆
                                    </a>
                                </li>
                                <p>欢迎进入到图书管理系统</p>
                            </c:if>
                            <c:if test="${s.getName()==null}">
                                <h4><a style="color: white" href="login.jsp">登陆</a> </h4>
                            </c:if>


                        </div>
                        <ul>



                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
</body>
</html>