package by.epam.basic.cycle_7;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		System.out.print("Enter the beginning of the range: ");

		int begin = m.nextInt();

		Scanner n = new Scanner(System.in);
		System.out.print("Enter the end of the range: ");

		int end = n.nextInt();

		if (begin >= end) {

			System.out.println("Icorrect range.");

		} else {

			for (int i = begin; i <= end; i++) {

				System.out.print("Number:" + i + "  Diver: ");

				for (int del = 2; del < i; del++) {

					if (i % del == 0) {

						System.out.print(del + "; ");
					}
				}
				
				System.out.println();
			}
		}

	}
}
