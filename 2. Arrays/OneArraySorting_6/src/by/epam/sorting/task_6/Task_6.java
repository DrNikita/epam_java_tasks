package by.epam.sorting.task_6;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
// на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
// Составить алгоритм этой сортировки.

import java.util.Arrays;

public class Task_6 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int step;
		step = arr.length / 2;

		while (step > 0) {

			for (int i = 0; i < arr.length - step; i++) {

				int j = i;

				while (j >= 0 && arr[j] > arr[j + step]) {

					int swap = arr[j];
					arr[j] = arr[j + step];
					arr[j + step] = swap;
					j--;                        // выход из цикла при перестаноыке (одна пара элементов переставляется один раз)
				}
			}
			step = step / 2;
		}

		System.out.print(Arrays.toString(arr));
	}
}
