package by.epam.final_tasks.print_write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import by.epam.final_tasks.notebook.Note;

public class FileModification {
	private File notebook = new File("Notebook");
	private String fileContent = "";

	public String readFileData() throws FileNotFoundException {
		Scanner scanner = new Scanner(this.notebook);

		while (scanner.hasNextLine()) {
			this.fileContent += scanner.nextLine() + "\n";
		}
		scanner.close();
		return this.fileContent;
	}

	public void addToContent(Note note) throws FileNotFoundException {
			this.fileContent += note.getNote();
			PrintWriter pw = new PrintWriter(this.notebook);
			pw.print(this.fileContent);
			pw.close();
	}

	public void clearFile() throws FileNotFoundException {
		this.fileContent = "";
		PrintWriter pw = new PrintWriter(this.notebook);
		pw.print(this.fileContent);
		pw.close();
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
}
