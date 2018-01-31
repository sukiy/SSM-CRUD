<%--
  Created by IntelliJ IDEA.
  User: Sukiy
  Date: 2018/1/30
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>学生相关操作</h2>
    <a href="addCls.jsp">添加班级</a><br>
    <a href="${pageContext.request.contextPath}/stuAction/toAdd">添加学生</a><br>
    <a href="${pageContext.request.contextPath}/stuAction/findStuList">查询学生</a><br>
</body>
</html>
