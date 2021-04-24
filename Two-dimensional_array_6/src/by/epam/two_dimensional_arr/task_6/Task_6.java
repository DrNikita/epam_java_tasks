package by.epam.two_dimensional_arr.task_6;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//| 1 1 1 ... 1 1 1 |
//| 0 1 1 ... 1 1 0 |
//| 0 0 1 ... 1 0 0 |
//| . . . ... . . . |
//| . . . ... . . . |
//| . . . ... . . . |
//| 0 1 1 ... 1 1 0 |
//| 1 1 1 ... 1 1 1 |

public class Task_6 {

	public static void main(String[] args) {

		int n = 8;
		int ind = 0;
		int size = n / 2;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = 0;

			}

			for (int j = 0 + ind; j < arr.length - ind; j++) {

				arr[i][j] = 1;

			}

			ind++;

		}
		
		ind = 0;
		
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {

			for (int j = 0 + ind; j < arr.length - ind; j++) {

				arr[i][j] = 1;

			}
			ind++;
		}

		for (int i = 0; i < arr.length; i++) {  

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
