package by.epam.classes_objects.t_1;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы 
// изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных, 
// и метод, который находит наибольшее значение из этих двух переменных.

public class Task_1 {
	public static void main(String[] args) {
		Test1 test = new Test1();

		test.setFirstVar(5);
		test.setSecondVar(14);;

		System.out.println(test.sum(test.getFirstVar(), test.getSecondVar()));
		System.out.println(test.compare(test.getFirstVar(), test.getSecondVar()));
	}
}
