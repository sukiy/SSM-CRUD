<%--
  Created by IntelliJ IDEA.
  User: Sukiy
  Date: 2018/1/30
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加班级</h2>
    <form action="${pageContext.request.contextPath}/clsAction/addCls" method="post">
        班级名称：<input name="cname"><br>
        <input type="submit" value="添加班级">
    </form>
<a href="index.jsp">首页</a>
</body>
</html>
