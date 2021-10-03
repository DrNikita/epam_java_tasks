package by.epam.classes_objects.t_9;

import java.util.Scanner;

// Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
// и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами 
// и методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

public class Task_9 {
	public static void main(String[] args) {

		BooksList list = new BooksList();

		boolean flag = true;

		Book book = new Book("History", "Пушкин", "Brest", 2021, "680", "60", "Usual");
		Book book1 = new Book("History", "He", "Piter", 2020, "680", "60", "Usual");
		Book book2 = new Book("History", "She", "Minsk", 1999, "680", "60", "Usual");
		Book book3 = new Book("History", "It", "Minsk", 1990, "680", "60", "Usual");
		Book book4 = new Book("History", "Me", "Minsk", 2019, "680", "60", "Usual");
		Book book5 = new Book("History", "I", "Kiev", 2009, "680", "60", "Usual");
		Book book6 = new Book("History", "We", "Moskow", 2010, "680", "60", "Usual");
		Book book7 = new Book("History", "They", "Grodno", 2017, "680", "60", "Usual");
		Book book8 = new Book("History", "Me", "Berlin", 2014, "680", "60", "Usual");
		Book book9 = new Book("History", "We", "Minsk", 1956, "680", "60", "Usual");

		list.listFilling(book);
		list.listFilling(book1);
		list.listFilling(book2);
		list.listFilling(book3);
		list.listFilling(book4);
		list.listFilling(book5);
		list.listFilling(book6);
		list.listFilling(book7);
		list.listFilling(book8);
		list.listFilling(book9);

//		list.findByYear(2010);

		System.out.print("1. Список книг заданного автора.\n2. Список книг, выпущенных заданным издательством."
				+ "\n3. Список книг, выпущенных после заданного года.\n0. Off.");

		while (flag) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Выберите номер операции: ");
			int operation = sc.nextInt();

			switch (operation) {
			case 1:
				Scanner scan = new Scanner(System.in);
				System.out.print("Введите имя автора: ");
				String auth = scan.nextLine();
				list.findAuthor(auth);
				break;
			case 2:
				Scanner scaner = new Scanner(System.in);
				System.out.print("Введите название издательства: ");
				String publish = scaner.nextLine();
				list.findPublish(publish);
				break;
			case 3:
				Scanner scanner = new Scanner(System.in);
				System.out.print("Введите год издания: ");
				int publishYear = scanner.nextInt();
				list.findByYear(publishYear);
				break;
			case 0:
				flag = false;
				break;
			}
		}
	}
}
