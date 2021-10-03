package by.epam.sorting.task_2;

// Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn. Образовать из них новую последовательность
// чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Task_2 {

	public static void main(String[] args) {

		int[] arrA = new int[] { 8, 8, 8, 18, 21, 22, 24, 66 };
		int[] arrB = new int[] { 1, 3, 4, 4, 5, 8, 9, 10 };

		int lenA = arrA.length;

		int swap = 0;

		arrA = Arrays.copyOf(arrA, arrA.length + arrB.length);

		System.arraycopy(arrB, 0, arrA, lenA, arrB.length);

		for (int i = arrA.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (arrA[j] > arrA[j + 1]) {

					swap = arrA[j + 1];
					arrA[j + 1] = arrA[j];
					arrA[j] = swap;
				}
			}
		}

		System.out.print(Arrays.toString(arrA));
	}

}
