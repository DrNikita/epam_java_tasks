package by.epam.classes_objects.t_5;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на 
// единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и 
// произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Task_5 {
	public static void main(String[] args) {
		Counter counter = new Counter(5, 0, 10);

		for (int i = 0; i < 10; i++) {
			counter.plus();
			System.out.println(counter.presentVal());
		}
		for (int i = 0; i < 20; i++) {
			counter.minus();
			System.out.println(counter.presentVal());
		}
	}
}
