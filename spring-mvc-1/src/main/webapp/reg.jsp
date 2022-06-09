<%--
  Created by IntelliJ IDEA.
  User: cos
  Date: 2022/6/7
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/emp/reg" method="post">
    username:<input name="username"/> <br>
    password:<input type="password" name="password"/> <br>
    salary:<input type="number" name="salary"/> <br>
    age:<input type="number" name="age"/> <br>
    sex:<input type="radio" name="sex" value="M" /> 男
    <input type="radio" name="sex" value="FM" /> 女 <br>
    hobby:
    <input type="checkbox" name="hobby" value="ds"> 读书
    <input type="checkbox" name="hobby" value="qdmjd"> 敲代码
    <input type="checkbox" name="hobby" value="ly"> 驴友
    <br>
    <input type="date" name="bornDate">
    <br>
    <input type="submit">
</form>
</body>
</html>
