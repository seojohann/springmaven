<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittr>Recent</title>
</head>
<body>
<h1>Recent Spitts</h1>

<c:forEach items="${spittList}" var="spitt">
	<li id="spitt_<c:out value="spitt.id"/>">
		<div class="spittMessage">
			<c:out value="${spitt.message}"/>
		</div>
		<div>
			<span class="spittTime"><c:out value="${spitt.time}"/></span>
			<span class="spittLocation">
				(<c:out value="${spitt.latitude}"/>,
				<c:out value="${spitt.longitude}"/>)</span>
		</div>
	</li>
</c:forEach>
</body>
</html>