<%--
  Created by IntelliJ IDEA.
  User: Sukiy
  Date: 2018/1/30
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加学生</h2>
<form action="${pageContext.request.contextPath}/stuAction/addStu" method="post">
    学生姓名：<input name="sname"><br>
    学生年龄：<input name="sage"><br>
    所在班级：<select name="tbClass.cno">
                <option value="">请选择班级</option>
                <c:forEach items="${clsList}" var="cls">
                    <option value="${cls.cno}">${cls.cname}</option>
                </c:forEach>
             </select><br>
    <input type="submit" value="添加">
</form>
<a href="${pageContext.request.contextPath}/main.jsp">首页</a>
</body>
</html>
