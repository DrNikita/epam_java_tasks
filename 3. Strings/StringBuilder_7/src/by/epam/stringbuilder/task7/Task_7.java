package by.epam.stringbuilder.task7;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {

		String text = "aa bb cc dd ee ff gg hh ii";

		text = text.replace(" ", "");

		String unRep = text.charAt(0) + "";

		char[] charText = text.toCharArray();

		for (int i = 0; i + 1 < charText.length; ++i) {

			if (text.charAt(i) != text.charAt(i + 1)) {
				unRep += text.charAt(i + 1);
			}
		}

		System.out.println(unRep);
	}
}
