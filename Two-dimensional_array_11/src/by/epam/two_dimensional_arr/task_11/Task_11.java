package by.epam.two_dimensional_arr.task_11;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task_11 {

	public static void main(String[] args) {

		int[][] arr = new int[20][10];
		int ind = 0;
		int noLine = 0;                                // количество строк, в которых число 5 встречается 3 и более раз

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = (int) (Math.random() * 15);

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\nNumber 5 occurs 3 or more times in line(s): ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				if (arr[i][j] == 5) {

					ind++;
				}
			}

			if (ind >= 3) {

				System.out.print(i + 1 + " ");

				noLine++;                          // количество строк, в которых число 5 встречается 3 и более раз
			}

			ind = 0;
		}

		if (noLine == 0) {                         // проверка наличия строк, в которых число 5 встречается 3 и более раз

			System.out.print("no lines");
		}
	}
}