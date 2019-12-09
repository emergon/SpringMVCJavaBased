<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1>
        <a href="${pageContext.request.contextPath}/customer/create">Create Customer</a>
        <table border="1">
        <c:forEach items="${listOfCustomer}" var="c">
            <tr>
                <td>${c.ccode}</td>
                <td>${c.cname}</td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
