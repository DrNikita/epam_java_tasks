package by.epam.algorithmicization.task_3;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task_3 {

	public static void main(String[] args) {

		int negative = 0;
		int zero = 0;
		int positive = 0;

		int[] arr = new int[] { -5, 4, -4, -2, 4, 35, -64, -8, 0, 0, 5, 9, 0, 3, 90, 0, 24, 0 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {

				negative++;

			} else if (arr[i] > 0) {

				positive++;

			} else {

				zero++;
			}
		}

		System.out.println(
				"Positive numbers:" + positive + "; Negative numbers:" + negative + "; Number of zeros:" + zero);
	}
}
