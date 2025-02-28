<%--
  Created by IntelliJ IDEA.
  User: xiaozhai
  Date: 2025/2/27
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>用户注册</title>
  <link rel="stylesheet" href="css/register.css">
</head>
<body>

<div class="container">
  <h2>用户注册</h2>
  <form id="registerForm" action="/register" method="post">
    <div class="input-group">
      <label for="username">用户名</label>
      <input type="text" id="username" name="username">
      <p class="error" id="usernameError">用户名长度必须大于 3</p>
    </div>
    <div class="input-group">
      <label for="email">邮箱</label>
      <input type="email" id="email" name="email">
      <p class="error" id="emailError">请输入有效的邮箱</p>
    </div>
    <div class="input-group">
      <label for="password">密码</label>
      <input type="password" id="password" name="password">
      <p class="error" id="passwordError">密码长度必须大于 6</p>
    </div>
    <div class="input-group">
      <label for="confirmPassword">确认密码</label>
      <input type="password" id="confirmPassword" name="confirmPassword">
      <p class="error" id="confirmPasswordError">两次密码输入不一致</p>
    </div>
    <button type="submit">注册</button>
  </form>
</div>

<script src="js/register.js"> </script>

</body>
</html>
