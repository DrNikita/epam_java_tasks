package by.epam.algorithmicization.task_1;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_1 {

	public static void main(String[] args) {

		int k = 3;
		int sum = 0;

		int[] a = new int[] { 5, 6, 12, 32, 18 };

		for (int i = 0; i < 5; i++) {

			if (a[i] % k == 0) {

				sum += a[i];
			}
		}

		System.out.print(sum);
	}
}
