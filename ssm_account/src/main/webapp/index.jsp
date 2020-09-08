<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>

<html>
<body>
<h2>欢迎来到Java9 银行</h2>
<a href="account/findAll">查询所有账户</a>

<h3>添加账户</h3>
<form action="account/save">
    姓名： <input type="text" name="name"> <br>
    金额： <input type="text" name="money"> <br>
    <input type="submit" value="保存">
</form>



</body>
</html>
