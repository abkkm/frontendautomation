<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deliveries</title>
</head>
<body>
<table border="border:solid" cellpadding="5">
    <tr>
        <th>id delivery</th>
        <th>product</th>
        <th>supplier</th>
        <th>date</th>
        <th>amount</th>
    </tr>

    <jsp:useBean id="Table" scope="request" type="java.util.List"/>
    <c:forEach var="row" items="${Table}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.product}"/></td>
            <td><c:out value="${row.suppliers}"/></td>
            <td><c:out value="${row.deliveryDate}"/></td>
            <td><c:out value="${row.deliveryAmount}"/></td>
        </tr>
    </c:forEach>
</table>
<table>
    <tr>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <tr>
        <td>
<form method="post" action="${pageContext.request.contextPath}/Deliveries">
    <br>id product<br>
    <label>
        <input type="text" name="idProduct">
    </label>
    <br>id supplier<br>
    <label>
        <input type="text" name="idSupplier">
    </label>
    <br>delivery date<br>
    <label>
        <input type="text" name="dateDel">
    </label>
    <br>delivery amount<br>
    <label>
        <input type="text" name="amountDel">
    </label>
    <br><br>
    <input type="submit" name="addButton" value="Save"/>
</form>
        </td>
        <td>
            <form method="post" action="${pageContext.request.contextPath}/Deliveries">
                <br>id delivery<br>
                <label>
                    <input type="text" name="idDeliveryUp">
                </label>
                <br>id product<br>
                <label>
                    <input type="text" name="idProductUp">
                </label>
                <br>id supplier<br>
                <label>
                    <input type="text" name="idSupplierUp">
                </label>
                <br>delivery date<br>
                <label>
                    <input type="text" name="dateDelUp">
                </label>
                <br>delivery amount<br>
                <label>
                    <input type="text" name="amountDelUp">
                </label>
                <br><br>
                 <input type="submit" name="updateButton" value="Update"/>
            </form>
        </td>
        <td>
            <form method="post" action="${pageContext.request.contextPath}/Deliveries">
                <br>delivery id<br>
                <label>
                    <input type="text" name="idDel">
                </label>
                <br><br>
                <input type="submit" name="deleteButton" value="Delete"/>
</form>
        </td>
    </tr>
</table>

<form method="post" action="${pageContext.request.contextPath}/">
    <input type="submit" name="Menu" value="Menu"/>
</form>

<form method="post" action="${pageContext.request.contextPath}/Deliveries">
<label for="product">Selected product</label>
    <select id="product" name="productName">
        <option value="none">none</option>
        <jsp:useBean id="products" scope="request" type="java.util.HashSet"/>
        <c:forEach var="product" items="${products}">
            <option value="${product}">${product}</option>
        </c:forEach>
    </select>
    <input type="submit" name="filterProd" value="filter out"/>
</form>

<form method="post" action="${pageContext.request.contextPath}/Deliveries">
    <label for="supplier">Selected supplier</label>
    <select id="supplier" name="supplierAddress">
        <option value="none">none</option>
        <jsp:useBean id="suppliers" scope="request" type="java.util.HashSet"/>
        <c:forEach var="supplier" items="${suppliers}">
            <option value="${supplier}">${supplier}</option>
        </c:forEach>
    </select>
    <input type="submit" name="filterSup" value="filter out"/>
</form>

</body>
</html>
