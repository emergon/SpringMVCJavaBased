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
            <c:url var="deleteLink" value="/customer/delete">
                <c:param name="customerId" value="${c.ccode}" />
            </c:url>
            <c:url var="updateLink" value="/customer/update">
                <c:param name="customerId" value="${c.ccode}" />
            </c:url>
            
            <tr>
                <td>${c.ccode}</td>
                <td>${c.cname}</td>
                <td>
                    <a href="${updateLink}">Update</a>
                </td>
                <td>
                    <a href="${deleteLink}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
