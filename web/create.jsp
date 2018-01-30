<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: ${PACKAGE_NAME}
// *****        ******        ******    ***** Project: NguyenHoangAnh_test02
// *****    *    ****    *    ******    ***** Date: 30-Jan-18
// *****    **    **    **    ******    ***** Time: 09:11
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h1>Create new employee</h1>
<form action="CreateServlet" method="post">

id: <input type="text" id="id" name="id"><br>
password: <input type="text" id="password" name="password"><br>
name: <input type="text" id="name" name="name"><br>
age: <input type="text" id="age" name="age"><br>
gender: <input type="text" id="gender" name="gender"><br>
role: <input type="text" id="role" name="role"><br>
    <input type="submit" value="create">
</form>
</body>
</html>
