package by.epam.stringbuilder.task3;

// Проверить, является ли заданное слово палиндромом.
import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {

		Scanner enterTheWord = new Scanner(System.in);

		System.out.print("Enter the word ");

		String enteredWord = enterTheWord.nextLine();

		StringBuilder word = new StringBuilder(enteredWord);
		StringBuilder reverseWord = new StringBuilder(enteredWord);
		reverseWord.reverse();

		if (word.toString().equalsIgnoreCase(reverseWord.toString())) {

			System.out.print("Палиндром");

		} else {

			System.out.print("Не палиндром");
		}
	}
}
