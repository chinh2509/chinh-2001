<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/8/2021
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <title><dec:title/></title>
<jsp:include page="head.jsp"/>
    <decorator:head/>
</head>
<body>


<decorator:body />

</body>
</html>
