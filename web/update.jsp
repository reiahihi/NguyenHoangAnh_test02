<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: 
// *****        ******        ******    ***** Project: NguyenHoangAnh_test02
// *****    *    ****    *    ******    ***** Date: 30-Jan-18
// *****    **    **    **    ******    ***** Time: 09:58
// *****    ***        ***    ******    ***** Name: update
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update employee</h1>
<form action="UpdateServlet" method="post">

    id: <input type="text" id="id" name="id" value="${e.id}"><br>
    password: <input type="text" id="password" name="password" value="${e.password}"><br>
    name: <input type="text" id="name" name="name" value="${e.name}"><br>
    age: <input type="text" id="age" name="age" value="${e.age}"><br>
    gender: <input type="text" id="gender" name="gender" value="${e.gender}"><br>
    role: <input type="text" id="role" name="role" value="${e.role}"><br>
    <input type="submit" value="update">
</form>
</body>
</html>
