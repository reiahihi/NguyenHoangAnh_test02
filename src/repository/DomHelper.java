package repository;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: repository
// *****        ******        ******    ***** Project: PAML_NguyenHoangAnh_Assignment03
// *****    *    ****    *    ******    ***** Date: 25-Jan-18
// *****    **    **    **    ******    ***** Time: 13:02
// *****    ***        ***    ******    ***** Name: DomHelper
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


class DomHelper
{
    private final static String path_to_file = "E:\\FPTProjects\\NguyenHoangAnh_test02\\src\\resources\\data.xml";

     Document getDocument()
    {
        Document d = null;
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            d = db.parse(path_to_file);
        }
        catch (Exception ex)
        {
            return d = null;
        }
        return d;
    }

     void createElement(Document d ,Element e , String key , String value)
    {
        Element temp = d.createElement(key);
        temp.appendChild(d.createTextNode(value));
        e.appendChild(temp);
    }

     void saveXMLContent(Document d)
    {
        try
        {
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(d);
            StreamResult rs = new StreamResult(path_to_file);
//            StreamResult rs = new StreamResult("E:\\FPTProjects\\PAML_NguyenHoangAnh_Assignment03\\src\\resources\\data1.xml");
            tf.transform(source, rs);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }


}
