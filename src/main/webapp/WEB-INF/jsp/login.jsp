<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线学习系统</title>
<script type="text/javascript">
	$(document).ready(function() {
		
		$("#loginForm").submit(function(){
			return false;
		});

		$("#submit").click(function() {
			var username = $("input[name='username']").val();
			var password = $("input[name='password']").val();
			// 此处有待改进-----使用其他方式获取form
			var url = $("#loginForm").attr("action");
			
			$.ajax({
				url: url,
				data:{
					username:username,
					password:username
				},
				type:'post',
				dataType:'json',
				success:function(data){
					alertMessage($(".container"), data);
					// TODO 间隔几秒跳转
					location.href="${contextPath}/index";
				},
				error:{
				}
			})
		});
	});
</script>

<style>
	.container{
		width:400px;
	}
</style>
</head>
<body>
	<div class="container">
		<form id="loginForm" class="form-signin" role="form" action="${contextPath}/login"
			method="post">
			<h2 class="form-signin-heading">欢迎登录</h2>
			<input type="text" name="username" class="form-control" placeholder="用户名" required autofocu>
			<input type="password" name="password" class="form-control" placeholder="密码" required autofocu>
			<br/>
			<button id="submit" class="btn btn-lg btn-primary btn-block">登录</button>
		</form>
	</div>
</body>
</html>