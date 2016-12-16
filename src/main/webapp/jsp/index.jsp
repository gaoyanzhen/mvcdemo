<%@ page language="java" contentType="text/html; charset=utf-8"  isELIgnored="false" 
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap3.3.0/css/bootstrap-theme.min.css">
<script type="text/javascript" src="js/jquery-1.11.1.js" ></script>
<script type="text/javascript" src="bootstrap3.3.0/js/bootstrap.min.js"></script>
<title>首页12</title>
<script type="text/javascript">
	//用户管理
	function toUserList(){
		$('#content').attr('src','/mvcdemo/login.do?action=content');
	}
	//意见反馈
	function toOpinion(){
		$('#content').attr('src','/mvcdemo/login.do?action=opinion');
	}
	
</script>
</head>
<body>
<div class="container">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">菜鸟教程</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="/mvcdemo/login.do?action=index">首页</a></li>
				<li><a href="#">活动与新闻</a></li>
				<li><a href="#" onclick="toUserList()">用户管理</a></li>
				<li><a href="NavServlet?action=softwaredownload">软件下载</a></li>
				<li><a href="#" onclick="toOpinion()">意见反馈</a></li>
				<li><a href="#">知识库</a></li>
				<li><a href="NavServlet?action=aboutus">关于我们</a></li>
			</ul>
		</div>
	</div>
	 <div class="row">
		 <div class="col-sm-12">
			<iframe id="content" style="zoom: 0.6;" height="800px" src="" frameBorder="0" width="99.6%"></iframe>
		</div>
	</div>
	</nav>
</div>
</body>
</html>