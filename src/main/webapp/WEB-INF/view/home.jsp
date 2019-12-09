<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Spring MVC!</h1>
        <!--http://localhost:8080/SpringMVCJavaBased/user?name=Nick-->
        <a href="${pageContext.request.contextPath}/user?name=Nick">Pass Attribute</a>
        <a href="${pageContext.request.contextPath}/userdetails/Nick/10">User details</a>
        <a href="${pageContext.request.contextPath}/customer/list">Show Customers</a>
        
    </body>
</html>
