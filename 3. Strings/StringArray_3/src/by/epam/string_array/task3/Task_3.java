package by.epam.string_array.task3;

// В строке найти количество цифр.

public class Task_3 {
	public static void main(String[] args) {

		String text = "Hello world 1 6 18 word 3.2 letter 3 1.1";
		char[] textArr = text.toCharArray();
		int digitNum = 0;

		for (int i = 0; i < textArr.length; i++) {
			String charToStr = Character.toString(textArr[i]);

			if (isDigit(charToStr)) {
				digitNum++;
			}
		}
		System.out.print("Количество цифр в строке: " + digitNum);
	}

	public static boolean isDigit(String s) throws NumberFormatException { // конвертация всех элементов
																			// строки в Byte
																			// (т. е. поиск цифр)
		try {
			Byte.parseByte(s);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}
	}
}
