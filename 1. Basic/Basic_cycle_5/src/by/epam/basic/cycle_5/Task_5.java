package by.epam.basic.cycle_5;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид: an = (1 / 2^n) + (1 / 3^n)

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		double e = 0.1;
		double res = 0;

		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number of digits in a row: ");

		int mas = num.nextInt();

		for (int n = 0; n < mas; n++) {

			double[] ryad = new double[mas];

			ryad[n] = Math.pow(2, (-n)) + Math.pow(3, (-n));

			if (Math.abs(ryad[n]) >= e) {

				res += ryad[n];
			}
		}

		System.out.print(res);
	}
}
