package by.epam.classes_objects.t_7;

import java.util.Arrays;

// Описать класс, представляющий треугольник. 
// Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Task_7 {
	public static void main(String[] args) {
		int[] a = { 0, 0 };
		int[] b = { 2, 4 };
		int[] c = { 4, 0 };

		Triangle triangle = new Triangle(a, b, c);

		System.out.println("P = " + triangle.perimeter() + ";");
		System.out.println("S = " + triangle.area() + ";");
		System.out.println("Координаты точки пересечения медиан треугольника: "
				+ Arrays.toString(triangle.intersectionPoint()) + ".");
	}
}
