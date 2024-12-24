<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
    <link rel="stylesheet" href="../../../style.css">
</head>
<body>
    <h2>Welcome , <%=request.getAttribute("username")%></h2>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>ImageURL</th>
    </tr>
        <%
            List<Map<String,String>> resultList = (List<Map<String,String>>)request.getAttribute("Results");
            for(Map<String,String> map : resultList){%>
            <tr>
                <td><a href="Products?categoryId=<%=map.get("ID")%>"><%=map.get("ID")%></a></td>
                <td><%=map.get("Name")%></td>
                <td><%=map.get("Description")%></td>
                <td><%=map.get("ImageURL")%></td>
            </tr>
        <%}%>
</table>
</body>
</html>
