package by.epam.string_array.task5;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
// Крайние пробелы в строке удалить.

public class Task_5 {
	public static void main(String[] args) {

		String text = "        Удалить в  строке все    лишние           пробелы.    ";

		System.out.print(changeTheText(text));
	}

	public static String changeTheText(String str) {

		String improveText = str.replaceAll(" +", " ");
		improveText = improveText.trim();

		return improveText;
	}
}
