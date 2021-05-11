<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/11/2021
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="header">
    <div>
        <h1 style="
           background-color: violet;
           margin-top: 0px;
           height: 100px;
           text-align: center"
        >Products</h1>
    </div>
</div>
<div> <a href="addphone.jsp" style="float: right;padding-right: 17px">add-phone</a> </div>
<div class="w3-container">

    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>image</th>
        </tr>
        <c:forEach var="p" items="${requestScope.products}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td><img src="images/${p.image}"/></td>

            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
