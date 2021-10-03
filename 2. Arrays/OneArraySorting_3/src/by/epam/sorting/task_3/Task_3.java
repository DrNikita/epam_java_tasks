package by.epam.sorting.task_3;

// Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
// элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
// повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class Task_3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 34, 56, 79, 123, 456 };

		for (int i = 0; i < arr.length; i++) {

			int index = i;                  //  =i для выполнения условия нахождения max, index при arr[i] == max 
			int max = arr[i];

			for (int j = i; j < arr.length; j++) {

				if (max < arr[j]) {

					max = arr[j];
					index = j;
				}
			}
			
			if (index == 4) {

				int swap = arr[i];
				arr[i] = max;
				arr[index] = swap;
			}

			arr[index] = arr[i];
			arr[i] = max;
		}

		System.out.print(Arrays.toString(arr));
	}
}
