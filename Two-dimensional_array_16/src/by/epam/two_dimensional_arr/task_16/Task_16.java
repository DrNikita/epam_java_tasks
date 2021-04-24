package by.epam.two_dimensional_arr.task_16;

// Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 
// 1, 2, 3, ... , n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших 
// диагоналей равны между собой. Построить такой квадрат.

import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the square matrix: ");
		int n = sc.nextInt();

		int[][] magicSquare = new int[n][n];

		int number = 1;
		int row = 0;
		int column = n / 2;
		int curr_row;
		int curr_col;

		while (number <= n * n) {

			magicSquare[row][column] = number;

			number++;

			curr_row = row;
			curr_col = column;

			row -= 1;
			column += 1;

			if (row == -1) {

				row = n - 1;
			}

			if (column == n) {

				column = 0;
			}

			if (magicSquare[row][column] != 0) {

				row = curr_row + 1;
				column = curr_col;

				if (row == -1) {

					row = n - 1;
				}
			}
		}

		for (int i = 0; i < magicSquare.length; i++) {

			for (int j = 0; j < magicSquare.length; j++) {

				System.out.print(magicSquare[i][j] + "  ");
			}

			System.out.println();
		}

	}

}
