<%--
  Created by IntelliJ IDEA.
  User: tanyf
  Date: 2018/11/14
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="spittleView">
    <div class="spittleMessage">
        <c:out value = "${spittle.message}" />
    </div>
    <div>
        <span class="spittleTime">
            <c:out value="${spittle.time}" />
        </span>
    </div>
</div>
</body>
</html>
