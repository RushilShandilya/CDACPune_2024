<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Echoing HTML Form Query Parameters</title>
</head>
<body>
<h3>Choose an author:</h3>
<form method="get">
    <input type="checkbox" name="Character" value="Kratos">Kratos
    <input type="checkbox" name="Character" value="Faye">Faye
    <input type="checkbox" name="Character" value="Atreus">Atreus

    <input type="submit" value="Query">
</form>
<%
    String[] input = request.getParameterValues("Character");
    if(input!=null){
%>
<h3>The values you chose are : </h3>
<ul>
<% for(String name : input){%>
<li><%=name%></li>
<%}%>
</ul>
<%}%>
</body>
</html>