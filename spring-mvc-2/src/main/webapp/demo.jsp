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
<script>
    $(function () {
        // username=a&password=b&sex=M&age=18
        //json
        // 使用js user 对象数据
        var user = {uno:2,username:"法外狂徒张三",password:"123",sex:"男",age:18};
        //JSON 转为json字符串 传给controller
            $.ajax({
                url: "/rc/d3",
                data:JSON.stringify(user), //JSON.stringify(user) 对象转为json字符串
                contentType:"application/json",//标识为传输的数据是json类型的数据
                type: "post",//只要是传输json数据必须为post请求
                success: function (result) {

                }
            })
    })
</script>
</body>
</html>
