package by.epam.two_dimensional_arr.task_9;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task_9 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 4, 9, 8, 8, 3 }, { 0, 7, 7, 8, 9 }, { 6, 9, 7, 7, 8 }, { 6, 7, 9, 1, 5 },
				{ 6, 7, 9, 10, 5 } };

		int[] arrRes = new int[arr.length];

		int sum = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length; i++) {

				sum += arr[j][i];

				System.out.print(arr[j][i] + "   ");
			}
			arrRes[j] = sum;

			sum = 0;

			System.out.println();
		}

		System.out.println();

		int max = arrRes[0];
		int column = 0;                       // номер столбца с наибольшей суммой
		int sameRes = 0;                     // если столцов с наибольшей суммой >1

		for (int i = 0; i < arrRes.length; i++) {

			System.out.print(arrRes[i] + "  ");

			if (max < arrRes[i]) {

				max = arrRes[i];

				column = i + 1;
			}
		}

		System.out.print("\n\nThe maximum sum of the numbers in column(s) number: " + column + "  ");

		for (int i = column + 1; i < arrRes.length; i++) {

			if (max == arrRes[i]) {

				sameRes = i + 1;

				System.out.print(sameRes + "  ");
			}
		}
		System.out.print("is  " + max);
	}
}
