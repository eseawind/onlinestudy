function alertMessage(container, sign, message) {
	
	// 如果存在之前的alert组件则滑动隐藏
	$("#" + tempAlertId).slideUp().remove();
	
	// 找到container元素前追加，并调用slideDown事件
	if (sign == true) {
		alertSuccess(container, message);
	} else {
		alertDanger(container, message);
	}
}

// TODO 使用json进行枚举整合所有的alert方法
function alertMessageByAlertType(container, message, alertType) {
	var alertDiv = "<div id='"
			+ tempAlertId
			+ "' class='alert alert-"
			+ alertType
			+ " alert-dismissable' role='alert' style='display:none'> <button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>"
			+ message + "</div>";
	// 在container添加警告窗
	container.prepend(alertDiv);
	// 显示并滑动警告窗
	$("#" + tempAlertId).slideDown();
}

function alertSuccess(container, message) {
	alertMessageByAlertType(container, message, AlertType.success);
}

function alertDanger(container, message) {
	alertMessageByAlertType(container, message, AlertType.danger);
}

function alertInfo(container, message) {
	alertMessageByAlertType(container, message, AlertType.info);
}

function alertWarning(container, message) {
	alertMessageByAlertType(container, message, AlertType.warning	);
}