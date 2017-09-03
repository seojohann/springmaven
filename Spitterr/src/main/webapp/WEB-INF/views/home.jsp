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
<h1>Welcome to Spittr!<%-- <s:message code="spittr.welcome"/> --%></h1>

<P><%-- <s:message code="spittr.time"/> --%></P>

<s:url value="/spitts" var="spittsUrl">
	<s:param name="max" value="60"/>
	<s:param name="count" value="20"/>
</s:url>

<s:url value="/spitter/register" var="spitterUrl"/>

<a href="${spittsUrl}">Spitts</a>
<a href="${spitterUrl}">Register</a>
</body>
</html>
