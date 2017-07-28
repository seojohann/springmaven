<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%String context = request.getContextPath();%>

<P>  The time on the server is ${serverTime}. </P>


<a href="<%=context%>/board/inputInfo" id="inputInfo">link to inputInfo</a>

</body>
</html>
