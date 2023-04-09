<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% int n= Integer.parseInt(request.getParameter("n"));
%>
<%! 
public int square(int a){
	return(a*a);
}
%>

<%= "Square is "+ square(n) %>



</body>
</html>