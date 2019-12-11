<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Details</title>
    </head>
    <body>
        <h1>You ordered a yummmmy pizza!</h1>
        <p><b>Bread size:</b> ${bread}</p>
        <p><b>Ingredients:</b></p>
        <ul>
            <c:forEach items="${ingredient}" var="i">
                <li>${i}</li>
            </c:forEach>
        </ul>
        <p><b>Payment method:</b> ${payment}</p>
        <br/>
        <p><b>Your details</b></p>
        <b>Name:</b> ${name}<br/>
        <b>Age:</b> ${age}
        <br/>
        <p>Thank you for your order</p>
        <p>
            <a href="${pageContext.request.contextPath}/">Home</a>
        </p>
    </body>
</html>
