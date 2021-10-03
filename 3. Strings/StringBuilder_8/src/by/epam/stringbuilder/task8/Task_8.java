package by.epam.stringbuilder.task8;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task_8 {
	public static void main(String[] args) {

		String text = new String("Найти самое длинное слово и вывести его на экран");

		String[] words = new String[] {};

		words = text.split(" ");

		String oneWord = words[0];
		int firstWordLength = oneWord.length();

		String longestWord = new String();

		int noOne = 0;

		for (int i = 1; i < words.length; i++) {

			int wordLength = words[i].length();

			if (firstWordLength < wordLength) {

				longestWord = words[i];
				firstWordLength = longestWord.length();
				noOne++;
			}
		}

		if (noOne > 0) {
			System.out.print(longestWord);
		} else {
			System.out.print(oneWord);
		}
	}
}
