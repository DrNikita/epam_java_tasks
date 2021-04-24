package by.epam.two_dimensional_arr.task_5;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//| 1 1 1 ... 1 1 1 |
//| 2 2 2 ... 2 2 0 |
//| 3 3 3 ... 3 0 0 |
//| . . . ... . . . |
//| . . . ... . . . |
//| . . . ... . . . |
//| n-1 n-1 0 ... 0 |
//| n 0 0 ... 0 0 0 |

public class Task_5 {

	public static void main(String[] args) {

		int n = 9;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = i + 1;

				for (int f = n - i; f < arr.length; f++) {

					if (f == arr.length) {

						continue;
					} else {

						arr[i][f] = 0;
					}
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
