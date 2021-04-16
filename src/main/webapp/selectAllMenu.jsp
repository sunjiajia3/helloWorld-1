<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>查询菜单的页面</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
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
                    <td>操作</td>
                </tr>
                <%--循环取出结果集--%>
                <c:forEach var="menu" items="${menuinfoList}">
                    <tr>
                        <td>${menu.menuid}</td>
                        <td>${menu.title}</td>
                        <td>${menu.state}</td>
                        <td>${menu.url}</td>
                        <td>${menu.pid}</td>
                        <td>${menu.iconcls}</td>
                        <td>
                            <button onclick="deleteMenuById(${menu.menuid})">删除</button>
                            <button>新增</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>

    </center>
</body>
<script type="text/javascript">
    function deleteMenuById(id){
        alert(id);//得到id
        //使用Ajax调用后台删除的方法
        $.ajax({
            type: "post",
            data: "menuid="+id,
            url: "deleteMenuById",
            success: function () {
                //删除后刷新当前页面
                //重新加载数据表格
                table.reload('idTest', {
                    url: 'selectAllMenu'
                    ,where: {} //设定异步数据接口的额外参数
                    //,height: 300
                });
            }
        });
    }

</script>
</html>