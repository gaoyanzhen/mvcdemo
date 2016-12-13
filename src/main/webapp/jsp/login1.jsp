<%@ page language="java" contentType="text/html; charset=utf-8"  isELIgnored="false" 
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.11.1.js" ></script>
<script type="text/javascript">
function registerUser(){
	$("form:first").attr("action", "/mvcdemo/login.do?action=register");
	$("form:first").submit();
}
</script>
<title>登录</title>
</head>
<body>
	<form action="/mvcdemo/login.do?action=login" method="post">
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
					<td><input type="text" name="username" id="username" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password" id="password" /></td>
				</tr>
				<tr align="center">
					<td  colspan="2">
					<input type="submit" name="logon" id="logon" value="登录">
					<input type="button" name="register" id="register" value="注册" onclick="registerUser()">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>