<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div align="center">
            <h3>Enter your credentials</h3>
            <p>${message}</p>
            <form action="${pageContext.request.contextPath}/login" method="POST">
                Username: <input type="text" name="username"><br/>
                Password: <input type="password" name="password"><br/>
                <input type="submit" value="Login">
            </form>
        </div>
    </body>
</html>
