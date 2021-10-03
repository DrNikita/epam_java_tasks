package by.epam.final_tasks.books_in_electronic_form;

import java.util.ArrayList;
import by.epam.final_tasks.filereader.*;
import by.epam.final_tasks.options.Options;

import java.io.FileNotFoundException;

public class EBookList {
	private static ArrayList<String> eBookList = new ArrayList<String>();

	public EBookList() {
	}

	public EBookList(Book book) {

		String eBookData = "Electronic book ###" + book.getId() + "\nName: " + book.getName() + ";\nAuthor: "
				+ book.getAuthor() + ";\nNumber of pages: " + book.getNumberOfPages()
				+ ".\n_________________________\n";

		EBookList.eBookList.add(eBookData);
	}

	public static ArrayList<String> geteBookList() {
		return eBookList;
	}

	public static void seteBookList(ArrayList<String> eBookList) {
		EBookList.eBookList = eBookList;
	}
}
