package by.epam.string_array.task4;

//// В строке найти количество чисел.

public class Task_4 {
	public static void main(String[] args) {

		String text = "Hello world 1 6 18 word 3.2 letter 3 1.1";
		String[] textArr = splitTheLine(text);
		int n = 0;

		for (int i = 0; i < textArr.length; i++) {

			if (isDigit(textArr[i])) {
				n++;
			}
		}
		System.out.print("В строке " + n + " числа(чисел)");
	}

	public static String[] splitTheLine(String line) { // разделение текста на отдельные элементы

		String[] textArr = line.split(" ");
		return textArr;
	}

	public static boolean isDigit(String s) throws NumberFormatException { // конвертация всех элементов
																			// строки в Double
																			// (т. е. поиск чисел)
		try {
			Double.parseDouble(s);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}
	}
}
