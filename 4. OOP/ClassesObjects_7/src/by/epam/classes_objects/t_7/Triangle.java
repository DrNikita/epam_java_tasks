package by.epam.classes_objects.t_7;

import java.util.Arrays;

public class Triangle {
	private int[] a;
	private int[] b;
	private int[] c;

	public Triangle(int[] a, int[] b, int[] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double sideLength(int[] fPoint, int[] sPoint) {
		int a = fPoint[0] - sPoint[0];
		int b = fPoint[1] - sPoint[1];
		double length;

		length = Math.sqrt(a * a + b * b);
		return length;
	}

	public double perimeter() {
		double p;

		double a = sideLength(this.a, this.b);
		double b = sideLength(this.b, this.c);
		double c = sideLength(this.a, this.c);

		p = a + b + c;

		return p;
	}

	public double area() {
		double s;
		double p = perimeter() / 2;

		double a = sideLength(this.a, this.b);
		double b = sideLength(this.b, this.c);
		double c = sideLength(this.a, this.c);

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return s;
	}

	public int[] intersectionPoint() {
		int[] point = new int[2];

		point[0] = (this.a[0] + this.b[0] + this.c[0]) / 3;
		point[1] = (this.a[1] + this.b[1] + this.c[1]) / 3;

		return point;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int[] getB() {
		return b;
	}

	public void setB(int[] b) {
		this.b = b;
	}

	public int[] getC() {
		return c;
	}

	public void setC(int[] c) {
		this.c = c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(a);
		result = prime * result + Arrays.hashCode(b);
		result = prime * result + Arrays.hashCode(c);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (!Arrays.equals(a, other.a))
			return false;
		if (!Arrays.equals(b, other.b))
			return false;
		if (!Arrays.equals(c, other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + Arrays.toString(a) + ", b=" + Arrays.toString(b) + ", c=" + Arrays.toString(c) + "]";
	}
}
