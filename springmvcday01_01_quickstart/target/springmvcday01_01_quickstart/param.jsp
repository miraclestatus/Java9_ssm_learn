<%--
  Created by IntelliJ IDEA.
  User: Eric
  Date: 2020/9/7
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数绑定--%>
<a href="param/testParam?username=hehe&password=123456">请求参数绑定</a>

<form action="/param/saveAccount" method="post">
    姓名： <input type="text" name="username">
    密码： <input type="text" name="password">
    金额： <input type="text" name="money">
    用户姓名：<input type="text" name="user.uname">
    用户年龄：<input type="text" name="user.age">
    <input type="submit" value="提交">
</form>

<hr>

<form action="/param/saveAccount" method="post">
    姓名： <input type="text" name="username"> <br>
    密码： <input type="text" name="password"> <br>
    金额： <input type="text" name="money"> <br>
    用户姓名：<input type="text" name="list[0].uname"> <br>
    用户年龄：<input type="text" name="list[0].age"><br>
    用户姓名：<input type="text" name="map['first'].uname"> <br>
    用户年龄：<input type="text" name="map['first'].age"><br>
    <input type="submit" value="提交">
</form>

<form action="/param/saveUser" method="post">

    用户姓名：<input type="text" name="uname"> <br>
    用户年龄：<input type="text" name="age"><br>
    用户生日：<input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>

<a href="/param/testServlet?hehe='xixi'">servlet原生api</a>

</body>
</html>
