package by.epam.stringbuilder.task4;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

import java.util.Arrays;

public class Task_4 {
	public static void main(String[] args) {

		StringBuilder originalWord = new StringBuilder("информатика");
		StringBuilder makeWord = new StringBuilder("форматировать");
		StringBuilder formedWord = new StringBuilder();
		int flag = 0;

		for (int i = 0; i < makeWord.length(); i++) {
			for (int j = 0; j < originalWord.length(); j++) {

				if (makeWord.charAt(i) == originalWord.charAt(j)) {

					flag++;
					formedWord.append(originalWord.charAt(j));
					break;
				}
			}
			if (flag == 0) {
				System.out.print("The word cannot be formed.");
				
				break;
			}
		}
		System.out.print(formedWord);
	}
}
