<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
<title>Spittr>Registration</title>
</head>
<body>
	<h1>Register</h1>

	<sform:form method="POST" commandName="spitter">
		<sform:errors path="*" element="div" cssClass="errors" />
		<sform:label path="firstName" cssErrorClass="error">First Name</sform:label>: 
		<sform:input path="firstName" /><br />
			
		<sform:label path="lastName" cssErrorClass="error">Last Name</sform:label>: 
		<sform:input path="lastName" /><br />
			
		<sform:label path="email" cssErrorClass="error">Email</sform:label>: 
		<sform:input path="email" type="email" /><br />
		
		<sform:label path="username" cssErrorClass="error">Username</sform:label>: 
		<sform:input path="username" /><br />
			
		<sform:label path="password" cssErrorClass="error">Password</sform:label>: 
		<sform:password path="password" /><br />

		<input type="submit" value="Register" />
	</sform:form>
</body>
</html>