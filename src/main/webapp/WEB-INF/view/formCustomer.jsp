<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create Customer</h1>
        <form:form 
            action="${pageContext.request.contextPath}/customer/create" 
            method="POST"
            modelAttribute="customer">
            Name: <form:input path="cname"/>
            <br/>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
