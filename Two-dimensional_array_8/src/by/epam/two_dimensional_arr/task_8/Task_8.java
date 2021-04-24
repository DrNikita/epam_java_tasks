package by.epam.two_dimensional_arr.task_8;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 9, 3, 6, 0, 2 }, { 0, 9, 2, 5, 8 }, { 0, 2, 5, 7, 8 }, { 8, 1, 5, 3, 9 },
				{ 1, 2, 3, 4, 5 } };

		int third = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}

		Scanner scFirst = new Scanner(System.in);
		Scanner scSecond = new Scanner(System.in);

		System.out.print("Enter the number of the first column:");

		int firstColumn = scFirst.nextInt();

		System.out.print("Enter the number of the first column:");

		int secondColumn = scSecond.nextInt();

		if (firstColumn > arr.length || firstColumn <= 0 || secondColumn > arr.length || secondColumn <= 0) {

			System.out.print("Incorrect number.");

		} else {

			for (int i = 0; i < arr.length; i++) {

				third = arr[i][firstColumn - 1];
				arr[i][firstColumn - 1] = arr[i][secondColumn - 1];
				arr[i][secondColumn - 1] = third;

				for (int j = 0; j < arr.length; j++) {

					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			}
		}
	}

}
