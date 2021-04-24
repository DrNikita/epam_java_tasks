package by.epam.algorithmization.task_10;

import java.util.Arrays;

//Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task_10 {

	public static void main(String[] args) {

		int[] arr = new int[] { 6, 7, 8, 5, 9, 3, 4, 8, 7, 5, 6 };

		getArray(arr);

		if (arr.length % 2 == 0) {

			for (int i = 0; i < arr.length / 2; i++) {

				System.out.print(arr[i] + "  ");

			}

		} else {

			for (int i = 0; i < arr.length / 2 + 1; i++) {

				System.out.print(arr[i] + "  ");

			}

		}

	}

	public static int[] getArray(int[] mas) {

		if (mas.length < 2) {

			return mas;
		}

		int count = 1;

		if (mas.length > 2) {

			for (int i = 2; i < mas.length; i += 2) { // перезапись в каждую вторую ячейку массива
														// следующего числа
				mas[count] = mas[i];

				count++;

			}

			if (mas.length % 2 == 0) {

				mas = Arrays.copyOf(mas, mas.length / 2);

			} else {

				mas = Arrays.copyOf(mas, mas.length / 2 + 1);

			}
		}

		return mas;
	}
}
