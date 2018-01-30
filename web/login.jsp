<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: 
// *****        ******        ******    ***** Project: NguyenHoangAnh_test02
// *****    *    ****    *    ******    ***** Date: 30-Jan-18
// *****    **    **    **    ******    ***** Time: 09:14
// *****    ***        ***    ******    ***** Name: login
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<h1>login page</h1>
<form action="LoginServlet" method="post">

    User ID: <input type="text" id="id" name="id" value="E001"/><br>
    password: <input type="password" id="password" name="password" value="123">
    <br>

    <input type="submit" value="Login">
</form>
</body>
</html>
