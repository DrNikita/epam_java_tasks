package by.epam.sorting.task_1;

  // Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 // один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
// дополнительный массив.

import java.util.Arrays;

public class Task_1 {

	public static void main(String[] args) {

		int k = 3;

		String[] firstArr = new String[] { "Hello", "my", "beautiful" };
		String[] secondArr = new String[] { "World", "!", "!", "!" };

		int lenF = firstArr.length;
		int lenS = secondArr.length;

		if (k > firstArr.length) {
			
			System.out.print("IndexOutOfBoundsException");
		
		} else {

			firstArr = Arrays.copyOf(firstArr, lenF + lenS);                        // увеличение размера
			secondArr = Arrays.copyOf(secondArr, lenF + lenS);                     // массивов

			System.arraycopy(firstArr, k, secondArr, lenS, lenF - k);              // копирование во второй массив первого начиная с
																		          // элемента k

			System.arraycopy(secondArr, 0, firstArr, k, secondArr.length - k);    // объединение первого массива с
																				 // измененным вторым

			System.out.print(Arrays.toString(firstArr));
		}
	}
}
