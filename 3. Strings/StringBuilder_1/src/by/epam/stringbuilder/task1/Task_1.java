package by.epam.stringbuilder.task1;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task_1 {
	public static void main(String[] args) {

		String text = "        Удалить в  строке все    лишние      пробелы.    ";
		System.out.print(spacesNum(text));
	}

	private static int spacesNum(String text) {

		int maxSp = 0;
		int spaceNum = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ')
				spaceNum++;

			else {

				if (spaceNum > maxSp) {
					maxSp = spaceNum;
				}
				spaceNum = 0;
			}
		}
		return maxSp;
	}
}
