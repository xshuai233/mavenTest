<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript">
    function back() {
        window.history.go(-1);
    }
</script>
<body>
<h2>新增客户</h2>

<div>
    <form action="<%=request.getContextPath()%>/user/addUser" method="post">
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
<%--                <td>性别</td><td><input type="text" name="userSex"></td>--%>
                <td>性别</td>
                <td>
                    <select name="userSex">
<%--                        <option value="">请选择</option>--%>
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td><td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
<button id="back" onclick="back();">返回</button>
</body>
</html>
