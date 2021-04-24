package by.epam.basic.cycle_6;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task_6 {

	public static void main(String[] args) {

		for (int i = 33; i <= 126; i++) {

			System.out.println(i + " " + (char) i);
		}
	}
}
