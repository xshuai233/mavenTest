<%--
  Created by IntelliJ IDEA.
  User: 15995
  Date: 2021/7/16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <div>
        <form action="<%=request.getContextPath()%>/user/userLogin" method="post">
            <table border="1">
                <tr>
                    <td>用户名</td><td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>密码</td><td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="登录"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
