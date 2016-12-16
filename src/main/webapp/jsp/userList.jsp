<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap-theme.min.css">
<script type="text/javascript" src="js/jquery-1.11.1.js" ></script>
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<title>用户查询</title>
</head>
<body>
	<table class="table table-bordered">
		<caption>用户列表</caption>
		<thead>
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>地址</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="user" items="${userList }" varStatus="xh">
			<tr>
				<td><c:out value="${xh.index+1}"/></td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.address}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<ul class="pagination">
		<li><a href="#">&laquo;</a></li>
		<li class="active"><a href="#">1</a></li>
		<li class="disabled"><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#">&raquo;</a></li>
	</ul>
</body>
</html>