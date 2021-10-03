package by.epam.sorting.task_8;

// Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу, которая приводит эти дроби к общему
// знаменателю и упорядочивает их в порядке возрастания.

import java.util.Arrays;

public class Task_8 {

	public static void main(String[] args) {

		int[][] drobi = new int[][] { { 1, 16 }, { 2, 18 } };
		int[] arr = new int[] { 9, 0, 2, 6, 8, 9, 3, 5, 6, 8, 0, 7 };

		int maxZn = drobi[0][1];

		for (int i = 0; i < drobi.length; i++) {

			if (maxZn < drobi[i][1]) {

				maxZn = drobi[i][1];
			}
		}

		int znamenatel = nok(drobi, maxZn);

		System.out.print("Даны дроби: ");

		for (int i = 0; i < drobi.length; i++) {

			System.out.print(drobi[i][0] + "/" + drobi[i][1] + "; ");
		}

		System.out.print("\n\nОбщий знаментель: " + znamenatel);
		System.out.print("\n\nДроби в порядке возрастания: ");

		transform(drobi, znamenatel);
		increase(drobi);

		for (int i = 0; i < drobi.length; i++) {

			System.out.print(drobi[i][0] + "/" + drobi[i][1] + "; ");
		}
	}

	public static int nok(int[][] fractions, int maxZnam) { // нахождение общего знаменателя \

		int n = 0; // множитель
		int ind = 0; // количество подходящих чисел
		int nok = 0;

		while (0 == 0) {

			ind = 0;
			int max = maxZnam;
			n += 1;
			max *= n;

			for (int i = 0; i < fractions.length; i++) {

				if (max % fractions[i][1] == 0) {

					ind++;
				}
			}
			if (ind == fractions.length) {

				nok = max;
				break;
			}
		}
		return nok;
	}

	public static void transform(int[][] drops, int znamenatel) { // приведение к общему знаменателю

		int chislitel = 0;

		for (int i = 0; i < drops.length; i++) {

			chislitel = drops[i][0] * (znamenatel / drops[i][1]);
			drops[i][0] = chislitel;
			drops[i][1] = znamenatel;
		}
	}

	public static void increase(int[][] drops) { // расположение дробей в порядке возрастания

		for (int i = drops.length - 2; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (drops[j][0] > drops[i + 1][0]) {

					int swap = drops[j][0];
					drops[j][0] = drops[j + 1][0];
					drops[j + 1][0] = swap;
				}
			}
		}
	}
}
