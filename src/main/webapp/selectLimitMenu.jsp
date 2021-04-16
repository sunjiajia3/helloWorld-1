<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>分页查询菜单的页面</title>
</head>
<body>
    <center>
        <h2>菜单信息</h2>
            <table border="1">
                <tr>
                    <td>菜单ID</td>
                    <td>标题</td>
                    <td>状态</td>
                    <td>地址</td>
                    <td>上级ID</td>
                    <td>图片</td>
                </tr>
                <c:forEach var="menu" items="${menuinfoList}">
                    <tr>
                        <td>${menu.menuid}</td>
                        <td>${menu.title}</td>
                        <td>${menu.state}</td>
                        <td>${menu.url}</td>
                        <td>${menu.pid}</td>
                        <td>${menu.iconCls}</td>
                    </tr>
                </c:forEach>
            </table>
    </center>
</body>
</html>