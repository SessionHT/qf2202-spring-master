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
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
<form action="/user/doLogin" method="post">
    <input type="text" name="username"> <br>
    <input type="password" name="password"> <br>
    <input type="submit" value="登录">
</form>
<h1>${msg}</h1>
<hr>
<script>
    $(function () {
        $("[name='username']").change(function () {
            //发送ajax请求
            // javascript ->
            // var xhr = new XMLHttpRequest();
            // xhr.open("get","");
            // xhr.send();
            // if (xhr.readyState==4&& xhr.status==200) {
            //   let responseText = xhr.responseText;
            // }
            //$.get();
            //$.post();
            $.ajax({
                url: "/user/checkName/"+this.value,
                type: "get",
                success: function (result) {
                    if (result==1) {
                        alert("用户名ok,你可以开始试密码了");
                    }else{
                        alert("没用该用户名存在,请问了再来");
                    }
                }
            })


        })
    })
</script>
</body>
</html>
