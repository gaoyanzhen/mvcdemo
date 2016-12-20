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
	<c:choose>
		<c:when test="${message != null&&message != ''}">
			<div class="form-group">
				<div class="alert alert-danger col-sm-offset-2 col-sm-2">${message}</div>
			</div>
		</c:when>
	</c:choose>
	<table class="table table-bordered">
		<caption>用户列表</caption>
		<thead>
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>地址</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="user" items="${pageModel.dataList }" varStatus="xh">
			<tr>
				<td style="width: 10%;"><c:out value="${xh.index+1}"/></td>
				<td style="width: 20%;">
					<a href="/mvcdemo/user.do?action=modify&userId=${user.id}">${user.name}</a>
				</td>
				<td style="width: 10%;">${user.age}</td>
				<td style="width: 40%;">${user.address}</td>
				<td style="width: 20%;"><a href="/mvcdemo/user.do?action=delete&userId=${user.id}&page=${pageModel.currentPage}">删除</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<ul class="pagination">
	
		<c:forEach var="i" begin="1" end="${pageModel.totalPage}">
		<c:choose>
			<c:when test='${i==pageModel.currentPage}'>
			<li class="active"><a href="/mvcdemo/user.do?action=getUserList&page=${i}">${i}</a></li>
			</c:when>
			 <c:otherwise>
        	<li><a href="/mvcdemo/user.do?action=getUserList&page=${i}">${i}</a></li>
    		</c:otherwise>
    	</c:choose>
		</c:forEach>
	</ul>
</body>
</html>