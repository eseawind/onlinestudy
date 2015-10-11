<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		
		$(".deleteButton").click(function(){
			var userId = $(this).attr("userid");
			console.log(userId);
		});
		
		$(".addButton").click(function(){
			
		});
		
		$(".updateButton").click(function(){
			
		});
		
	});
</script>
</head>
<body>
	<!-- 导航栏 -->
	<%@ include file="/WEB-INF/jsp/navigationBar.jsp"%>

	<div class="container">
	
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">用户管理</h3>
			</div>
			
			<div class="panel-body" style="height:800px auto">
				
				<div class="container" style="width:800px">
				<div class="alertDiv"></div>
				<div style="height:60px">
					<button type="button" class="btn btn-success" data-toggle="modal" data-target="#addUser">
						<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
					</button>
					<button type="button" class="btn btn-info">
						<span class="glyphicon glyphicon-file" aria-hidden="true"></span>导入
					</button>
				</div>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>用户名</th>
							<th>姓名</th>
							<th>手机号</th>
							<th>地址</th>
							<th>邮箱</th>
							<th>有效</th>
							<th>操作</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach items="${userList}" var="presentUser">
							<tr>
								<td>${presentUser.username}</td>
								<td>${presentUser.name}</td>
								<td>${presentUser.mobile}</td>
								<td>${presentUser.address}</td>
								<td>${presentUser.mail}</td>
								<td align="center">
									<c:if test="${presentUser.status == true}">
										<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
									</c:if>
									<c:if test="${presentUser.status == false}">
										<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
									</c:if>
								</td>
								<td>
									<button userId="${presentUser.userId}" type="button" class="btn btn-danger btn-sm deleteButton"\
										data-toggle="modal" data-target="#deleteUser${presentUser.userId }">
										<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
									</button>
									<!-- 确认删除模态框 -->
									<!-- 此处有待改进 -->
									<div class="modal fade" id="deleteUser${presentUser.userId}" tabindex="-1" role="dialog"
										aria-labelledby="myModalLabel" aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">添加用户</h4>
												</div>
												<form action="${contextPath }/user/delete/${presentUser.userId}" method="post">
													<input type="hidden" name="_method" value="delete"/>
													<div class="modal-body">
														是否确定删除该用户（${presentUser.name}）!
													</div>
													<div class="modal-footer">
														<button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>删除</button>
														<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
													</div>
												</form>
											</div>
										</div>
									</div>
									
									<!-- 修改 -->
									<button type="button" class="btn btn-warning btn-sm updateButton" 
										data-toggle="modal" data-target="#updateUser${presentUser.userId }">
										<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 修改
									</button>
									<div class="modal fade" id="updateUser${presentUser.userId}" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">修改用户</h4>
												</div>
												<form id="form" class="form-horizontal" role="form"
													action="${contextPath}/user/" method="post">
													
													<input type="hidden" name="_method" value="put"/>
													<input type="hidden" name="userId" value="${presentUser.userId}"/>
													<div class="modal-body">
														<div class="form-group">
															<label for="firstname" class="col-sm-2 control-label">用户名</label>
															<div class="col-sm-10">
																<input type="text" class="form-control" name="username"
																	placeholder="请输入用户名" value="${presentUser.username}">
															</div>
														</div>

														<div class="form-group">
															<label for="firstname" class="col-sm-2 control-label">姓名</label>
															<div class="col-sm-10">
																<input type="text" class="form-control" name="name"
																	placeholder="请输入姓名" value="${presentUser.name}">
															</div>
														</div>

														<div class="form-group">
															<label for="firstname" class="col-sm-2 control-label">个性签名</label>
															<div class="col-sm-10">
																<input type="text" class="form-control"
																	name="signature" placeholder="请输入个性签名" value="${presentUser.signature}">
															</div>
														</div>

														<div class="form-group">
															<label for="firstname" class="col-sm-2 control-label">手机号码</label>
															<div class="col-sm-10">
																<input type="text" class="form-control" name="mobile" pattern="^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$" title="请输入正确的手机格式"
																	placeholder="请输入手机号码" value="${presentUser.mobile}">
															</div>
														</div>

														<div class="form-group">
															<label for="firstname" class="col-sm-2 control-label">地址</label>
															<div class="col-sm-10">
																<input type="text" class="form-control" name="address"
																	placeholder="请输入地址" value="${presentUser.address}">
															</div>
														</div>

														<div class="form-group">
															<label for="lastname" class="col-sm-2 control-label">邮箱</label>
															<div class="col-sm-10">
																<input type="text" class="form-control" placeholder="邮箱地址" name="mail"
																	pattern="^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$" title="邮箱正确格式：xxx@xxx.xxx">
															</div>
														</div>

														<div class="form-group">
															<label for="lastname" class="col-sm-2 control-label">密码</label>
															<div class="col-sm-10">
																<input type="password" class="form-control"
																	name="password" placeholder="请输入密码(不输入即不修改)">
															</div>
														</div>

														<div class="form-group">
															<label for="lastname" class="col-sm-2 control-label">确认密码</label>
															<div class="col-sm-10">
																<input type="password" class="form-control"
																	name="confirmPassword" placeholder="请确认密码" >
															</div>
														</div>
													</div>
													<div class="modal-footer">
														<button type="submit" class="btn btn-primary">提交</button>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">关闭</button>
													</div>
												</form>
											</div>
										</div>
									</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
		</div>
	</div>



	<!-- 模态框 -->
	
	<!-- 添加用户模态框 -->
	<div class="modal fade" id="addUser" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加用户</h4>
				</div>
				<form id="form" class="form-horizontal" role="form" action="${contextPath}/user/" method="post">
					<div class="modal-body">
							<div class="form-group">
								<label for="firstname" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="username"
										placeholder="请输入用户名" required autofocu>
								</div>
							</div>
					
							<div class="form-group">
								<label for="firstname" class="col-sm-2 control-label">姓名</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="name"
										placeholder="请输入姓名" required autofocu>
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
									<input type="text" class="form-control" name="mobile" pattern="^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$" title="请输入正确的手机格式"
										placeholder="请输入手机号码" value="${presentUser.mobile}">
								</div>
							</div>
	
							<div class="form-group">
								<label for="firstname" class="col-sm-2 control-label">地址</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="address"
										placeholder="请输入地址" value="${presentUser.address}">
								</div>
							</div>
	
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">邮箱</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" placeholder="邮箱地址" name="mail"
										pattern="^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$" title="邮箱正确格式：xxx@xxx.xxx">
								</div>
							</div>
							
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input type="password" class="form-control" name="password"
										placeholder="请输入密码" required autofocu>
								</div>
							</div>
							
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">确认密码</label>
								<div class="col-sm-10">
									<input type="password" class="form-control" name="confirmPassword"
										placeholder="请确认密码" required autofocu>
								</div>
							</div>
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">提交</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<!-- 确认删除模态框 -->
	<div class="modal fade" id="deleteUser" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加用户</h4>
				</div>
				<div class="modal-body">
					是否确定删除该用户!
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>删除</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>