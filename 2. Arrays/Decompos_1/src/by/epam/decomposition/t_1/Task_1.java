package by.epam.decomposition.t_1;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
// натуральных чисел: НОК(a, b) = a * b / НОД(a, b).

public class Task_1 {

	public static void main(String[] args) {

		int a = 16;
		int b = 18;

		int nod = nod(a, b);
		int nok = nok(a, b, nod);

		System.out.print("НОД: " + nod + ";" + "\nНОК: " + nok + ".");
	}

	public static int nod(int a, int b) {               // НОД

		while (a != b) {

			if (a > b) {

				a = a - b;

			} else {

				b = b - a;
			}
		}
		return a;
	}

	public static int nok(int a, int b, int nod) {      // НОК

		int d = 0;

		d = a * b / nod;

		return d;
	}
}
