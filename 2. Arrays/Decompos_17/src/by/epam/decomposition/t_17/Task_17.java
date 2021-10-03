package by.epam.decomposition.t_17;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task_17 {

	public static void main(String[] args) {

		int num = 100;
		int operationNum = 0;
		int numSize = numSize(num);
		int numSum = (numSum(num, numSize));

		System.out.print("Число: " + num);
		System.out.print("\nСумма цифр цисла: " + numSum);

		while (num > 0) {

			num = num - numSize;
			operationNum++;
		}

		System.out.print("\nКоличество операций вычитания: " + operationNum);
		System.out.print("\nКонечное чило: " + num);
	}

	public static int numSize(int num) { // количество цифр в числе

		int size = 0;

		while (num > 0) {

			num /= 10;
			size++;
		}

		return size;
	}

	public static int numSum(int num, int numSize) { // сумма цифр в числе

		int sum = 0;
		int del = 1;

		while (numSize > 0) {

			sum += num / del % 10;
			del *= 10;
			numSize--;
		}

		return sum;
	}
}
