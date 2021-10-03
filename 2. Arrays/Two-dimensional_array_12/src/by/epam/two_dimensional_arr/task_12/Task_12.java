package by.epam.two_dimensional_arr.task_12;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task_12 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 7, 8, 9, 3, 5 }, { 4, 1, 6, 3, 0 }, { 4, 0, 0, 2, 3 }, { 0, 1, 1, 0, 6 },
				{ 0, 1, 0, 2, 0 } };

				
				
				
				
		System.out.print("Source array");          //вывод массива
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {                  

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		
	

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr.length - 1; j > 0; j--) {

				for (int p = 0; p < j; p++) {

					if (arr[i][p] > arr[i][p + 1]) {

						int swap = arr[i][p];

						arr[i][p] = arr[i][p + 1];

						arr[i][p + 1] = swap;
					}
				}
			}
		}
   
		
		
		
		
		
		System.out.print("\nAscending");
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {       //вывод массива

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr.length - 1; j > 0; j--) {

				for (int p = 0; p < j; p++) {

					if (arr[i][p] < arr[i][p + 1]) {

						int swap = arr[i][p];

						arr[i][p] = arr[i][p + 1];

						arr[i][p + 1] = swap;
					}
				}
			}
		}

		
		
		
		
		
		System.out.print("\nDescending");
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {            //вывод массива

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
