package by.epam.basic.branching_4;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

		Scanner aa = new Scanner(System.in);
		System.out.print("Enter the width of the hole: ");

		int a = aa.nextInt();

		Scanner bb = new Scanner(System.in);
		System.out.print("Enter the height of the hole: ");

		int b = bb.nextInt();

		Scanner xx = new Scanner(System.in);
		System.out.print("Enter the width of the brick: ");

		int x = xx.nextInt();

		Scanner yy = new Scanner(System.in);
		System.out.print("Enter the height of the brick:");

		int y = yy.nextInt();

		Scanner zz = new Scanner(System.in);
		System.out.print("Enter the length of the brick:");

		int z = zz.nextInt();

		if (a >= x && b >= y || a >= y && b >= x) {

			System.out.println("OK");

		} else {

			System.out.println("NOT OK");
		}
	}

}
