<%@page import="br.edu.ifsp.dsw1.model.entity.User"%>
<%@page import="br.edu.ifsp.dsw1.model.entity.FlightDataCollection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
</head>
<body>
	<%
	FlightDataCollection collection = new FlightDataCollection();
	
	User usr = null;
	HttpSession session2 = request.getSession(false);
	if (session2 == null || session2.getAttribute("object_user") == null) { %>
		<%@include  file="includes/welcome.html" %>
	<%
	} else {
		usr = (User) session2.getAttribute("object_user");
		if (usr.getUsername().equals("admin")) {
			if (usr.getPassword().equals("admin")) { %>
				<%@include  file="includes/admin.html" %>
			<%} else { %>
				<%@include  file="includes/base.html" %>
			<%}
		} else {%>
			<%@include  file="includes/base.html" %>
		<%}
	} %>
</body>
</html>
