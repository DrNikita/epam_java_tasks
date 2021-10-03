package by.epam.algorithmicization.task_2;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task_2 {

	public static void main(String[] args) {

		int z = 6;
		int change = 0;

		int[] line = new int[] { 6, 1, 9, 3, 0, 5, 9, 2, 8, 9, 0, 6, 8, 4, 0, 3 };

		System.out.print("{");

		for (int i = 0; i < line.length; i++) {

			if (line[i] > z) {

				line[i] = z;
				change++;
			}

			if (i != line.length - 1) {

				System.out.print(line[i] + ",");

			} else {

				System.out.println(line[line.length - 1] + "}");
			}
		}

		System.out.print("Number of replacements: " + change);
	}
}
