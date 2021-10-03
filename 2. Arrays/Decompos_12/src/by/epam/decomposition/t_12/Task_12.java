package by.epam.decomposition.t_12;

import java.util.Arrays;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class Task_12 {
	public static void main(String[] args) {

		int k = 1001;
		int n = 100;

		if (n >= k) {

			System.out.print("Incorrect range");

		} else {

			int[] arr = new int[0];

			int ind;
			int need;
			int p = 0;

			boolean flag = true;

			ind = k;

			while (flag) {

				arr = plusSize(arr);
				int a = randomNumber(n);
				k -= a;

				if (k <= n) {

					arr[p] = k;
					p++;
					arr = plusSize(arr);
					need = masSum(arr);
					arr[p] = finalNum(ind, need);
					flag = false;

				} else {

					arr[p] = a;
					p++;
				}
			}
			System.out.print(Arrays.toString(arr));
		}
	}

	public static int masSum(int[] mas) {// сумма всех элементов массива

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {

			sum += mas[i];
		}

		return sum;
	}

	public static int[] plusSize(int[] mas) {// увеличение размера массива

		mas = Arrays.copyOf(mas, mas.length + 1);

		return mas;
	}

	public static int randomNumber(int maxNum) {// случайное число в заданном диапазоне

		int num;
		num = (int) (1 + Math.random() * maxNum);

		return num;
	}

	public static int finalNum(int allSum, int nowSum) {// вычисление последнего числа массива

		int fNum = 0;

		fNum = allSum - nowSum;

		return fNum;
	}
}
