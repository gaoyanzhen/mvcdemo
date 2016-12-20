<%@ page language="java" contentType="text/html; charset=utf-8"  isELIgnored="false" 
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.1.1.min.js" ></script>
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
function registerUser(){
	$("form:first").attr("action", "/mvcdemo/login.do?action=register");
	$("form:first").submit();
}
</script>
<title>登录</title>
</head>
<body>
	<div class="container">
	<form action="/mvcdemo/login.do?action=login" method="post" class="form-horizontal" role="form" >
		<c:choose>
			<c:when test="${message != null&&message != ''}">
			<div class="form-group">
				<div class="alert alert-danger col-sm-offset-2 col-sm-2">${message}</div>
			</div>
			</c:when>
		</c:choose>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="username">用户名</label>
			<div class="col-sm-2">
      			<input type="text" class="form-control" name="username" id="username">
      		</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password">密码</label>
			<div class="col-sm-2">
				<input type="password" class="form-control" name="password" id="password">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-1">
				<button type="submit" class="btn btn-default" id="logon">登录</button>
			</div>
			<div class="col-sm-1">
				<button type="button" class="btn btn-default" id="register" onclick="registerUser()">注册</button>
			</div>
		</div>
	</form>
	</div>
</body>
</html>