<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/include.jsp"%>
<html>
<title>在线学习系统</title>
<body>
	<nav class="navbar navbar-default" role="navigation"> <!-- Brand and toggle get grouped for better mobile display -->
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-3">
			<span class="sr-only">Toggle navigation</span>
		</button>
		<a class="navbar-brand" href="${contextPath}/index">OStudy</a>
	</div>

	<div class="collapse navbar-collapse" id="navbar-collapse-3">
		<ul class="nav navbar-nav">
			<li><a href="#">课程</a></li>
			<li ><a href="#">测试</a></li>
			<li><a href="#">Clients</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">${user.username } <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#">我的课程</a></li>
					<li><a href="#">我的个人资料</a></li>
					<li><a href="#">我的老师</a></li>
					<li><a href="#">个人设置</a></li>
					<li class="divider"></li>
					<li><a href="${contextPath}/logout">退出</a></li>
				</ul>
			</li>
			<li>
				<a href="#">
					<span class="visible-sm visible-xs">Settings
						<span class="fui-gear"></span>
					</span>
					<span class="visible-md visible-lg">
						<span class="fui-gear"></span>
					</span>
				</a>
			</li>
		</ul>
	</div>
	</nav>
</body>
</html>

