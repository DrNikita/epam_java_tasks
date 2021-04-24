package by.epam.basic.cycle_1;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		Scanner v = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int vvod = v.nextInt();

		int res = 0;

		for (int i = 0; i <= vvod; i++) {

			res = res + i;
		}
		
		System.out.print(res);
	}

}
