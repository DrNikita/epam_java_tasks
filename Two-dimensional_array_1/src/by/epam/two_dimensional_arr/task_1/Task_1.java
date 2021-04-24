package by.epam.two_dimensional_arr.task_1;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task_1 {

	public static void main(String[] arg) {

		int[][] arr = { { 5, 7, 9, 6, 0 }, { 2, 9, 5, 8, 9 }, { 1, 2, 1, 0, 0 }, { 0, 9, 9, 5, 8 }, { 5, 6, 7, 8, 2 } };

		for (int i = 0; i < arr[0].length; i += 2) {

			if (arr[i][0] > arr[i][arr.length - 1]) {

				for (int j = 0; j < arr[0].length; j++) {

					System.out.println(arr[i][j]);

				}
				System.out.println();
			}
		}
	}
}
