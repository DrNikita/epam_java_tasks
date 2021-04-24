package by.epam.basic.cycle_2;

// Вычислить значения функции на отрезке [а,b] c шагом h: 
//    { x, x > 2   
//y = |
//    {-x, x <= 2

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {

		Scanner notr = new Scanner(System.in);
		System.out.print("Enter the start of the line segment: ");

		int start = notr.nextInt();

		Scanner kotr = new Scanner(System.in);
		System.out.print("Enter the finish of the line segment: ");

		int finish = kotr.nextInt();

		Scanner step = new Scanner(System.in);
		System.out.println("Enter segment step: ");

		int segStep = step.nextInt();

		int x = 0;

		if (start >= finish || segStep > finish - start) {

			System.out.println("Incorrect segment dimensions or segment step.");

		} else {

			for (int i = start; i <= finish; i += segStep) {

				if (i > 2) {

					x = i;

				} else {

					x = -i;
				}
				System.out.print(x + "  ");
			}
		}
	}

}
