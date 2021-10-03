package by.epam.two_dimensional_arr.task_14;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//c.

public class Task_14 {

	public static void main(String[] args) {

		int m = (int) (Math.random() * 50);
		int n = (int) (Math.random() * m);

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {

				arr[j][i] = 1;

			}
		}

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}
	}

}
