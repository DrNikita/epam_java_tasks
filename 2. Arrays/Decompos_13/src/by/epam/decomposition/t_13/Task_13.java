package by.epam.decomposition.t_13;

import java.util.Arrays;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 
// (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], 
// где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class Task_13 {
	public static void main(String[] args) {

		int startN = 15;
		int finishN = startN * 2;

		int arrSize;
		arrSize = finishN - startN + 1;

		int[] arr = new int[arrSize];

		int firstStart = 0;
		int secondStart = 1;

		add(arr, startN);

		for (int i = 0; i < startN / 2; i++) {

			systemOutWithZero(arr, firstStart);
			firstStart += 2;
		}
		
		System.out.println();
		
		for (int i = 1; i < startN / 2; i++) {

			systemOutWithZero(arr, secondStart);
			secondStart += 2;
		}
	}

	public static void add(int[] mas, int start) { // заполнение массива

		for (int i = 0; i < mas.length; i++) {

			mas[i] = start;
			start++;
		}
	}

	public static void systemOutWithZero(int[] mas, int s) { // вывод "близнецов" начиная с 0

		System.out.print(mas[s] + "-" + mas[s + 2] + "; ");
	}

	public static void systemOutWithOne(int[] mas, int s) { // вывод "близнецов" начиная с 1

		System.out.print(mas[s] + "-" + mas[s + 2] + "; ");
	}
}
