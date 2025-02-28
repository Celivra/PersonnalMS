<%@ page import="com.celivra.personnalms.Entity.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登入</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<div class="login-container">
    <h2>登入</h2>
    <p id="hiddenText" class="error_text"></p>
    <form id="loginForm" action="login" method="post" onsubmit="return validateForm()">
        <div class="input-group">
            <label for="username">用户名:</label>
            <input type="text" id="username" name="username" placeholder="输入用户名" required>
            <span id="usernameError" class="error-message"></span>
        </div>
        <div class="input-group">
            <label for="password">密码:</label>
            <input type="password" id="password" name="password" placeholder="输入密码" required>
            <span id="passwordError" class="error-message"></span>
        </div>
        <button type="submit" class="btn">Login</button>
    </form>
    <p class="signup">没有账户？<a href="Register.jsp">注册一个</a></p>
</div>

<script src="js/login.js">
</script>
<script>
    <%!
        String mySession = null;
    %>
    <%
        HttpSession session1 = request.getSession(false);
        if(session1.getAttribute("UserNotFound") != null){
            mySession = "UserNotFound";
        }else if(session1.getAttribute("NotPassword") != null){
            mySession = "NotPassword";
        }
        System.out.println(mySession);
    %>
    showText('<%=mySession%>')
</script>
</body>
</html>
