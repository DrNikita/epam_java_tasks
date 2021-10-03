package by.epam.final_tasks.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import by.epam.final_tasks.parser.Parser;
import by.epam.final_tasks.parser.Student;

public class Client {
	private static Socket clientSocket;
	private static BufferedReader in;
	private static PrintWriter out;

	public static void main(String[] args) throws SAXException, ParserConfigurationException {

		try {
			try {
				clientSocket = new Socket("127.0.0.1", 8080);
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())), true);

				String fileContent = "";
				int flag = in.read();

				while (flag != -1) {
					fileContent += (char) flag;
					flag = in.read();
				}
// Запись пришедшей строки с сервера в файл, расположенный на строне клиента 
				new ClientFunctions().writeInFile("ClientXmlFile.xml", fileContent);

// Парсинг клиентского файла (получен список студентов в удобном формате)
				ArrayList students = new Parser().parseDocument("ClientXmlFile.xml");

// Просмотр всех студентов:
//				System.out.println(students);

				out.write(fileContent);

				out.flush();

			} finally {
				clientSocket.close();
				in.close();
				out.close();
			}

		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
