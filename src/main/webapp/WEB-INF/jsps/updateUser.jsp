<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<script type="text/javascript">
    function back() {
        window.history.go(-1);
    }
</script>
<body>
<h2>修改客户</h2>

<div>
    <form action="<%=request.getContextPath()%>/user/updateUser" method="post">
        <table>
            <tr>
                <td>编号</td><td><input type="text" name="userId" value="${user.userId}" readonly></td>
            </tr>
            <tr>
                <td>用户名</td><td><input type="text" name="userName" value="${user.userName}"></td>
            </tr>
            <tr>
                <td>密码</td><td><input type="text" name="userPass" value="${user.userPass}"></td>
            </tr>
            <tr>
                <td>年龄</td><td><input type="text" name="userAge" value="${user.userAge}"></td>
            </tr>
            <tr>
<%--                <td>性别</td><td><input type="text" name="userSex" value="${user.userSex}"></td>--%>
                <td>性别</td>
                <td>
                    <select name="userSex">
                        <c:if test="${user.userSex=='女'}">
                            <option value="男">男</option>
                            <option value="女" selected="selected">女</option>
                        </c:if>
                        <c:if test="${user.userSex=='男'}">
                            <option value="男" selected="selected">男</option>
                            <option value="女">女</option>
                        </c:if>
<%--                        <option value="男">男</option>--%>
<%--                        <option value="女">女</option>--%>
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
