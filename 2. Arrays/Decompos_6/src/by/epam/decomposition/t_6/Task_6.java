package by.epam.decomposition.t_6;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task_6 {
	public static void main(String[] args) {

		int[] mas = new int[] { 6, 4, 2 };

		int min;
		int nod;

		min = minNum(mas);
		nod = nod(mas, min);

		if (nod == 1) {

			System.out.print("Взаимнопростые");

		} else {

			System.out.print("неВзаимнопростые");
		}
	}

	public static int minNum(int[] mas) { // минимальное число из данных

		int min = mas[0];

		for (int i = 1; i < mas.length; i++) {

			if (min < mas[i]) {

				min = mas[i];
			}
		}
		return min;
	}

	public static int nod(int[] mas, int min) { // вычисление НОД данных чисел

		int nod = 0;

		for (int i = 1; i <= min; i++) {

			if (mas[0] % i == 0 && mas[1] % i == 0 && mas[2] % i == 0) {

				nod = i;
			}
		}
		return nod;
	}
}
