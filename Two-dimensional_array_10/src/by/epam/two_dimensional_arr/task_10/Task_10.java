package by.epam.two_dimensional_arr.task_10;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task_10 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { -7, 8, 9, 2, 5 }, { 8, 6, 9, 0, 3 }, { 7, 8, 0, 4, 5 }, { 7, 8, 9, 1, 2 },
				{ 6, 8, 6, 7, 0 } };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i][i] > 0) {

				System.out.print(arr[i][i] + "  ");

			}
		}
	}
}
