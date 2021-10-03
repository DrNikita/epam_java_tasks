package by.epam.string_array.task2;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task_2 {

	public static void main(String[] args) {

		String text = "word hello word hello world changed";
		text = text.replace("word", "letter");

		System.out.print(text);
	}
}
