package by.epam.stringbuilder.task5;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task_5 {
	public static void main(String[] args) {

		StringBuilder text = new StringBuilder(
				"Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.");
		int aNum = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'а') {
				aNum++;
			}
		}
		System.out.print("Number of letters \"a\": " + aNum);
	}
}
