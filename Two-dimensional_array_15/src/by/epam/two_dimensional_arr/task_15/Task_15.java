package by.epam.two_dimensional_arr.task_15;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task_15 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 6, 7, 8, 3, 6 }, { 6, 7, 8, 9, 1 }, { 7, 8, 9, 0, 3 }, { 7, 3, 9, 0, 3 },
				{ 4, 7, 8, 9, 3 } };

		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (max < arr[i][j]) {

					max = arr[i][j];
				}

				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}

		System.out.print("\nChanged array:");
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] % 2 != 0) {

					arr[i][j] = max;
				}

				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}
	}

}
