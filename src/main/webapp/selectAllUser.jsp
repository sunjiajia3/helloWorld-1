<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>用户查询所有的页面</title>
</head>
<body>
    <center>
        <h2>所有用户信息</h2>
            <table border="1">
                <tr>
                    <td>用户ID</td>
                    <td>用户账号</td>
                    <td>用户密码</td>
                    <td>用户名</td>
                    <td>状态</td>
                </tr>
                <c:forEach var="user" items="${userinfoList}">
                    <tr>
                        <td>${user.userid}</td>
                        <td>${user.username}</td>
                        <td>${user.userpass}</td>
                        <td>${user.compellation}</td>
                        <td>${user.state}</td>
                    </tr>
                </c:forEach>
            </table>
    </center>
</body>
</html>