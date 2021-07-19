<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>测试</h2>

<div>
    <form action="<%=request.getContextPath()%>/user/testModel2" method="post">
        <table>
            <tr>
                <td>用户名</td><td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>密码</td><td><input type="password" name="userPass"></td>
            </tr>
            <tr>
                <td>年龄</td><td><input type="text" name="userAge"></td>
            </tr>
            <tr>
                <td>性别</td><td><input type="text" name="userSex"></td>
            </tr>
            <tr>
                <td></td><td><input type="submit" value="保存"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
