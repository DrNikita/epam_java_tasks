package by.epam.two_dimensional_arr.task_7;

//Сформировать квадратную матрицу порядка N по правилу: A[I, J]=sin(I^2 - J^2/N) 
//и подсчитать количество положительных элементов в ней.

public class Task_7 {

	public static void main(String[] args) {

		int n = 8;
		int pos = 0;

		double[][] arr = new double[n][n];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);

				System.out.print(arr[i][j] + "  ");

				if (arr[i][j] > 0) {

					pos++;

				}
			}

			System.out.println();
		}

		System.out.print("\nThe number of positive elemnts is:" + pos);
	}
}
