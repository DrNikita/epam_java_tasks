package by.epam.algorithmicization.task_8;

//Дана последовательность целых чисел a1 ,a2, ... , an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1 ,a2, ... , an).

public class Task_8 {

	public static void main(String[] args) {

		int[] arr = new int[] { 57, 6, 9, 4, 3, 1, 55, 1, 8, 4, 4, 6, 5, 14, 9, 1, 3, 8, 1, 2, 9 };
		int[] arr2 = new int[arr.length];

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}
		}

		for (int x = 0; x < arr.length; x++) {

			if (arr[x] == min) {

				continue;

			} else {

				arr2[x] = arr[x];
				System.out.print(arr2[x] + " ");
			}
		}
	}
}
