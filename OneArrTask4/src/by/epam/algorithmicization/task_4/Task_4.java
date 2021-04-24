package by.epam.algorithmicization.task_4;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task_4 {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 0, 2, 1, 5, 4, 9, 1, 8, 2, 5, 3, 99 };
		
		int maxorder = 0;
		int minorder = 0;
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				
				max = arr[i];
				maxorder = i;
			}
			
			if (arr[i] < min) {
				
				min = arr[i];
				minorder = i;
			}
		}
		
		for (int x = 0; x < arr.length; x++) {
			
			if (x == maxorder) {
				
				System.out.print(arr[minorder] + " ");     //запись на позицию максимального числа минимального
				
			} else if (x == minorder) {
				
				System.out.print(arr[maxorder] + " ");     //запись на позицию минимального числа махимального
				
			} else {
				
				System.out.print(arr[x] + " ");           //вывод массива
			}
		}
	}
}
