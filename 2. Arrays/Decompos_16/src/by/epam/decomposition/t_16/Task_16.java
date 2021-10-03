package by.epam.decomposition.t_16;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task_16 {

	public static void main(String[] args) {

		int n = 5;

		int minRange;
		int maxRange;
		int sum = 0;
		int sumSize;

		minRange = minRangeForm(n);
		maxRange = maxRangeForm(n);

		for (int i = minRange; i <= maxRange; i++) {

			if (oddNumConsist(i, n) == n) {

				sum += i;
			}
		}

		System.out.print(sum);
		sumSize = numSize(sum);
		System.out.print("\nКоличество четных цифр: " + evenNumConsist(sum, sumSize));
	}

	public static int minRangeForm(int num) { // формирование минимального n-значного числа

		int range = 1;
		int flag = 0;

		while (flag < num - 1) {

			range *= 10;
			flag++;
		}
		return range;
	}

	public static int maxRangeForm(int num) { // формирование максимального n-значного числа

		int range = 1;
		int flag = 0;

		while (flag < num) {

			range *= 10;
			flag++;
		}
		return range - 1;
	}

	public static int numSize(int num) { // количество цифр в числе

		int size = 0;

		while (num > 0) {

			num /= 10;
			size++;
		}

		return size;
	}

	public static int oddNumConsist(int num, int n) { // количество нечетных цифр в числе

		int oddNum = 0;
		int del = 1;
		int numeral;

		while (n > 0) {

			numeral = num / del % 10;
			del *= 10;
			n--;

			if (numeral != 0 && numeral % 2 != 0) {

				oddNum++;
			}
		}

		return oddNum;
	}

	public static int evenNumConsist(int num, int n) { // количество четных цифр в числе

		int evenNum = 0;
		int del = 1;
		int numeral;

		while (n > 0) {

			numeral = num / del % 10;
			del *= 10;
			n--;

			if (numeral != 0 && numeral % 2 == 0) {

				evenNum++;
			}
		}

		return evenNum;
	}
}
