<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malos
  Date: 03.06.2021
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
</head>

<body>
    <table border="1" cellpadding="5">
        <tr>
            <th>id</th>
            <th>category name</th>
            <th>products</th>
        </tr>
        <jsp:useBean id="categoryTable" scope="request" type="java.util.List"/>
        <c:forEach var="row" items="${categoryTable}">
            <tr>
                <td><c:out value="${row.id}"/></td>
                <td><c:out value="${row.categoryName}"/></td>
                <td><c:out value="${row.products}"/></td>
            </tr>
        </c:forEach>
    </table>

    <form method="post" action="${pageContext.request.contextPath}/Category">
        <br>category name<br>
        <label>
            <input type="text" name="categoryName">
        </label>
        <br><br>
        <input type="submit" name="addButton" value="Save"/>
    </form>

    <form method="post" action="${pageContext.request.contextPath}/Category">
        <br>category id<br>
        <label>
            <input type="text" name="categoryId">
        </label>
        <br>category name<br>
        <label>
            <input type="text" name="categoryName">
        </label>
        <br><br>
        <input type="submit" name="updateButton" value="Update"/>
    </form>

    <form method="post" action="${pageContext.request.contextPath}/Category">
        <br>category id<br>
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
