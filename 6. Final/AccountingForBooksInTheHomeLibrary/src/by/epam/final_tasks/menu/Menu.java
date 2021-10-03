package by.epam.final_tasks.menu;

//  Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
//  Общие требования к заданию:
//• Система учитывает книги как в электронном, так и в бумажном варианте.
//• Существующие роли: пользователь, администратор.
//• Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
//• Администратор может модифицировать каталог.
//• *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
//• **При просмотре каталога желательно реализовать постраничный просмотр
//• ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
//• Каталог книг хранится в текстовом файле.
//• Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.epam.final_tasks.administrator.Admin;
import by.epam.final_tasks.administrator.ListOfAdmins;
import by.epam.final_tasks.books_in_electronic_form.*;
import by.epam.final_tasks.options.Options;
import by.epam.final_tasks.user.*;

public class Menu {
	public static void main(String[] args) throws FileNotFoundException {

		Book eBook = new Book("J", "A", "1000");
		Book eBook1 = new Book("A", "B", "1500");
		Book eBook2 = new Book("V", "C", "2000");
		Book eBook3 = new Book("A", "D", "2500");

		Admin admin1 = new Admin("helloworld", "Nikita", "nikita@inbox.ru");
		Admin admin2 = new Admin("helloworld111", "Egor", "egor@inbox.ru");
		Admin admin3 = new Admin("helloworldwwe", "Andrey", "andrey@inbox.ru");

		Options options = new Options();

		boolean flag = true;

		while (flag) {
			System.out.println(
					"1. Войти как пользователь\n2. Войти как администратор\n3. Создать аккаунт пользователя\n0. Выйти из приложения");
			Scanner in = new Scanner(System.in);
			int loginMode = in.nextInt();

			switch (loginMode) {

			case (1):
				User userOp1 = new User();
				boolean loginFlag = false;

				while (!loginFlag) {
					System.out.print("Введите имя: ");
					Scanner logName = new Scanner(System.in);
					String login = logName.nextLine();

					System.out.print("Введите пароль: ");
					Scanner logPassword = new Scanner(System.in);
					String loginPassword = logPassword.nextLine();

					ListOfUsers listOfUsers = new ListOfUsers();

					for (int i = 0; i < listOfUsers.getListOfUsers().size(); i++) {

						if (listOfUsers.getListOfUsers().get(i).getName().equals(login)
								&& listOfUsers.getListOfUsers().get(i).getPassword().equals(loginPassword)) {

							userOp1 = listOfUsers.getListOfUsers().get(i);

							System.out.println("Hello " + listOfUsers.getListOfUsers().get(i).getName() + "!");
							loginFlag = true;
						} else {
							System.out.println("Не верное имя пользователя или пароль.");
						}
					}
				}
				boolean optionFlag = true;

				while (optionFlag) {
					System.out.println(
							"1. Каталог книг\n2. Найти книгу \n3. Предложить добавить в каталог новую книгу\n4. Посмотреть почту\n0. Выйти из акаунта");

					Scanner option = new Scanner(System.in);
					int optionNum = option.nextInt();

					switch (optionNum) {

					case (1):
						options.viewCatalog();
						break;

					case (2):
						System.out.println("Введите название книги: ");
						Scanner name = new Scanner(System.in);
						String bookName = name.nextLine();
						options.findBookByName(bookName);
						break;

					case (3):
						options.writeToAministration(userOp1.getEmailAdress());
						break;

					case (4):
						options.checkEmail(userOp1.getEmailAdress());
						break;

					case (0):
						optionFlag = false;
						break;
					}
				}
				break;

			case (2):
				Admin admin = new Admin();
				int adminInFlag = 0;
				boolean inFlag = true;

				while (inFlag) {

					System.out.print("Введите пароль: ");
					Scanner inAdminPass = new Scanner(System.in);
					String adminPass = inAdminPass.nextLine();
					ListOfAdmins listOfAdmins = new ListOfAdmins();

					for (int i = 0; i < listOfAdmins.getListOfAdmins().size(); i++) {

						if (listOfAdmins.getListOfAdmins().get(i).getPassword().equals(adminPass)) {
							admin = listOfAdmins.getListOfAdmins().get(i);
							System.out.println("Hello " + listOfAdmins.getListOfAdmins().get(i).getName());
							adminInFlag++;
						}
					}
					if (adminInFlag == 0) {
						System.out.println("Неверный пароль.");
					} else {
						inFlag = false;
					}
				}

				boolean adminFlag = true;

				while (adminFlag) {

					System.out
							.println("1. Добавить книгу\n2. Удалить книгу\n3. Посмотреть почту\n0. Выйти из аккаунта");
					Scanner inOp = new Scanner(System.in);
					int adminOp = inOp.nextInt();

					switch (adminOp) {

					case (1):
						System.out.print("Введите название книги: ");
						Scanner newBook = new Scanner(System.in);
						String newBookName = newBook.nextLine();

						System.out.print("Введите автора книги: ");
						Scanner newAuthor = new Scanner(System.in);
						String newBookAuthor = newAuthor.nextLine();

						System.out.print("Введите количество страниц: ");
						Scanner newPages = new Scanner(System.in);
						String newBookPages = newPages.nextLine();

						options.addTheBook(newBookName, newBookAuthor, newBookPages);
						break;

					case (2):
						System.out.print("Введите название книги: ");
						Scanner delBook = new Scanner(System.in);
						String delBookName = delBook.nextLine();
						options.deleteTheBook(delBookName);
						break;

					case (3):
						options.checkEmail(admin.getEmailAdress());
						break;

					case (0):
						adminFlag = false;
						break;
					}
				}
				break;

			case (3):
				System.out.print("Введите имя: ");
				Scanner inName = new Scanner(System.in);
				String name = inName.nextLine();

				boolean emailFlag = false;

				while (!emailFlag) {
					System.out.print("Введите e-mail: ");
					Scanner inEmail = new Scanner(System.in);
					String email = inEmail.nextLine();

					Pattern emailPattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
					Matcher isCorrect = emailPattern.matcher(email);

					if (isCorrect.find()) {
						System.out.print("Введите пароль: ");
						Scanner inPassword = new Scanner(System.in);
						String password = inPassword.nextLine();

						User userOp3 = new User(name);
						userOp3.createAnAccount(email, password);

						emailFlag = true;
						System.out.println("Аккаун создан. Теперь вы можете войти в него.");
					} else {
						System.out.println("Адрес электронной почты введен неправильно.");
					}
				}
				break;

			case (0):
				flag = false;
				break;
			}
		}
	}
}