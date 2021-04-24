package by.epam.algorithmicization.one_arr_6;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
//порядковые номера которыхявляются простыми числами.

public class Task_6 {

	public static void main(String[] arg) {

		double[] arr = new double[] { 6.7, 8.4, 3.9, 6.7, 8.9, 2.4, 5.7, 8.9 };

		double sum = 0;
		double ind = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int x = 1; x <= i; x++) {

				if (i > 1 && i % x == 0) {

					ind++;                 //вычисление количества возможных 
                                           //операций целочисленного деления
				}
			}

			if (ind == 2) {
				ind = 0;
				sum = sum + arr[i];       //проверка: является ли номер элемента в массиве простым числом
			}
			ind = 0;
		}
		System.out.print(sum);
	}
}
