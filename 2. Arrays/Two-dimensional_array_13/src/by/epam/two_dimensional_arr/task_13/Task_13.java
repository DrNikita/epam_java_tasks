package by.epam.two_dimensional_arr.task_13;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task_13 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 7, 8, 9, 3, 5 }, { 4, 1, 6, 3, 0 }, { 4, 0, 0, 2, 3 }, { 0, 1, 1, 0, 6 },
				{ 0, 1, 0, 2, 0 } };

		System.out.print("Source array"); // вывод массива
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		for (int p = 0; p < arr.length; p++) {

			for (int j = arr.length - 1; j > 0; j--) {

				for (int i = 0; i < j; i++) {

					if (arr[i][p] > arr[i + 1][p]) {

						int swap = arr[i][p];

						arr[i][p] = arr[i + 1][p];

						arr[i + 1][p] = swap;
					}
				}
			}
		}

		System.out.print("\nAscending");
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) { // вывод массива

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		for (int p = 0; p < arr.length; p++) {

			for (int j = arr.length - 1; j > 0; j--) {

				for (int i = 0; i < j; i++) {

					if (arr[i][p] < arr[i + 1][p]) {

						int swap = arr[i][p];

						arr[i][p] = arr[i + 1][p];

						arr[i + 1][p] = swap;
					}
				}
			}
		}

		System.out.print("\nAscending");
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) { // вывод массива

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
