package by.epam.algorithmicization.task_9;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них.

public class Task_9 {
	public static void main(String[] arg) {

		int[] arr = new int[] { 6, 8, 9, 3, 5, 8, 9, 6, 8, 7, 6, 9, 2, 0, 5, 6, 1, 9 };

		System.out.print(same(arr));
	}

	public static int same(int[] mas) {

		int[] samenum = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {         // заполнение массива samenum[] количеством повторений
												       // соответствующих элемнтов в передаваемом в меттод массиве
			for (int j = 0; j < mas.length; j++) {

				if (mas[i] == mas[j]) {

					samenum[i]++;

				}
			}
		}

		int minNum = mas[0];
		int maxElem = samenum[0];

		for (int i = 0; i < samenum.length; i++) {

			if (maxElem < samenum[i]) {               

				maxElem = samenum[i];                  //максимальное число из массива с количеством повторений

				minNum = mas[i];                       //наиболлее часто встречающееся число в передаваемом массиве

			}

			if ((maxElem == samenum[i]) && (mas[i] < minNum)) {    //Условие выполняется, если найдено 
                                                                   //наиболлее часто встречающееся число.
				minNum = mas[i];                                   //Нахождение минимального числа из наиболлее часто встречающихся

			}
		}

		return minNum;

	}
}