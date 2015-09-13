<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!-- 加载 Bootstrap -->
<link href="${contextPath}/css/vendor/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/css/flat-ui.min.css" rel="stylesheet">
<!-- 包括所有已编译的插件 -->
<script src="${contextPath}/js/vendor/jquery.min.js"></script>
<script src="${contextPath}/js/flat-ui.min.js"></script>