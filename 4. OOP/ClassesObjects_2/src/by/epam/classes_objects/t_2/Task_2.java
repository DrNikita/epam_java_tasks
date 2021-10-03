package by.epam.classes_objects.t_2;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
//Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- 
//методы для полей экземпляра класса.

public class Task_2 {
	public static void main(String[] args) {

		Test2 test = new Test2("MID", "");
		Test2 test1 = new Test2();

		test1.setSecondName("naSFah");
		test.setSecondName("1X1");

		System.out.println(test.getFirstName() + " " + test.getSecondName());
		System.out.println(test1.getFirstName() + " " + test1.getSecondName());
	}
}
