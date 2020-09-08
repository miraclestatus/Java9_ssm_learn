<%--
  Created by IntelliJ IDEA.
  User: Eric
  Date: 2020/9/8
  Time: 08:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/anno/testRequestParam?username=haha">testRequestParam</a>

<form action="/anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="username"> <br>
    用户年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
testPathVarible
<a href="/anno/testPathVarible/3">testPathVarible</a>

</body>
</html>
