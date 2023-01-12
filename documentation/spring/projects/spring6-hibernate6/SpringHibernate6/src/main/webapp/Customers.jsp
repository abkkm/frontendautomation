<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malos
  Date: 07.06.2021
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<table border="1" cellpadding="5">
    <tr>
        <th>id</th>
        <th>user login</th>
        <th>user password</th>
        <th>user email</th>
    </tr>

    <jsp:useBean id="Table" scope="request" type="java.util.List"/>
    <c:forEach var="row" items="${Table}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.userLogin}"/></td>
            <td><c:out value="${row.userPassword}"/></td>
            <td><c:out value="${row.userEmail}"/></td>
        </tr>
    </c:forEach>
</table>

<form method="post" action="${pageContext.request.contextPath}/Customers">
    <br>user login<br>
    <label>
        <input type="text" name="userLoginAdd">
    </label>
    <br>user password<br>
    <label>
        <input type="text" name="userPasswordAdd">
    </label>
    <br>user email<br>
    <label>
        <input type="text" name="userEmailAdd">
    </label>
    <br><br>
    <input type="submit" name="addButton" value="Save"/>
</form>

<form method="post" action="${pageContext.request.contextPath}/Customers">
    <br>user id<br>
    <label>
        <input type="text" name="userIdUp">
    </label>
    <br>user login<br>
    <label>
        <input type="text" name="userLoginUp">
    </label>
    <br>user password<br>
    <label>
        <input type="text" name="userPasswordUp">
    </label>
    <br>category email<br>
    <label>
        <input type="text" name="userEmailUp">
    </label>
    <br><br>
    <input type="submit" name="updateButton" value="Update"/>
</form>

<form method="post" action="${pageContext.request.contextPath}/Customers">
    <br>user id<br>
    <label>
        <input type="text" name="id">
    </label>
    <br><br>
    <input type="submit" name="deleteButton" value="Delete"/>
</form>

<form method="post" action="${pageContext.request.contextPath}/">
    <input type="submit" name="Menu" value="Menu"/>
</form>
</body>
</html>
