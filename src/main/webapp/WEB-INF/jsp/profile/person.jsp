<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线学习系统</title>
</head>
<script type="text/javascript">
$(document).ready(function() {
	
	$("#form").submit(function() {
		var name = $("input[name='name']").val();
		var password = $("input[name='password']").val();
		// TODO 此处有待改进-----使用其他方式获取form
		var url = $("#form").attr("action");
		
		$.ajax({
			url: url,
			data:{
				name:name,
				password:password
			},
			type:'post',
			dataType:'json',
			success:function(data){
				alertMessage($(".alertDiv"), data.successSign, data.message);
				if(data.successSign == true){
					setTimeout(function(){
						location.href="${contextPath}/profile/person";
					}, 500);
				}
			},
			error:function(data){
				alert($(".alertDiv"), false, "服务器发生错误，请稍后重试!");
			}
		})
		
		// 阻止表单提交
		return false;
	});
});
</script>
<body>
	<!-- 导航栏 -->
	<%@ include file="/WEB-INF/jsp/navigationBar.jsp"%>

	<div class="container">
		<div class="panel panel-primary" style="height: 800px">
			<div class="panel-heading">
				<h3 class="panel-title">个人资料</h3>
			</div>
			
			<div class="alertDiv"></div>
			
			<div class="panel-body">
				<form id="form" class="form-horizontal" role="form" action="${contextPath}/profile/person" method="post">
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name"
								placeholder="请输入姓名" value="${user.name}">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">个性签名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="signature"
								placeholder="请输入个性签名" value="">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">手机号码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="mobile"
								placeholder="请输入手机号码" value="">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="邮箱地址">
								<span class="input-group-addon">@</span>
								<input type="text" class="form-control" style="width: 100px" placeholder="域名">
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label for="lastname" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" name="password"
								placeholder="请输入密码(不输入为不修改)">
						</div>
					</div>
					
					<div class="form-group">
						<label for="lastname" class="col-sm-2 control-label">确认密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" name="confirmPassword"
								placeholder="请确认密码">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">提交</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>