<%--
  Created by IntelliJ IDEA.
  User: 15995
  Date: 2021/7/16
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%--jstl标签库引入--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap.css">
</head>
<script type="text/javascript">
    function add() {
        window.open("<%=request.getContextPath()%>/user/jumpToAddUser", "_self");
    }
    function delCus(userId) {
        window.open("<%=request.getContextPath()%>/user/deleteUser/"+userId, "_self")
    }
    function updateCus(userId) {
        window.open("<%=request.getContextPath()%>/user/updateUser/"+userId, "_self")
    }
    function refresh() {
        window.location.reload()
    }
</script>
<body>
 <div  class="container">
    <button id="add" class="btn btn-primary" onclick="add()">新增客户</button>
    <button id="refresh" class="btn btn-primary" onclick="refresh()">刷新</button>

    <table class="table-bordered table-striped " width="1200px" border="1">
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td>性别</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.userPass}</td>
                <td>${user.userSex}</td>
                <td>${user.userAge}</td>
                <td>
                    <button id="del" onclick="delCus(${user.userId})" class="btn btn-danger">删除</button>
                    <button id="update" onclick="updateCus('${user.userId}')" class="btn btn-warning">修改</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
