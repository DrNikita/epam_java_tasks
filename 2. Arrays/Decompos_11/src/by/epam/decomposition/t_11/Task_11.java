package by.epam.decomposition.t_11;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task_11 {

	public static void main(String[] args) {

		float x = 1000000000f;
		float y = 10000000000f;

		int xSize = 0;
		int ySize = 0;

		xSize = numNum(x);
		ySize = numNum(y);

		if (xSize > ySize) {

			System.out.print("В x цифр больше.");

		} else if (xSize < ySize) {

			System.out.print("В y цифр больше.");

		} else {

			System.out.print("Количество цифр в x и y одинаково.");
		}
	}

	public static int numNum(float num) {

		float number = num;
		int ind = 0;

		while (number != 0) {

			number /= 10;
			ind++;
		}

		return ind;
	}
}
