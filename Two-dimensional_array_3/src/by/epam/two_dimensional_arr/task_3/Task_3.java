package by.epam.two_dimensional_arr.task_3;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr[0].length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		Scanner l = new Scanner(System.in);
		System.out.print("Enter line number: ");
		int line = l.nextInt();

		Scanner c = new Scanner(System.in);
		System.out.print("Enter column number: ");
		int column = c.nextInt();

		if (line <= arr.length && column <= arr[0].length && line > 0 && column > 0) {

			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[line - 1][i] + "  ");

			}

			System.out.println();

			for (int i = 0; i < arr[0].length; i++) {

				System.out.println(arr[i][column - 1] + "  ");

			}

		} else {

			System.out.print("Incorrect number");

		}

	}

}
