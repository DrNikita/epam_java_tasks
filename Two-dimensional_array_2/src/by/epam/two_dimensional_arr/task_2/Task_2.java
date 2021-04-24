package by.epam.two_dimensional_arr.task_2;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task_2 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 7, 8, 9, 7, 1 }, { 9, 2, 6, 0, 12 }, { 4, 9, 2, 0, 3 }, { 6, 9, 0, 2, 7 },
				{ 7, 9, 1, 0, 6 } };

		int a = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][a] + "  ");

			a++;
		}
	}
}
