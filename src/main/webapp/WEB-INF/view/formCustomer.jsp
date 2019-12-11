<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            
    </head>
    <body>
        <c:choose>
            <c:when test="${customer.ccode != 0}">
                <h1>Update Customer</h1>
            </c:when>
            <c:otherwise>
                <h1>Create Customer</h1>
            </c:otherwise>
        </c:choose>
            <form:form id="formCustomer"
            action="${pageContext.request.contextPath}/customer/create" 
            method="POST"
            modelAttribute="customer">
            <form:hidden path="ccode"/>
            Name: <form:input id="cname" path="cname"/>
            <br/>
            <input type="submit" value="Submit">
        </form:form>
        <br/>
        <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
    </body>
    
</html>
