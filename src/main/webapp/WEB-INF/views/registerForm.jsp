<%--
  Created by IntelliJ IDEA.
  User: tanyf
  Date: 2018/11/14
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Register</title>
</head>
<style>
    label.error{
        color: #8b171b;
    }
    div.error{
        background-color: #8b3646;
        border:1px solid #8b171b;
    }
    input.error{
        background-color: #8b3646;
    }
</style>
<body>
    <h1>Register</h1>
    <%--<form method="post">--%>
        <%--<table>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--用户名:--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<input type="text" id="username">--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--密码:--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<input type="password" id="passWd">--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--再次输入密码:--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<input type="password" id="passWd2">--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--email:--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<input type="email" id="email">--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</table>--%>
        <%--<input type="submit" value="注册">--%>
    <%--</form>--%>
<sf:form method="post" commandName="spitter">
    <sf:errors cssClass="error" path="firstName" element="div"/>
    <sf:label path="firstName" cssErrorClass="error">FirstName:</sf:label>
    <sf:input path="firstName" cssErrorClass="error"/><br>
    LastName: <sf:input path="lastName" />
    UserName: <sf:input path="userName"/>
    PassWord: <sf:password path="password"/>
</sf:form>

</body>
</html>
