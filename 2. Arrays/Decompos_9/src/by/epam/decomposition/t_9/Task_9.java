package by.epam.decomposition.t_9;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой

public class Task_9 {
	public static void main(String[] args) {

		int x = 4;
		int y = 8;
		int z = 7;
		int t = 10;

		double gip = 0;
		double pol1 = 0;
		double pol2 = 0;
		double s = 0;

		gip = gipotenuza(x, y);
		pol1 = poluperimetr(x, y, gip);
		pol2 = poluperimetr(z, t, gip);

		s = triangleS(x, y, gip, pol1) + triangleS(z, t, gip, pol2);

		System.out.print("Sxyzt = " + s);
	}

	public static double gipotenuza(int x, int y) { // гипотенуза

		double gip = 0;

		gip = Math.sqrt(x * x + y * y);

		return gip;
	}

	public static double poluperimetr(int x, int y, double gipotenuza) { // полупериметр треугольника

		double p = 0;

		p = (x + y + gipotenuza) / 2;

		return p;
	}

	public static double triangleS(int x, int y, double z, double p) { // площадь треугольника

		double s = 0;

		s = Math.sqrt(p * (p - x) * (p - y) * (p - z));

		return s;
	}
}
