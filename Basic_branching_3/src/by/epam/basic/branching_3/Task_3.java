package by.epam.basic.branching_3;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task_3 {

	public static void main(String[] args) {

		int x1 = 2;
		int y1 = 2;
		int x2 = 3;
		int y2 = 3;
		int x3 = 4;
		int y3 = 4;

		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {

			System.out.println("Dots are on the same line.");

		} else {

			System.out.println("Dots aren't on the same line.");
		}
	}

}
