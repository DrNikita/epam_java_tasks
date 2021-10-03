package by.epam.final_tasks.server;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ServerFunctions {

	public String readTheFile(File file) throws IOException {

		FileReader fileReader = new FileReader(file);
		String fileContent = "";
		int s = fileReader.read();

		while (s != -1) {
			fileContent += (char) s;
			
			s = fileReader.read();
		}
		fileReader.close();

		return fileContent;
	}
}
