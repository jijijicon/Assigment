<%-- 
    Document   : login
    Created on : Feb 12, 2022, 9:15:45 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="view/login/login.css">
    <title>Document</title>
</head>

<body>
    <div class="container">
        <div class="Login parent">
            <h1>tài khoản phụ huynh</h1>
            <form action="login" method="POST">
                <input type="text" placeholder="username" name="username"><br>
                <input type="password" placeholder="password" name="password"><br>
                <input id="par" type="submit" value="đăng nhập">
            </form>
        </div>
        
    </div>
</body>

</html>