package by.epam.decomposition.t_7;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task_7 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 9; i += 2) {

			sum += factorial(i);
		}
		System.out.print("Сумма факториалов нечетных чисел от 1 до 9: " + sum);
	}

	public static int factorial(int num) {

		int numFactor = 1;

		for (int i = 1; i <= num; i++) {

			numFactor *= i;
		}
		return numFactor;
	}
}
