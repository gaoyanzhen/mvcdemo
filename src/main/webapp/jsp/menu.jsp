<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap-theme.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script type="text/javascript" src="js/jquery-1.11.1.js" ></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<title>首页1</title>
</head>
<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
	<div class="container-fluid"> 
    <div class="navbar-header">
        <a class="navbar-brand" href="#">首页</a>
    </div>
    <div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">课程管理</a></li>
            <li><a href="#">学生管理</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Java <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">jmeter</a></li>
                    <li><a href="#">EJB</a></li>
                    <li><a href="#">Jasper Report</a></li>
                    <li class="divider"></li>
                    <li><a href="#">分离的链接</a></li>
                    <li class="divider"></li>
                    <li><a href="#">另一个分离的链接</a></li>
                </ul>
            </li>
        </ul>
    </div>
	</div>
</nav>
</body>
</html>