<%--
  Created by IntelliJ IDEA.
  User: Eric
  Date: 2020/9/8
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>查询所有账户</h4>
<c:forEach items="${list}" var="acount">
    ${acount.name} <br>
    ${acount} <br>
</c:forEach>


</body>
</html>
