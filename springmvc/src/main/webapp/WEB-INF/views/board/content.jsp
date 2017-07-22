<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board Content</title>
</head>
<body>
<h1>
	This is content page
</h1>

<P>  The time on the server is ${serverTime}. </P>

<div>
	Show the content here : ${content}.
</div>
</body>
</html>
