package by.epam.basic.cycle_4;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task_4 {

	public static void main(String[] args) {

		double cube;
		long res = 1l;

		for (int i = 1; i <= 200; i++) {

			cube = Math.pow(i, 2);
			res *= cube;
		}

		System.out.println(res);
	}
}
