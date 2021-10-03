package by.epam.final_tasks.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClientFunctions {

	public void writeInFile(String fileName, String content) throws FileNotFoundException {
		File xmlDoc = new File(fileName);

		PrintWriter pw = new PrintWriter(xmlDoc);
		pw.write(content);
		pw.close();
	}
}
