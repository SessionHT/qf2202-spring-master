<%--
  Created by IntelliJ IDEA.
  User: cos
  Date: 2022/6/8
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/doLogin" method="post">
        <input type="text" name="username"> <br>
        <input type="password" name="password"> <br>
        <input type="submit" value="登录">
    </form>
    <h1>${msg}</h1>
    <hr>
    <img src="1.gif" alt="">
</body>
</html>
