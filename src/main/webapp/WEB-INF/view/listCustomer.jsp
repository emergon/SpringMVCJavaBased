<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link
            type="text/css" rel="stylesheet"
            href="${pageContext.request.contextPath}/static/css/style.css">
    </head>
    <body>

        <h1>List of Customers</h1>
        <a href="${pageContext.request.contextPath}/customer/create">Create Customer</a>

        <form:form action="${pageContext.request.contextPath}/customer/search" method="GET">
            Search Name: <input type="text" name="searchName" size="10">
            <input type="submit" value="Search">
        </form:form>

        <table border="1">
            <c:forEach items="${listOfCustomer}" var="c">
                <c:url value="/customer/delete" var="deleteLink" >
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
                        <a href="${deleteLink}"
                           onclick="if (!(confirm('Are you sure you want to delete customer with name: ${c.cname}?')))
                                   return false"
                           >Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
