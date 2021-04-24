package by.epam.basic.branching_1;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_1 {

	public static void main(String[] args) {

		Scanner firstAngle = new Scanner(in);
		out.print("Enter first angle of the triangle: ");

		int a = firstAngle.nextInt();

		Scanner secondAngle = new Scanner(in);
		out.print("Enter second angle of the triangle: ");

		int b = secondAngle.nextInt();

		int check = 180 - a - b;

		if (check <= 0) {

			out.println("Incorrect triangle.");

		} else {

			out.println("Corret triangle.");

			if (a == 90 || b == 90 || check == 90) {

				out.println("Rectangular triangle.");
			}
		}
	}

}
