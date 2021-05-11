<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/11/2021
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add-phone</title>
</head>
<body>
<h1>add-phone</h1>
<div style="padding-bottom: 54px" class="card-body">
    <form method="post" action="product">
        <input class="form-control form-control-lg mb-3" type="text" placeholder="Name Product" name="name">
        <input class="form-control form-control-lg mb-3" type="number" placeholder="Price" name="price">
        <input class="form-control form-control-lg mb-3" type="number" placeholder="Quantity" name="quantity">
        <input class="form-control form-control-lg mb-3" type="text" placeholder="Image" name="image">
        <input class="btn btn-primary" style="float: right" type="submit" value="Submit">
        <input class="btn btn-primary" value="Reset">
        <%--                                    <div id="editor-container" class="add-new-post__editor mb-1"></div>--%>
    </form>
</div>
</body>
</html>
