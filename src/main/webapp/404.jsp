<%--
  Created by IntelliJ IDEA.
  User: xiaozhai
  Date: 2025/2/27
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>404 Not Found</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }

        .container {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 600px;
            width: 100%;
        }

        h1 {
            font-size: 5rem;
            margin: 0;
            color: #f44336;
        }

        h2 {
            font-size: 2rem;
            margin: 20px 0;
            color: #555;
        }

        p {
            font-size: 1.2rem;
            color: #777;
            margin-bottom: 30px;
        }

        .btn {
            padding: 12px 24px;
            background-color: #f44336;
            color: white;
            text-decoration: none;
            font-size: 1rem;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #d32f2f;
        }

        .emoji {
            font-size: 6rem;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="emoji">😕</div>
    <h1>404</h1>
    <h2>Page Not Found</h2>
    <p>bro以为这里有东西</p>
    <a href="/Dashboard.jsp" class="btn">回到控制台</a>
</div>

</body>
</html>
