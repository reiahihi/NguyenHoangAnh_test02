package repository;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: repository
// *****        ******        ******    ***** Project: PAML_NguyenHoangAnh_Assignment03
// *****    *    ****    *    ******    ***** Date: 25-Jan-18
// *****    **    **    **    ******    ***** Time: 13:03
// *****    ***        ***    ******    ***** Name: MyXmlHandler
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import entities.Employee;
import org.w3c.dom.*;

import java.util.ArrayList;
import java.util.List;

public class MyXmlHandler
{
    private DomHelper dh = new DomHelper();
    private Document d = dh.getDocument();


    public List<Employee> getEmployee()
    {
        List<Employee> employees = new ArrayList<>();
        d = dh.getDocument();

        NodeList nList = d.getElementsByTagName("Employee");

        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == 1)
            {
                Element eElement = (Element) nNode;
                Employee b = new Employee();
                b.setId(eElement.getAttribute("id"));
                b.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                b.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                b.setAge(Integer.valueOf(eElement.getElementsByTagName("age").item(0).getTextContent()));
                b.setGender(eElement.getElementsByTagName("gender").item(0).getTextContent());
                b.setRole(eElement.getElementsByTagName("role").item(0).getTextContent());
                employees.add(b);
            }
        }
        return employees;
    }


    public void postBook(Employee e)
    {
        Element employees = d.getDocumentElement();

        Element employee = d.createElement("Employee");

        employee.setAttribute("id", e.getId());
        dh.createElement(d, employee, "name", e.getName());
        dh.createElement(d, employee, "password", e.getId());
        dh.createElement(d, employee, "age", e.getAge() + "");
        dh.createElement(d, employee, "gender", e.getGender());
        dh.createElement(d, employee, "role", e.getRole());
        employees.appendChild(employee);

        dh.saveXMLContent(d);
    }

    public void delete(Employee b)
    {
        Node store = d.getFirstChild();

        NodeList employees = d.getElementsByTagName("Employee");
        for (int i = 0; i < employees.getLength(); i++)
        {
            Node employee = employees.item(i);
            NamedNodeMap attr = employee.getAttributes();
            if (attr.getNamedItem("id").getNodeValue().equalsIgnoreCase(b.getId()))
            {
                store.removeChild(employee);
            }
        }

        dh.saveXMLContent(d);
    }

    public Employee findById(String id)
    {
        for (Employee b : getEmployee())
        {
            if (b.getId().equalsIgnoreCase(id))
            {
                return b;
            }
        }
        return null;
    }

    public Employee login(String id, String password)
    {
        for (Employee b : getEmployee())
        {
            if (b.getId().equalsIgnoreCase(id) && b.getPassword().equalsIgnoreCase(password))
            {
                return b;
            }
        }
        return null;
    }

    public void putEmployee(Employee e)
    {
        NodeList employees = d.getElementsByTagName("Employee");
        for(int i = 0; i < employees.getLength(); i++)
        {
            Node employee = employees.item(i);
            NamedNodeMap attr = employee.getAttributes();

            if(attr.getNamedItem("id").getNodeValue().equals(e.getId()))
            {

                NodeList list = employee.getChildNodes();

                for ( int j = 0 ; j < list.getLength(); j++)
                {
                    Node node = list.item(j);

                    if("password".equalsIgnoreCase(node.getNodeName()))
                    {
                        node.setTextContent(e.getPassword());
                    }

                    if("name".equalsIgnoreCase(node.getNodeName()))
                    {
                        node.setTextContent(e.getName());
                    }

                    if("age".equalsIgnoreCase(node.getNodeName()))
                    {
                        node.setTextContent(e.getAge()+"");
                    }

                    if("gender".equalsIgnoreCase(node.getNodeName()))
                    {
                        node.setTextContent(e.getGender());
                    }

                    if("role".equalsIgnoreCase(node.getNodeName()))
                    {
                        node.setTextContent(e.getRole());
                    }
                }
            }
        }

        dh.saveXMLContent(d);
    }

    public static void main(String[] args)
    {
        MyXmlHandler m = new MyXmlHandler();
        Employee e = new Employee("1q", "sad", "asdf", 233, "ehth", "trh");
//        m.postBook(e);
        m.delete(e);
//        m.putBook(e);
        System.out.println(m.getEmployee().size());
//        System.out.println(m.getEmployee().size());

    }
}
