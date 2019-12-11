<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <form:form 
                action="${pageContext.request.contextPath}/login" 
                method="POST"
                modelAttribute="user">
                Username: <form:input path="username"/><br/>
                Password: <form:input type="password" path="password"/><br/>
                <input type="submit" value="Login">
            </form:form>
        </div>
    </body>
</html>
