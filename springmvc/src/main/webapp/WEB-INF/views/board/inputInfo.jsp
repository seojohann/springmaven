<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String context = request.getContextPath();%>

<form action="<%=context%>/board/detailedUser" method="post">
	Name : <input type="text" name="name"><br />
	DOB : <input type="text" name="dob"><br />
	ID : <input type="text" name="loginId"><br />
	PW : <input type="text" name="pw"><br />
	<input type="submit" name="enter"/>
	<input type="submit" name="enter2"
		onclick="form.action='<%=context%>/board/detailedUser';"/>
</form>

<p></p>
</body>
</html>