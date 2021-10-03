package by.epam.decomposition.t_8;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m

public class Task_8 {
	public static void main(String[] args) {

		int[] arr = new int[] { 6, 8, 3, 9, 6, 8, 3, 9, 6, 0, 2, 7, 6, 7, 8, 3, 4, 5 };

		System.out.print(method(arr, 1, 3) + "; " + method(arr, 3, 5) + "; " + method(arr, 4, 6));
	}

	public static int method(int[] mas, int k, int m) {

		int sum = 0;

		for (int i = k; i <= m; i++) {

			sum += mas[i];
		}

		return sum;
	}
}
