<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
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
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">${user.name} <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/profile/person">个人资料</a></li>
						<c:forEach items="${roles}" var="role">
							<c:if test="${role.roleName == 'teacher' }">
								<li class="divider"></li>
								<li><a href="#">课程管理</a></li>
								<li><a href="#">学生管理</a></li>
								<li><a href="#">测试管理</a></li>
							</c:if>
							
							<c:if test="${role.roleName == 'student' }">
								<li class="divider"></li>
								<li><a href="#">我的课程</a></li>
								<li><a href="#">我的测试</a></li>
								<li><a href="#">我的班级</a></li>
							</c:if>
							
							<c:if test="${role.roleName == 'admin' }">
								<li class="divider"></li>
								<li><a href="#">班级管理</a></li>
								<li><a href="#">测试设置</a></li>
								<li><a href="#">课程管理</a></li>
								<li><a href="${contextPath}/user/all">用户管理</a></li>
							</c:if>
						</c:forEach>
						<li class="divider"></li>
						<li><a href="${contextPath}/logout">退出</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>