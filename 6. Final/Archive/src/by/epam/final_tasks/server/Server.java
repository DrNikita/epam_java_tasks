package by.epam.final_tasks.server;

//  Попробуйте решить данную задачу хотя бы на 50%.
//  Задание 3: создайте клиент-серверное приложение “Архив”.
//    Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
//    Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static Socket clientSocket;
	private static ServerSocket server;
	private static BufferedReader in;
	private static PrintWriter out;

	public static void main(String[] args) throws FileNotFoundException {

		try {

			try {
				server = new ServerSocket(8080);
				clientSocket = server.accept();

				try {
					in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())));

					File archive = new File("Archive.xml");
					ServerFunctions functions = new ServerFunctions();

					out.write(functions.readTheFile(archive));

					out.flush();
					
					String stringContent = "";
					int flag = in.read();

					while (flag != -1) {
						stringContent += (char) flag;
						flag = in.read();
					}

					System.out.println(stringContent);

				} finally {
					clientSocket.close();
					in.close();
					out.close();
				}

			} finally {
				server.close();
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
