package by.epam.basic.linear_prog_2;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// b + √(b^2 + 4ac) / 2a - a^3c + b^(-2)

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_2 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(in);
		out.print("Enter a:" + " ");

		double a = sca.nextInt();

		Scanner scb = new Scanner(in);
		out.print("Enter b:" + " ");

		double b = scb.nextInt();

		Scanner scc = new Scanner(in);
		out.print("Enter c:" + " ");

		double c = scc.nextInt();

		double z = (Math.sqrt(Math.pow(b, 2) + 4 * a * c) + b) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		out.println(z);
	}

}
