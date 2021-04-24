package by.epam.basic.linear_prog_6;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int y;
		int x;

		System.out.print("Axis y = ");
		y = scanner.nextInt();

		System.out.print("Axis x = ");
		x = scanner.nextInt();

		if (y > 0 && y <= 4) {

			if (x >= -2 && x <= 2) {

				System.out.println("true");

			} else {

				System.out.println("false");
			}
		}

		if (y <= 0 && y >= -3) {

			if (x <= 4 && x >= -4) {

				System.out.println("true");

			} else {

				System.out.println("false");
			}
		}
	}
}
