package by.epam.classes_objects.t_9;

import java.util.Arrays;
import java.util.Comparator;

public class BooksList {
	private Book[] booksList;
	private int size;
	private int booksListLength;

	public BooksList() {
		this.size = 0;
		this.booksListLength = 5;
		this.booksList = new Book[booksListLength];
	}

	public BooksList(int booksListLength) {
		this.size = 0;
		this.booksListLength = booksListLength;
		this.booksList = new Book[booksListLength];
	}

	public void listFilling(Book book) {
		if (size < booksListLength) {
			booksList[size] = book;
			size++;
		} else {
			Book[] newList = new Book[booksListLength * 2];
			for (int i = 0; i < booksListLength; i++) {
				newList[i] = booksList[i];
			}
			booksList = newList;
			booksListLength = booksListLength * 2;
			booksList[size] = book;
			size++;
		}
	}

	public void listPrint() {
		for (int i = 0; i < size; i++) {
			System.out.println(booksList[i].toString());
		}
	}

	public void findAuthor(String author) {
		for (int i = 0; i < size; i++) {
			if (booksList[i].getAuthor().equalsIgnoreCase(author)) {
				booksList[i].print();
			}
		}
	}

	public void findPublish(String publish) {
		for (int i = 0; i < size; i++) {
			if (booksList[i].getPublish().equalsIgnoreCase(publish)) {
				booksList[i].print();
			}
		}
	}

	public void findByYear(int publishYeaar) {
		for (int i = 0; i < size; i++) {
			if (booksList[i].getPublishYear() >= publishYeaar) {
				booksList[i].print();
			}
		}
	}

	public Book[] getBooksList() {
		return booksList;
	}

	public void setBooksList(Book[] booksList) {
		this.booksList = booksList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBooksListLength() {
		return booksListLength;
	}

	public void setBooksListLength(int booksListLength) {
		this.booksListLength = booksListLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(booksList);
		result = prime * result + booksListLength;
		result = prime * result + size;
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
		BooksList other = (BooksList) obj;
		if (!Arrays.equals(booksList, other.booksList))
			return false;
		if (booksListLength != other.booksListLength)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BooksList [booksList=" + Arrays.toString(booksList) + ", size=" + size + ", booksListLength="
				+ booksListLength + "]";
	}
}
