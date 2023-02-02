<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	
		if(session.getAttribute("username")==null) {
			
			response.sendRedirect("login.jsp");
		}
	%>
	
	<iframe width="1280" height="720" src="https://www.youtube.com/embed/OuBUUkQfBYM" title="Servlet & JSP Tutorial | Full Course" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
</body>
</html>