<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>risultato</title>
</head>
<body>
<div style="text-align: center;margin-top: 10%;">
<form action="index.jsp">
<h1>${messaggio}${risultato}</h1>
<input type="submit" value="torna alla pagina iniziale">
</form>
</div>
</body>
</html>