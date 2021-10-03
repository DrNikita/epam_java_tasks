package by.epam.decomposition.t_2;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Task_2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 9, 3, 30, 18 };

		int minNum;
		minNum = min(arr);

		int nod;
		nod = nod(arr, minNum);

		System.out.print(nod);
	}

	public static int min(int[] mas) {

		int min = mas[0];

		for (int i = 1; i < mas.length; i++) {

			if (min > mas[i]) {

				min = mas[i];
			}
		}

		return min;
	}

	public static int nod(int[] mas, int min) {

		int nod = 0;

		for (int i = 1; i <= min; i++) {

			if (mas[0] % i == 0 && mas[1] % i == 0 && mas[2] % i == 0 && mas[3] % i == 0) {

				nod = i;
			}
		}
		return nod;
	}
}
