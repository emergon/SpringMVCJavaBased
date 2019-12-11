<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <c:set var = "path" value = "${pageContext.request.contextPath}"/>
        <h1>Welcome to Spring MVC!</h1>
        <p>
            Logged in as : ${user.username} |
            <a href="${path}/logout">Logout</a>
        </p>
        <!--http://localhost:8080/SpringMVCJavaBased/user?name=Nick-->
        <ul>
            <li><a href="${path}/user?name=Nick">Pass Attribute</a></li>
            <li> <a href="${path}/userdetails/Nick/10">User details</a></li>
            <li> <a href="${path}/customer/list">Show Customers</a></li>
            <li><a href="${path}/order/create">Order Pizza</a></li>
        </ul>
    </body>
</html>
