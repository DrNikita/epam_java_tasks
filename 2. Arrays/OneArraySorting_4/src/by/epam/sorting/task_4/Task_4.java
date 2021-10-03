package by.epam.sorting.task_4;

// Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить числа в
// порядке возрастания. Для этого сравниваются два соседних числа. Если второе больше первого, то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;

public class Task_4 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1111111, 111111, 11111, 1111, 111, 11, 1 };

		for (int f = arr.length - 1; f > 0; f--) { // не иучитывать отсортированный (крайний) элемент ( i < f )

			for (int i = 0; i < f; i++) {

				if (arr[i] > arr[i + 1]) {

					int swap = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = swap;
				}
			}
		}

		System.out.print(Arrays.toString(arr));
	}
}