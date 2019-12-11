<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Form</title>
    </head>
    <body>
        <h1>Choose your pizza</h1>
        <form action="${pageContext.request.contextPath}/order/create" method="POST">
            <h3>Choose bread size:</h3>
            <input type="radio" name="bread" value="Large">Large<br/>
            <input type="radio" name="bread" value="Medium">Medium<br/>
            <input type="radio" name="bread" value="Small">Small<br/>
            
            <h3>Choose ingredients:</h3>
            <input type="checkbox" name="ingredient" value="Potatoes">Potatoes<br/>
            <input type="checkbox" name="ingredient" value="Tomatoes">Tomatoes<br/>
            <input type="checkbox" name="ingredient" value="Sausage">Sausage<br/>
            
            <h3>Choose payment method:</h3>
            <select name="payment">
                <option value="Credit card">Credit Card</option>
                <option value="Cash">Cash</option>
            </select>
            
            <h3>Enter your details:</h3>
            Name: <input type="text" name="name"><br/>
            Age: <input type="number" name="age" min="0"><br/>
            
            <input type="submit" value="Order">
        </form>
    </body>
</html>
