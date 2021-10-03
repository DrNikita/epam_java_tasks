package by.epam.final_tasks.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {
	private String name;
	private String gender;
	private String age;
	private String location;
	private String mobileNumber;

	public ArrayList<Student> parseDocument(String fileName)
			throws SAXException, IOException, ParserConfigurationException {
		Document doc = this.buildDocument(fileName);
		Node studentsNode = doc.getFirstChild();
		NodeList students = studentsNode.getChildNodes();

		for (int i = 0; i < students.getLength(); i++) {
			if (students.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			NodeList studentData = students.item(i).getChildNodes();

			for (int j = 0; j < students.getLength(); j++) {
				if (studentData.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}

				switch (studentData.item(j).getNodeName()) {

				case ("name"):
					this.name = studentData.item(j).getTextContent();
					break;

				case ("gender"):
					this.gender = studentData.item(j).getTextContent();
					break;

				case ("age"):
					this.age = studentData.item(j).getTextContent();
					break;

				case ("adress"):
					this.location = studentData.item(j).getTextContent();
					break;

				case ("mobile_phone"):
					this.mobileNumber = studentData.item(j).getTextContent();
					break;
				}
			}
			Student student = new Student(this.name, this.gender, this.age, this.location, this.mobileNumber);
		}
		return new Archive().getStudets();
	}

	private Document buildDocument(String fileName) throws SAXException, IOException, ParserConfigurationException {
		File xmlFile = new File(fileName);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document doc = dbf.newDocumentBuilder().parse(xmlFile);

		return doc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Parser [name=" + name + ", gender=" + gender + ", age=" + age + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]";
	}
}
