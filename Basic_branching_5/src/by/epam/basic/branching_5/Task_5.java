package by.epam.basic.branching_5;

//Вычислить значение функции: F(x) = {x^2-3x+9, если x<=3; 1/(x^3+6), если x>3.}

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter x: ");

		double x = inp.nextInt();

		if (x <= 3) {

			System.out.print(Math.pow(x, 2) - 3 * x + 9);

		} else {

			System.out.print(1 / (Math.pow(x, 3) + 6));
		}
	}

}
