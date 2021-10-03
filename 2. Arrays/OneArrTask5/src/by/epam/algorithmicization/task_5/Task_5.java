package by.epam.algorithmicization.task_5;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task_5 {

	public static void main(String[] args) {

		int[] arr = new int[] { 6, 8, 3, 7, 6, 8, 2, 5, 1, 8, 4, 2, 6, 23, 6, 34, 3 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > i) {

				System.out.print(arr[i] + " ");
			}
		}
	}
}
