<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Welcome, <%=session.getAttribute("Username")%></h2>
<table>
    <tr>
        <th>CategoryID</th>
        <th>ProductID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>ImageURL</th>
        <th>AddToCart</th>
    </tr>
    <%
        List<Map<String,String>> productList = (List<Map<String, String>>) request.getAttribute("Products");
        for(Map<String,String> map : productList){%>
        <tr>
            <td><%=map.get("CategoryID")%></td>
            <td><%=map.get("ProductID")%></td>
            <td><%=map.get("Name")%></td>
            <td><%=map.get("Description")%></td>
            <td><%=map.get("Price")%></td>
            <td><%=map.get("ImageURL")%></td>
            <td><a href=AddCart?productId=<%=map.get("ProductID")%>&price=<%=map.get("Price")%>>Add to Cart</a></td>
        </tr>
    <%}%>
</table>
</body>
</html>
