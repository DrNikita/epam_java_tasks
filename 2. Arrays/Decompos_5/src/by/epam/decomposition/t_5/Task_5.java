package by.epam.decomposition.t_5;

// Составить программу, которая в массиве A[N] находит второе по величине число 
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class Task_5 {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 8, 9, 7, 3, 0, 2, 85, 8, 9, 2, 4, 15 };

		int maxIndex = maxNumIndex(arr);
		replace(arr, maxIndex);
		System.out.print(maxNum(arr));
	}

	public static int maxNumIndex(int[] mas) {         // индекс максимального числа для перестановки

		int max = mas[0];
		int index = 0;

		for (int i = 1; i < mas.length; i++) {

			if (max < mas[i]) {

				max = mas[i];
				index = i;
			}
		}
		return index;
	}

	public static void replace(int[] mas, int maxInd) { // перестановка максимального числа в конц массива

		int swap = mas[mas.length - 1];
		mas[mas.length - 1] = mas[maxInd];
		mas[maxInd] = swap;
	}

	public static int maxNum(int[] mas) {               // нахождение второго по величине элемента

		int max = mas[0];

		for (int i = 1; i < mas.length - 1; i++) {

			if (max < mas[i]) {

				max = mas[i];
			}
		}
		return max;
	}
}
