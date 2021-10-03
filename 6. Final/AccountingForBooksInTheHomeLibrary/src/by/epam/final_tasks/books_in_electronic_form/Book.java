package by.epam.final_tasks.books_in_electronic_form;

import java.io.FileNotFoundException;

import by.epam.final_tasks.filereader.BookCatalogReader;

public class Book {
	private String name;
	private String author;
	private String numberOfPages;
	private int electronicBookId;
	private static int id;
	private static EBookList eBookList;
	BookCatalogReader catalogReader;

	public Book(String name, String author, String numberOfPages) throws FileNotFoundException {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.electronicBookId = id;
		id += 1;
		this.eBookList = new EBookList(this);
		this.catalogReader = new BookCatalogReader();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(String numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getElectronicBookId() {
		return electronicBookId;
	}

	public void setElectronicBookId(int electronicBookId) {
		this.electronicBookId = electronicBookId;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Book.id = id;
	}

	public static EBookList geteBookList() {
		return eBookList;
	}

	public static void seteBookList(EBookList eBookList) {
		Book.eBookList = eBookList;
	}

	public BookCatalogReader getCatalogReader() {
		return catalogReader;
	}

	public void setCatalogReader(BookCatalogReader catalogReader) {
		this.catalogReader = catalogReader;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((catalogReader == null) ? 0 : catalogReader.hashCode());
		result = prime * result + electronicBookId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfPages == null) ? 0 : numberOfPages.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (catalogReader == null) {
			if (other.catalogReader != null)
				return false;
		} else if (!catalogReader.equals(other.catalogReader))
			return false;
		if (electronicBookId != other.electronicBookId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPages == null) {
			if (other.numberOfPages != null)
				return false;
		} else if (!numberOfPages.equals(other.numberOfPages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", numberOfPages=" + numberOfPages + ", electronicBookId="
				+ electronicBookId + ", catalogReader=" + catalogReader + "]";
	}
}
