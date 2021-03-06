package controllers;// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: "${PACKAGE_NAME}"
// *****        ******        ******    ***** Project: NguyenHoangAnh_test02
// *****    *    ****    *    ******    ***** Date: 30-Jan-18
// *****    **    **    **    ******    ***** Time: 10:53
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************


import entities.Employee;
import repository.MyXmlHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet
{
    MyXmlHandler db = new MyXmlHandler();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Employee e = new Employee();
        e.setId(request.getParameter("id"));
        e.setName(request.getParameter("name"));
        e.setPassword(request.getParameter("password"));
        e.setRole(request.getParameter("role"));
        e.setGender(request.getParameter("gender"));
        e.setAge(Integer.parseInt(request.getParameter("age")));
        db.putEmployee(e);
        response.sendRedirect("ListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Employee e = db.findById(request.getParameter("id"));
        request.setAttribute("e", e);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }
}
