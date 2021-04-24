package by.epam.two_dimensional_arr.task_4;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//  | 1 2 3 ... n |
//  | n n-1 n-2 ... 1 |
//| 1 2 3 ... n |
//  | n n-1 n-2 ... 1 |
//  | .  .   .  ... . |
//  | .  .   .  ... . |
//  | .  .   .  ... . |
//  | n n-1 n-2 ... 1 |

public class Task_4 {

	public static void main(String[] args) {

		int n = 8;

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			int ind = n;

			if (i % 2 == 0) {

				for (int j = 0; j < n; j++) {

					arr[i][j] = j + 1;

					System.out.print(arr[i][j] + "    ");

				}

			} else {

				for (int j = 0; j < n; j++) {

					arr[i][j] = ind;
					ind--;

					System.out.print(arr[i][j] + "    ");

				}
			}
			ind = n;

			System.out.print("\n" + "\n");
		}

	}

}
