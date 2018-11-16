<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tanyf
  Date: 2018/11/14
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <c:out value="${spitter.userName}"/>
    <c:out value="${spitter.lastName}"/>
    <c:out value="${spitter.firstName}"/>
</body>
</html>
