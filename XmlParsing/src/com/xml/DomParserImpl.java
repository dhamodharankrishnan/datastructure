package com.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserImpl {

	public static void main(String args[]) {
		File fXmlFile = new File("C:/Learning/Xml/books.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getElementsByTagName("book");
			for(int temp = 0; temp < nodeList.getLength(); temp++){
				Node nNode = nodeList.item(temp);
				System.out.println("Node Name :"+nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
				System.out.println("------------------");
					Element element = (Element) nNode;
					//NamedNodeMap nodeMap = nNode.getAttributes();
					System.out.println( "Category :"+element.getAttribute("category"));
					System.out.println( "cover :"+element.getAttribute("cover"));
					
					System.out.println("Title :"+element.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Author :"+element.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("Year :"+element.getElementsByTagName("year").item(0).getTextContent());
					System.out.println("Price :"+element.getElementsByTagName("price").item(0).getTextContent());
				}
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
