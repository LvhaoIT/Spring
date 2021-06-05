<%--
  Created by IntelliJ IDEA.
  User: asus
  Name: 吕昊
  Number: 20180508145
  Date: 2021/6/5
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
</head>
<body>
<center>
    <p>学生注册</p>
    <form action="reg" method="post">
        <table border="2">
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <input type="text" name="userName">
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    性别：
                </td>
                <td>
                    男<input type="radio" name="sex" value="男">
                    女<input type="radio" name="sex" value="女">
                </td>
            </tr>
            <tr>
                <td>
                    邮箱：
                </td>
                <td>
                    <input type="text" name="email">
                </td>
            </tr>

            <tr>
                <td>
                    <input type="reset" value="重置">
                </td>
                <td>
                    <input type="submit" value="注册">
                </td>
            </tr>
        </table>
    </form>

</center>
</body>
</html>
