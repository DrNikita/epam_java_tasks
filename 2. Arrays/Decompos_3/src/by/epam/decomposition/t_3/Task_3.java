package by.epam.decomposition.t_3;

// Вычислить площадь правильного шестиугольника со стороной а, 
// используя метод вычисления площади треугольника.

public class Task_3 {

	public static void main(String[] args) {

		int a = 8;
		double s = 0;
		double osn = 0;
		double h;
		System.out.print("Длина стороны правильного шестиугольника: " + a + "см => угол = 120°.");

		h = high(a);
		osn = osnovanie(a, h);
		s = triangleS(osn, h) * 2 + a * osn;                // сумма площадей треугольников и прямоугольника

		System.out.print("\nS = " + s);
	}

	public static double high(int a) {                      // высота треугольника
		double h;
		h = a / 2;
		return h;
	}

	public static double osnovanie(int a, double h) {       // основание треугольника
		double osn;
		osn = Math.sqrt(a * a - h * h);
		return osn * 2;
	}

	public static double triangleS(double osn, double h) {  // площадь треугольника
		double s;
		s = h * osn / 2;
		return s;
	}
}
