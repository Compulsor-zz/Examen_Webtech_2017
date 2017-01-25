<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="quote" class="edu.gd.file.QuoteFile" scope="session"/>
	<jsp:setProperty property="*" name="quote"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quote</title>
</head>
<body>

	<p>
		<strong>Quote opgezocht met woord: <%= request.getParameter("word") %>:</strong>
	</p>
	
	<p>
		<%= quote.getQuoteFromWord(request.getParameter("word")) %>
	</p>
</body>
</html>