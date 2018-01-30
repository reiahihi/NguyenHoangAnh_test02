<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: 
// *****        ******        ******    ***** Project: NguyenHoangAnh_test02
// *****    *    ****    *    ******    ***** Date: 30-Jan-18
// *****    **    **    **    ******    ***** Time: 09:16
// *****    ***        ***    ******    ***** Name: Home
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Home page</h1>

<table border="1" cellspacing="0" cellpadding="5">
    <caption><h1>List of Employee</h1></caption>
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Age</td>
        <td>Gender</td>
        <td>Role</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td>${e.gender}</td>
            <td>${e.role}</td>
            <td>
                <a href="DeleteServlet?id=${e.id}" >Delete</a> |
                <a href="UpdateServlet?id=${e.id}">Update</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

<a href="create.jsp">Add new employee</a>


</body>
</html>
