<%--
  Created by IntelliJ IDEA.
  User: Sukiy
  Date: 2018/1/31
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2>学生详细信息</h2>
    <table border="1">
        <tr>
            <td>学生序号</td>
            <td>学生姓名</td>
            <td>学生年龄</td>
            <td>所在班级</td>
            <td>管理</td>
        </tr>

        <c:forEach var="i" items="${stuList}" varStatus="ids">
            <tr>
                <td>${ids.count}</td>
                <td>${i.sname}</td>
                <td>${i.sage}</td>
                <td>${i.tbClass.cname}</td>
                <td><a href="javascript:update(${i.sno});">修改</a>|<a href="${pageContext.request.contextPath}/stuAction/deleteStu?sno=${i.sno}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
<a href="index.jsp">首页</a>

<div id="mydiv" style="border: 1px solid red;width: 300px;min-height: 100px;margin:-200px auto;display: none;">
    <h2>修改学生</h2>
    <form action="${pageContext.request.contextPath}/stuAction/updateStu" method="post">
                <input type="hidden" name="sno">
        学生姓名：<input name="sname"><br>
        学生年龄：<input name="sage"><br>
        所在班级：<select name="tbClass.cno">
                    <option value="">请选择班级</option>
                </select><br>
        <input type="submit" value="修改">
        <input type="button" value="取消" id="cancle">
    </form>
</div>
</body>
</html>
<script type="text/javascript">
    /*取消修改*/
    $("#cancle").click(function () {
        $("#mydiv").css("display","none");
    });

    function update(id) {
        $("#mydiv").css("display","block");
       $.post("${pageContext.request.contextPath}/stuAction/toUpdate","id="+id,function (data) {
            $("input[name='sno']").val(data.stu.sno);
           $("input[name='sname']").val(data.stu.sname);
           $("input[name='sage']").val(data.stu.sage);//这个在里面写参数？jquery给表单赋值你没用过吗？没有。。我跟你讲，不可能

           //绑定完这些普通表单元素之后，我接着绑定下拉框
           $.each(data.clsList, function (i,v) {
               $("select[name='tbClass.cno']").append("<option value='" + v.cno + "'>" + v.cname + "</option>");
           });

           //给下拉框绑定完值之后，我们还有一个默认选中的值
           var opt = $("select[name='tbClass.cno'] option");
           for(var i=0; i < opt.length; i++){
               if(opt[i].value == data.stu.tbClass.cno){
                   opt[i].selected = true;
               }
           }
       });
    }
</script>
