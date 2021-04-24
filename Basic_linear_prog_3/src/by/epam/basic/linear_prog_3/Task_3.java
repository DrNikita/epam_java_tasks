package by.epam.basic.linear_prog_3;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//((sin x + cos y) / (cos x - sin y)) * tg  xy

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_3 {

	public static void main(String[] args) {

		Scanner scx = new Scanner(in);

		out.print("Enter x:" + " ");

		double x = scx.nextInt();

		Scanner scy = new Scanner(in);

		out.print("Enter y:" + " ");

		double y = scy.nextInt();

		double z = (Math.sin(x) + Math.cos(y) * Math.tan(x * y)) / (Math.cos(x) - Math.sin(y));

		out.println(z);
	}

}
