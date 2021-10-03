package by.epam.basic.linear_prog_4;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task_4 {

	public static void main(String[] args) {

		double change = 123.321;

		int first = (int) change;

		double second = change * 1000;

		int part = (int) second % 1000;

		System.out.println(part + "." + first);

	}
}
