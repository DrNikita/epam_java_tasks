package by.epam.stringbuilder.task6;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task_6 {
	public static void main(String[] args) {

		StringBuilder text = new StringBuilder("Из заданной строки получить новую, повторив каждый символ дважды.");
		StringBuilder newText = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			newText.append(text.charAt(i));
			newText.append(text.charAt(i));
		}
		System.out.print(newText.toString());
	}
}
