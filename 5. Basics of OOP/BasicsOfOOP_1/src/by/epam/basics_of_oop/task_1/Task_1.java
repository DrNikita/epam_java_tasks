package by.epam.basics_of_oop.task_1;

// Создать объект класса Текстовый файл, используя классы Файл, Директория. 
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class Task_1 {
	public static void main(String[] args) {
		CreateFile file = new CreateFile("txt", "C:\\User\\nikit\\", "SomeText");

		System.out.println(file.toString());

		file.printContent();
		file.addContent("Hello World !!!");
		file.rename("My lifestory");

		System.out.println(file.toString());

		file.printContent();
	}
}
