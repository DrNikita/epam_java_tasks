package by.epam.basic.cycle_8;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task_8 {

	public static void main(String[] args) {

		int a = 5783;
		int b = 4906;

		Structure(b);
		Structure(a);
	}

	public static void Structure(int num) {

		int numOut;

		for (; num > 0; num /= 10) {

			numOut = num % 10;

			System.out.print(numOut + "; ");
		}
	}

}
