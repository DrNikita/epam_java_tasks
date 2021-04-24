package by.epam.basic.branching_2;

//Найти max{min(a, b), min(c, d)}.

public class Task_2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 43;
		int c = 81;
		int d = 48;
		int first;
		int second;
		int res;

		first = Math.min(a, b);
		second = Math.min(c, d);
		res = Math.max(first, second);

		System.out.println(res);
	}

}
