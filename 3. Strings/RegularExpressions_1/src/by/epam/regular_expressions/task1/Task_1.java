package by.epam.regular_expressions.task1;

// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять
// с текстом три различных операции: отсортировать абзацы по количеству предложений; в каждом 
// предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию 
// количества вхождений заданного символа, а в случае равенства – по алфавиту.

import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task_1 {
	public static void main(String[] args) {

		String text = new String("Киберспортсмен Анатан Фам объявил о завершении карьеры игрока в Dota 2."
				+ "\nАнонс состоялся на официальном сайте OG." + " Кто займет его место в команде, неизвестно.\r\n"
				+ "\nAna впервые присоединился к OG в августе 2016 года, однако в конце сезона покинул организацию."
				+ "\nКерри вернулся в команду в июне 2018-го — с его помощью состав выиграл The International 2018 и"
				+ "\nThe International 2019. В обоих случаях Фам брал длительный отпуск после победы на турнире.\r\n"
				+ "\nAna вернулся в стартовый ростер OG в апреле 2021 года — перед началом второго сезона Dota Pro Circuit 2021"
				+ "\nдля Европы. Коллектив занял шестое место в первом дивизионе и не прошел на WePlay AniMajor 2021."
				+ "\nФам покинул состав еще до завершения тай-брейков.о.о.");

		Scanner input = new Scanner(System.in);
		int operation = 1;

		while (operation != 0) {
			System.out.print("Возможные операции:" + "\n1.Отсортировать абзацы по количеству предложений."
					+ "\n2.В каждом предложении отсортировать слова по длине."
					+ "\n3.Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа."
					+ "\n0.Выйти из приложения." + "\n\nВведите номер операции которую необходиом выполнить: ");

			operation = input.nextInt();

			if (operation >= 0 && operation <= 3) {

				switch (operation) {

				case (1):
					String[] sortedText = sortParagraphNumOfSentenses(text);
					for (int i = 0; i < sortedText.length; i++) {
						System.out.println(sortedText[i] + "\n");
					}
					break;

				case (2):
					System.out.print(sortWordsLengthInSentense(text));
					break;

				case (3):
					Scanner sc = new Scanner(System.in);
					System.out.print("Введите буквенный символ: ");
					String lt = sc.nextLine();
					System.out.print(lexemeSortInSentence(text, lt));
					break;
				}
			} else {
				System.out.print("\nОперации не существует. Введите другой номер.\n");
			}
		}
	}

	public static String[] sortParagraphNumOfSentenses(String text) {

		Pattern patText = Pattern.compile("\\r\\n{2}");
		Pattern patSent = Pattern.compile("[\\!\\?\\.\\...]");

		int maxSentensesNum = 0;
		int index = 0;

		String[] paragraph = patText.split(text);

		for (int j = 0; j < paragraph.length; j++) {
			for (int i = j; i < paragraph.length; i++) {

				String[] sentencesNum = patSent.split(paragraph[i]);

				if (maxSentensesNum < sentencesNum.length) {

					maxSentensesNum = sentencesNum.length;
					index = i;
				}
			}
			maxSentensesNum = 0;

			String thirdVar = paragraph[j];
			paragraph[j] = paragraph[index];
			paragraph[index] = thirdVar;
		}
		return paragraph;
	}

	public static String sortWordsLengthInSentense(String text) {

		StringBuilder newText = new StringBuilder();

		Pattern textSplit = Pattern.compile("[\\?\\!\\.\\...]");
		Pattern sentenceSplit = Pattern.compile("[\\s\\,\\:\\;]");
		Pattern wordSplit = Pattern.compile("");

		StringBuilder sortedText = new StringBuilder();

		int maxWordLength = 0;
		int index = 0;

		String[] sentences = textSplit.split(text);

		for (int i = 0; i < sentences.length; i++) {
			String[] words = sentenceSplit.split(sentences[i]);

			for (int j = 0; j < words.length; j++) {
				for (int k = j; k < words.length; k++) {
					String[] letters = wordSplit.split(words[k]);

					if (maxWordLength < letters.length) {
						maxWordLength = letters.length;
						index = k;
					}
				}
				maxWordLength = 0;
				sortedText.append(words[index] + " ");
				String thirdVar = words[j];
				words[j] = words[index];
				words[index] = thirdVar;
			}
			sortedText.append(". ");
		}
		return sortedText.toString();
	}

	public static String lexemeSortInSentence(String text, String lt) {
		Pattern sent = Pattern.compile("[\\.\\!\\?]");
		Pattern wrd = Pattern.compile("[\\s\\,\\:\\;]");
		Pattern let = Pattern.compile("");
		Pattern compare = Pattern.compile(lt);

		int sameChar = 0;
		int maxSameChar = 0;

		StringBuilder tx = new StringBuilder();

		String[] sentences = sent.split(text);

		for (int i = 0; i < sentences.length; i++) {
			String[] words = wrd.split(sentences[i]);
			Arrays.sort(words);

			for (int f = words.length; f > 0; f--) {
				for (int j = 0; j < f; j++) {
					String[] letters = let.split(words[j]);

					for (int k = 0; k < letters.length; k++) {
						Matcher comp = compare.matcher(letters[k]);
						Matcher compUp = compare.matcher(letters[k].toUpperCase());
						Matcher compLow = compare.matcher(letters[k].toLowerCase());

						if (comp.find() || compUp.find() || compLow.find()) {
							sameChar++;
						}
					}
					if (maxSameChar < sameChar) {

						maxSameChar = sameChar;

						String thirdVar = words[j];
						words[j] = words[f - 1];
						words[f - 1] = thirdVar;
					}
					sameChar = 0;
				}
				maxSameChar = 0;
			}
			for (int add = 0; add < words.length; add++) {
				tx.append(words[add] + " ");
			}
			tx.append(". ");
		}
		return tx.toString();
	}
}
