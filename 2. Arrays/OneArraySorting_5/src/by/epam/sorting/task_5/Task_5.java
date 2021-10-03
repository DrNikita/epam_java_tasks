package by.epam.sorting.task_5;

// Сортировка вставками. Дана последовательность чисел a1, a2, ... , an . Требуется переставить числа в порядке
// возрастания. Делается это следующим образом. Пусть a1, a2, ... , an - упорядоченная последовательность, т. е.
// a1 <= a2 <= ... <= an . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от ai + 1 до an
// не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
// с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class Task_5 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int tp;
		int k;

		for (int i = 1; i < arr.length; i++) {

			k = search(arr, 0, i - 1, arr[i]);

			for (int j = i; j > k; j--) {

				tp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = tp;
			}
		}

		System.out.print(Arrays.toString(arr));
	}

	public static int search(int[] arr, int st, int f, int num) {

		int m = 0;

		while (st <= f) {

			m = (st + f) / 2;

			if (num == arr[m]) {

				break;
			}
			if (num > arr[m]) {

				f = m - 1;
			}
			if (num < arr[m]) {

				st = m + 1;
			}
		}
		return m;
	}
}
