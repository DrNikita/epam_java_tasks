package by.epam.stringbuilder.task9;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
// Учитывать только английские буквы.

public class Task_9 {
	public static void main(String[] args) {

		String str = "Hello Мир!";

		int upperCaseNum = 0;
		int lowerCase = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean charLang = (int) ch >= 65 && (int) ch <= 122;

			if (Character.isUpperCase(str.charAt(i)) && charLang) {

				upperCaseNum++;

			} else if (Character.isLowerCase(str.charAt(i)) && charLang) {

				lowerCase++;
			}
		}
		System.out.print("Количество прописных букв: " + upperCaseNum + "\nКоличество строчнх букв: " + lowerCase);
	}
}
