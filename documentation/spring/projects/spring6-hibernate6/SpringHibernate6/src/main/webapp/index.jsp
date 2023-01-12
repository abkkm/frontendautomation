<%@ page import="jdk.jfr.MetadataDefinition" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.SpringHibernate6.Db" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<br>
    <h1>Choose table</h1>
    <%
        List<String> tableNames=new ArrayList<>(Arrays.asList("Category","Customers","Deliveries","Market","Products","Sales","Suppliers"));
        request.setAttribute("tableNames",tableNames);
    %>
<br/>
    <ur>
        <c:forEach var="tableName" items="${tableNames}">
            <li>
                <a href="<c:url value='${tableName}'/>">${tableName}</a>
            </li>
        </c:forEach>
    </ur>
</body>
</html>