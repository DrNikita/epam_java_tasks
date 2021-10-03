package by.epam.sorting.task_7;

// Пусть даны две неубывающие последовательности действительных чисел.

// Требуется указать те места, на которые нужно вставлять элементы второй последовательности 
// в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

// *позиции указаны с учетом пополняемости певого массива
// (при вставке в него элементов второго массива)

import java.util.Arrays;

public class Task_7 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2 };
		int[] arr1 = new int[] { 16, 18 };

		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print(Arrays.toString(arr1));
		System.out.println("\n");

		int length = arr.length; // для сдвига элементов

		int n = 0; // для учета расширяемости первого массива при вставке в него элементов второго

		arr = Arrays.copyOf(arr, arr.length + arr1.length);

		add(arr, arr1, length, n);

	}

	private static void add(int[] array2, int[] array1, int length, int n) {

		int lastElem = 0; // последняя позиция первого массива в которую происходила запись
		int k = 2; // для поиска следующего после lastElem элемента

		for (int i = 0; i < array1.length; i++) {

			boolean flag = true;

			for (int j = 0; j < array2.length; j++) {

				if (array1[i] < array2[j]) {

					System.out.print(i + " элемент второго массива вставляется до " + j + " элемента первого;\n");

					int arrLength = length + n;

					while (arrLength > j) {

						array2[arrLength] = array2[arrLength - 1];
						arrLength--;
					}

					array2[j] = array1[i];
					n += 1;

					System.out.print(Arrays.toString(array2));
					System.out.println("\n");

					lastElem = arrLength;

					flag = false;
					break;
				}
			}

			if (flag) {

				System.out.print(i + " элемент второго массива вставляется после последенго элемента первого;\n");

				array2[lastElem + k] = array1[i];
				k += 1;

				System.out.print(Arrays.toString(array2));
				System.out.println("\n");
			}
		}
	}
}