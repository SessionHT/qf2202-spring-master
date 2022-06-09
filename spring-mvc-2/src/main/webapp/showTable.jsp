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
<div id="timer"></div>
<div>
    <button id="btn1">点我啊~</button>
</div>
<table>
    <thead>
    <th>
        <tr>
            <td>用户id</td>
            <td>用户名</td>
            <td>用户密码</td>
            <td>用户性别</td>
            <td>用户年龄</td>
        </tr>
    </th>
    </thead>
    <tbody id="tb">

    </tbody>
</table>

    <script>
        $(function () {
                $("#timer").html(new Date());
                $("#btn1").click(function () {
                    //发送ajax请求
                    $.ajax({
                        type:"get",
                        url:"/user/getUserList",
                        success:function (result) {
                            //已经被转为js 对象数组
                            for (let x in result) {
                                $("#tb").append("<tr>" +
                                    "    <td>"+result[x].uno+"</td>" +
                                    "    <td>"+result[x].username+"</td>" +
                                    "    <td>"+result[x].password+"</td>" +
                                    "    <td>"+result[x].sex+"</td>" +
                                    "    <td>"+result[x].age+"</td>" +
                                    "</tr>")
                            }
                        }
                    })



                })
        })
    </script>
</body>
</html>
