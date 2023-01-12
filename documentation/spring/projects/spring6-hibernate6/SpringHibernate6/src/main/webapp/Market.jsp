<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malos
  Date: 08.06.2021
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Market</title>
</head>
<body>
<table border="1" cellpadding="5">
    <tr>
        <th>id</th>
        <th>product</th>
        <th>amount</th>
    </tr>

    <jsp:useBean id="Table" scope="request" type="java.util.List"/>
    <c:forEach var="row" items="${Table}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.productMarket}"/></td>
            <td><c:out value="${row.marketAmount}"/></td>
        </tr>
    </c:forEach>
</table>


<form method="post" action="${pageContext.request.contextPath}/Market">
    <br>amount<br>
    <label>
        <input type="text" name="marketAmountAdd">
    </label>
    <br>product id<br>
    <label>
        <input type="text" name="productIdAdd">
    </label>

    <br><br>
    <input type="submit" name="addButton" value="Save"/>
</form>


<form method="post" action="${pageContext.request.contextPath}/Market">
    <br>pos id<br>
    <label>
        <input type="text" name="posId">
    </label>

    <br>amount<br>
    <label>
        <input type="text" name="marketAmountUp">
    </label>

    <br>product id<br>
    <label>
        <input type="text" name="productIdUp">
    </label>

    <br><br>
    <input type="submit" name="updateButton" value="Update"/>
</form>


<form method="post" action="${pageContext.request.contextPath}/Market">
    <br>pos id<br>
    <label>
        <input type="text" name="idPosDel">
    </label>
    <br><br>
    <input type="submit" name="deleteButton" value="Delete"/>
</form>


<form method="post" action="${pageContext.request.contextPath}/">
    <input type="submit" name="Menu" value="Menu"/>
</form>

</body>
</html>
