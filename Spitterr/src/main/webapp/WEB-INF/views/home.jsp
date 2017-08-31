<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page session="false" %>
<html>
<head>
	<title>Spittr</title>
	<link rel="stylesheet"
		type="text/css"
		href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1><s:message code="spittr.welcome"/></h1>

<P><s:message code="spittr.time"/></P>

<a href="<c:url value="/spitts" />">Spitts</a>
<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
