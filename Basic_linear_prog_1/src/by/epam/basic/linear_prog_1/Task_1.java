package by.epam.basic.linear_prog_1;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

import java.util.Scanner;

import static java.lang.System.*;

public class Task_1 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		Scanner sca = new Scanner(in);
		
		out.print("Enter a:" + " ");
		a = sca.nextInt();

		Scanner scb = new Scanner(in);
		
		out.print("Enter b:" + " ");
		b = scb.nextInt();

		Scanner scc = new Scanner(in);
		
		out.print("Enter c:" + " ");
		c = scc.nextInt();

		z = ((a - 3) * b / 2) + c;
		
		out.print(z);

	}

}
