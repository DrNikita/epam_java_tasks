package by.epam.algorithmicization.task_7;

//Даны действительные числа a1 ,a2, ..., a2n. 
//Найти max(a1 + a2n, a2 + a2n-1, ..., an + an + 1).

public class Task_7 {

	public static void main(String[] arg) {

		int[] arr = new int[] { 5, 7, 8, 3, 5, 11, 9, 8, 2, 7, 4 };

		int num;

		if (arr.length % 2 == 0) {

			int[] arr2 = new int[arr.length / 2];

			num = arr2.length;       // количество операций в цикле

			task(arr, arr2, num);

		} else {

			int[] arr2 = new int[arr.length / 2 + 1];

			num = arr2.length;

			task(arr, arr2, num);

		}
	}

	public static int task(int[] a, int[] b, int num) {

		int start = 0;
		int finish;

		finish = a.length - 1;

		for (int i = 0; i < num; i++) {

			if (start == finish) {      //если количество элементов в массиве нечетное 

				System.out.print(a[start] + "  ");

			} else {

				b[i] = a[start] - a[finish];

				System.out.print(b[i] + "  ");

				start++;
				finish--;

			}
		}
		return b[0];
	}
}
