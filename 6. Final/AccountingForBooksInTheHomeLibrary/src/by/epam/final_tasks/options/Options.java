package by.epam.final_tasks.options;

import java.io.FileNotFoundException;
import java.util.Scanner;
import by.epam.final_tasks.administrator.ListOfAdmins;
import by.epam.final_tasks.books_in_electronic_form.Book;
import by.epam.final_tasks.email.Network;
import by.epam.final_tasks.filereader.BookCatalogReader;
import by.epam.final_tasks.user.ListOfUsers;

public class Options {
	private BookCatalogReader readCatalog;
	private String strHelper;
	private Network network;

	public Options() throws FileNotFoundException {
		this.readCatalog = new BookCatalogReader("BookCatalog");
		this.network = new Network();
		this.strHelper = "";
	}

	public void viewCatalog() {
		System.out.println(this.readCatalog.getStroka());
	}

	public void findBookByName(String bookName) {
		String[] books = this.readCatalog.getStroka().split("_________________________");

		for (int i = 0; i < books.length; i++) {
			String[] strings = books[i].split("\n");

			for (int j = 0; j < strings.length; j++) {
				if (strings[j].contains("Name: ") && strings[j].split(": ")[1].equals(bookName + ";")) {
					System.out.println(books[i]);
				}
			}
		}
	}

	public void writeToAministration(String usersEmail) {
		ListOfAdmins listOfAdmins = new ListOfAdmins();

		System.out.println("Введите сообщение для администрации: ");
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		String fullMessage = "От " + usersEmail + ": \"" + message + "\"";

		for (int i = 0; i < ListOfAdmins.getListOfAdmins().size(); i++) {
			this.sendEmail(usersEmail, fullMessage, listOfAdmins.getListOfAdmins().get(i).getEmailAdress());
		}
	}

	public void sendEmail(String sendersAdress, String message, String recipientAdress) {
		for (int i = 0; i < this.network.getNetwork().size(); i++) {
			if (recipientAdress.equals(this.network.getNetwork().get(i).getAdress())) {
				this.network.getNetwork().get(i).sendMail(message);
			}
		}
	}

	public void checkEmail(String emailAdress) {
		for (int i = 0; i < this.network.getNetwork().size(); i++) {
			if (this.network.getNetwork().get(i).getAdress().equals(emailAdress)) {
				for (int j = 0; j < this.network.getNetwork().get(i).getMail().size(); j++) {
					System.out.println(this.network.getNetwork().get(i).getMail().get(j));
				}
			}
		}
	}

	public void deleteTheBook(String bookName) throws FileNotFoundException {
		String[] books = this.readCatalog.getStroka().split("_________________________");

		for (int i = 0; i < books.length; i++) {
			String[] strings = books[i].split("\n");

			for (int j = 0; j < strings.length; j++) {
				if (strings[j].contains("Name: ") && strings[j].split(": ")[1].equals(bookName + ";")) {
					books[i] = "";
				}
			}
		}
		for (int i = 0; i < books.length; i++) {
			this.strHelper += books[i];
		}
		this.readCatalog.setStroka(this.strHelper);
		this.readCatalog.writeToFile(this.strHelper);
	}

	public void addTheBook(String name, String author, String numberOfPages) throws FileNotFoundException {
		Book bookToAdd = new Book(name, author, numberOfPages);

		String bookData = "EBook ###" + bookToAdd.getElectronicBookId() + "\nName: " + bookToAdd.getName()
				+ ";\nAuthor: " + bookToAdd.getAuthor() + ";\nNumber of pages: " + bookToAdd.getNumberOfPages() + ".";

		this.readCatalog.addToStroka(bookData);
		this.readCatalog.writeToFile(this.readCatalog.getStroka());

		userNotification(bookToAdd);
	}

	public void userNotification(Book book) {
		ListOfUsers listOfUsers = new ListOfUsers();

		String message = "Теперь в приложении доступна новая книга: \nName" + book.getName() + ";\nAuthor: "
				+ book.getAuthor() + ";\nNumber of pages: " + book.getNumberOfPages() + ".";

		for (int i = 0; i < listOfUsers.getListOfUsers().size(); i++) {
			this.sendEmail("Administration", message, listOfUsers.getListOfUsers().get(i).getEmailAdress());
		}
	}
}
