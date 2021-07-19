<%--
  Created by IntelliJ IDEA.
  User: 15995
  Date: 2021/7/16
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function test() {
        window.open("<%=request.getContextPath()%>/user/getUsers", "_self")
    }
</script>
<body>
    <button id="test" onclick="test()">测试</button>
</body>
</html>
