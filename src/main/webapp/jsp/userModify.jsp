<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-1.11.1.js" ></script>
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<title>注册</title>
<script type="text/javascript">
	function toBack() {
		$("form:first").attr("action", "/mvcdemo/user.do?action=getUserList&page=");
		$("form:first").submit();
	}
</script>
</head>
<body>
<form action="/mvcdemo/user.do?action=save" method="post" class="form-horizontal" role="form" >
	<c:choose>
		<c:when test="${message != null&&message != ''}">
		<div class="form-group">
			<div class="alert alert-danger col-sm-offset-2 col-sm-2">${message}</div>
		</div>
		</c:when>
	</c:choose>
	<div class="form-group">
		<label class="col-sm-2 control-label" for="name">用户名</label>
		<div class="col-sm-2">
			<input type="text" class="form-control" name="name" id="name" value="${user.name }">
			<input type="hidden" name="id" id="id" value="${user.id }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label" for="password">密码</label>
		<div class="col-sm-2">
			<input type="password" class="form-control" name="password" id="password" value="${user.password }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label" for="age">年龄</label>
		<div class="col-sm-2">
			<input type="text" class="form-control" name="age" id="age" value="${user.age }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label" for="address">地址</label>
		<div class="col-sm-2">
			<input type="text" class="form-control" name="address" id="address" value="${user.address }">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-1">
			<button type="submit" class="btn btn-default" id="save">保存</button>
		</div>
		<div class="col-sm-1">
			<button type="button" class="btn btn-default" id="back" onclick="toBack()">返回</button>
		</div>
	</div>
	</form>
</body>
</html>