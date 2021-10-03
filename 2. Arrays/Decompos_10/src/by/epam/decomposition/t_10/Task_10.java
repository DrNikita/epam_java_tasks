package by.epam.decomposition.t_10;

import java.util.Arrays;

// Дано натуральное число N. Написать метод(методы) для формирования массива, 
// элементами которого являются цифры числа N.

public class Task_10 {

	public static void main(String[] args) {

		int number = 344542322;
		int size;

		size = arrSize(number);

		System.out.print(Arrays.toString(numMas(number, size)));
	}

	public static int arrSize(int num) { // размер массива

		int ind = num;
		int size = 0;

		while (ind != 0) {

			ind /= 10;
			size++;
		}
		return size;
	}

	public static int[] numMas(int num, int size) {

		int mul = 10;

		int[] arr = new int[size];

		arr[size - 1] = num % 10;

		for (int i = size - 2; i >= 0; i--) {

			arr[i] = num / mul % 10;
			mul *= 10;
		}

		return arr;
	}
}
