package by.epam.decomposition.t_15;

import java.util.Arrays;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность 
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task_15 {
	public static void main(String[] args) {

		int n = 4;
		int minRange;
		int maxRange;
		int num;
		int[] fulNum = new int[0];

		minRange = minRangeForm(n);
		maxRange = maxRangeForm(n);

		for (int i = minRange; i <= maxRange; i++) {

			num = numNum(i);
			fulNum = consist(i, num);

			if (check(fulNum)) {

				System.out.print(i + "; ");
			}
		}
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

	public static int numNum(int num) { // количество цифр в составе числа

		int size = 0;

		while (num > 0) {

			num /= 10;
			size++;
		}

		return size;
	}

	public static int[] consist(int num, int size) { // массив с цифрами входящими в состав числа

		int[] arr = new int[size];
		int del = 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			arr[i] = num / del % 10;
			del *= 10;
		}

		return arr;
	}

	public static boolean check(int[] number) { // образуют ли входящие в состав числа цифры
												// возрастающюю последовательность
		boolean confirm = false;

		for (int i = 0; i < number.length - 1; i++) {

			if (number[i] < number[i + 1]) {

				confirm = true;

			} else {

				confirm = false;
				break;
			}
		}

		return confirm;
	}
}
