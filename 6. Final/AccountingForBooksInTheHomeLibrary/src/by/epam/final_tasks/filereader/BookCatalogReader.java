package by.epam.final_tasks.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import by.epam.final_tasks.books_in_electronic_form.EBookList;

public class BookCatalogReader {
	private File bookCatalog;
	private String stroka = "";
	private EBookList eBookList;

	public BookCatalogReader() {
	}

	public BookCatalogReader(String fileName) throws FileNotFoundException {
		String separator = File.separator;
		String bookCatalogPath = "C:" + separator + "Users" + separator + "nikit" + separator + "eclipse-workspace"
				+ separator + "6. Final" + separator + "AccountingForBooksInTheHomeLibrary" + separator + fileName;

		this.bookCatalog = new File(bookCatalogPath);

		Scanner scanner = new Scanner(bookCatalog);

		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			this.stroka += string + "\n";
		}
		scanner.close();

		this.eBookList = new EBookList();

		for (int i = 0; i < this.eBookList.geteBookList().size(); i++) {
			this.stroka += this.eBookList.geteBookList().get(i);
		}
		this.writeToFile(this.stroka);
	}

	public void writeToFile(String str) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(this.bookCatalog);
		pw.print(str);
		pw.close();
	}

	public File getBookCatalog() {
		return bookCatalog;
	}

	public void setBookCatalog(File bookCatalog) {
		this.bookCatalog = bookCatalog;
	}

	public String getStroka() {
		return stroka;
	}

	public void setStroka(String stroka) {
		this.stroka = stroka;
	}

	public void addToStroka(String stroka) {
		this.stroka += stroka;
	}

	public EBookList geteBookList() {
		return eBookList;
	}

	public void seteBookList(EBookList eBookList) {
		this.eBookList = eBookList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookCatalog == null) ? 0 : bookCatalog.hashCode());
		result = prime * result + ((eBookList == null) ? 0 : eBookList.hashCode());
		result = prime * result + ((stroka == null) ? 0 : stroka.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookCatalogReader other = (BookCatalogReader) obj;
		if (bookCatalog == null) {
			if (other.bookCatalog != null)
				return false;
		} else if (!bookCatalog.equals(other.bookCatalog))
			return false;
		if (eBookList == null) {
			if (other.eBookList != null)
				return false;
		} else if (!eBookList.equals(other.eBookList))
			return false;
		if (stroka == null) {
			if (other.stroka != null)
				return false;
		} else if (!stroka.equals(other.stroka))
			return false;
		return true;
	}
}
