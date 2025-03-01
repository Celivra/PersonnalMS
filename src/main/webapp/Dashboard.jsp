<%--
  Created by IntelliJ IDEA.
  User: xiaozhai
  Date: 2025/2/27
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--    HttpSession session1 = request.getSession(false);--%>
<%--    if(session1 == null || session1.getAttribute("LoggedIn") == null){--%>
<%--        response.sendRedirect("/");--%>
<%--        return;--%>
<%--    }--%>
<%--%>--%>

<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>人员管理</title>
    <link rel="stylesheet" href="css/dashboard.css">
</head>
<body>
<div class="container">
    <!-- 左侧功能按钮栏 -->
    <div class="sidebar">
        <h2>功能菜单</h2>
        <ul>
            <li id="btnAdd" onclick="showSection('add')">新增人员</li>
            <li id="btnView" onclick="showSection('view')">查看人员</li>
            <li id="btnEdit" onclick="showSection('edit')">编辑人员</li>
            <li id="btnDelete" onclick="showSection('delete')">删除人员</li>
        </ul>
    </div>

    <!-- 右侧操作区 -->
    <div class="main-content">
        <!-- 新增人员操作区 -->
        <div id="add" class="section" style="display:none;">
            <h3 class="h3">新增人员</h3>
            <form>
                <label for="name">姓名:</label>
                <input type="text" id="name" name="name"><br><br>
                <label for="gender">性别:</label>
                <input type="text" id="gender" name="gender"><br><br>
                <label for="age">年龄:</label>
                <input type="number" id="age" name="age"><br><br>
                <label for="birth">生日:</label>
                <input type="date" id="birth" name="birth"><br><br>
                <label for="email">邮箱:</label>
                <input type="text" id="email" name="email"><br><br>
                <label for="phone">手机:</label>
                <input type="text" id="phone" name="phone"><br><br>
                <label for="poli_look">政治面貌:</label>
                <input type="text" id="poli_look" name="poli_look"><br><br>
                <button type="submit">提交</button>
            </form>
        </div>

        <!-- 查看人员操作区 -->
        <div id="view" class="section" style="display:none;">
            <h3 class="h3">查看人员</h3>
            <table>
                <tr>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>职位</th>
                </tr>
                <tr>
                    <td>张三</td>
                    <td>28</td>
                    <td>经理</td>
                </tr>
                <tr>
                    <td>李四</td>
                    <td>35</td>
                    <td>技术主管</td>
                </tr>
            </table>
        </div>

        <!-- 编辑人员操作区 -->
        <div id="edit" class="section" style="display:none;">
            <h3 class="h3">编辑人员</h3>
            <form>
                <label for="editName">姓名:</label>
                <input type="text" id="editName" name="editName"><br><br>
                <label for="editAge">年龄:</label>
                <input type="number" id="editAge" name="editAge"><br><br>
                <label for="editPosition">职位:</label>
                <input type="text" id="editPosition" name="editPosition"><br><br>
                <button type="submit">提交</button>
            </form>
        </div>

        <!-- 删除人员操作区 -->
        <div id="delete" class="section" style="display:none;">
            <h3 class="h3">删除人员</h3>
            <form>
                <label for="deleteName">姓名:</label>
                <input type="text" id="deleteName" name="deleteName"><br><br>
                <button type="submit">删除</button>
            </form>
        </div>
    </div>
</div>

<script src="js/dashboard.js"></script>
</body>
</html>
