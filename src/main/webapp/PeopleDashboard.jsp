<%@ page import="com.celivra.personnalms.LoginServlet" %><%--
  Created by IntelliJ IDEA.
  User: celivra
  Date: 2025/3/13
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession session1 = request.getSession(false);
%>
<%
    if(session1 == null || session1.getAttribute("LoggedIn") == null){
        response.sendRedirect("/");
        return;
    }
%>
<html>
<head>
    <title>用戶控制台</title>
</head>
<body>
  <p><%=LoginServlet.getLoggedUser()%></p>
</body>
</html>
