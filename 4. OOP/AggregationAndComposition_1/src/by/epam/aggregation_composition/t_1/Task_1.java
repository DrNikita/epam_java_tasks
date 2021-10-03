package by.epam.aggregation_composition.t_1;

// Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
// вывести на консоль текст, заголовок текста.

public class Task_1 {
	public static void main(String[] args) {

		Word word = new Word("Связывание");
		Word word1 = new Word("Вызов");
		Word word2 = new Word("метода");
		Word word3 = new Word("означает");
		Word word4 = new Word("что");
		Word word5 = new Word("Этот");
		Word word6 = new Word("метод");
		Word word7 = new Word("привязывается");
		Word word8 = new Word("к конкретному");
		Word word9 = new Word("коду");

		Sntence header = new Sntence();
		header.fillSentence(word);

		Sntence sent = new Sntence();
		Sntence sent1 = new Sntence();

		sent.fillSentence(word1);
		sent.fillSentence(word2);
		sent.fillSentence(word3);
		sent.fillSentence(word4);
		sent1.fillSentence(word5);
		sent1.fillSentence(word6);
		sent1.fillSentence(word7);
		sent1.fillSentence(word8);
		sent1.fillSentence(word9);

		Text text = new Text(header);

		text.addTextSentence(sent);
		text.addTextSentence(sent1);

		text.print();
	}
}