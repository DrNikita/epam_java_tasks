package by.epam.basic.cycle_3;

// Найти сумму квадратов первых ста чисел.

public class Task_3 {

	public static void main(String[] args) {

		int res = 0;
		int cube = 0;

		for (int i = 0; i <= 100; i++) {

			cube = i * i;
			res = res + cube;
		}

		System.out.print(res);
	}
}
