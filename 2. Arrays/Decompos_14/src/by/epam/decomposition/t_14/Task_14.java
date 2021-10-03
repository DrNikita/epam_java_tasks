package by.epam.decomposition.t_14;

import java.util.Arrays;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, 
// если сумма его цифр, возведенная в степень n, равна самому числу. 
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task_14 {

	public static void main(String[] args) {

		int range = 10000;

		int size;
		int sum;
		int mulSum;

		for (int k = 1; k < range; k++) {

			size = numNum(k);

			int[] arr = new int[size];

			arr = consist(k, size);
			mulSum = mul(arr, size);

			if (mulSum == k) {

				System.out.print(k + "; ");
			}
		}
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

		for (int i = 0; i < arr.length; i++) {

			arr[i] = num / del % 10;
			del *= 10;
		}

		return arr;
	}

	public static int mul(int[] mas, int pow) { // возведение в степень суммы чисел массива

		int arm = 0;

		for (int i = 0; i < mas.length; i++) {

			arm += (int) (Math.pow(mas[i], pow));
		}
		return arm;
	}
}
