<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.1.1.min.js" ></script>
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<title>注册</title>
<script type="text/javascript">
	function toBack() {
		$("form:first").attr("action", "/mvcdemo/login.do");
		$("form:first").submit();
	}
</script>
</head>
<body>
	<form action="/mvcdemo/user.do?action=save"  method="post">
		<table align="center">
			<c:choose>
			<c:when test="${message != ''}">
				<tr>
					<td style="color: red;" colspan="2">${message}</td>
				</tr>
			</c:when>
			</c:choose>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" id="username"/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age" id="age"/></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="address" id="address"/></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" name="save" value="保存">
					<input type="button" name="back" value="返回" onclick="toBack()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>