<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!-- 加载 Bootstrap -->
<link href="${contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextPath}/css/path.css" rel="stylesheet">
<!-- 包括所有已编译的插件 -->
<script src="${contextPath}/js/jquery.min.js"></script>
<script src="${contextPath}/js/bootstrap.min.js"></script>

<!-- 定义的js全局变量参数 -->
<script src="${contextPath}/js/constants.js"></script>

<!-- 自定义使用bootstrap的alert -->
<script src="${contextPath}/js/alert.js"></script>