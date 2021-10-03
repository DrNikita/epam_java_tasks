package by.epam.regular_expressions.task2;

//Дана строка, содержащая следующий текст (xml-документ):
//	...
//	Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа 
//	и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться 
//	готовыми парсерами XML для решения данной задачи нельзя.

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task_2 {
	public static void main(String[] args) {

		String xmlDoc = "<notes>\r\n" + "<note id = \"1\">\r\n" + "<to>Вася</to>\r\n" + "<from>Света</from>\r\n"
				+ "<heading>Напоминание</heading>\r\n" + "<body>Позвони мне завтра!</body>\r\n" + "</note>\r\n"
				+ "<note id = \"2\">\r\n" + "<to>Петя</to>\r\n" + "<from>Маша</from>\r\n"
				+ "<heading>Важное напоминание</heading>\r\n" + "<body/>\r\n" + "</note>\r\n" + "</notes>";

		System.out.print(xmlAnalyzer(xmlDoc));
	}

	private static String xmlAnalyzer(String xmlDoc) {

		Pattern opTag = Pattern.compile("<\\w.+?[^/]>");
		Pattern clTag = Pattern.compile("</\\w.+?[^/]>");
		Pattern tagContent = Pattern.compile(">.+?<");
		Pattern tag = Pattern.compile("<.*/>");

		StringBuilder analyzedXml = new StringBuilder();

		String[] rows = xmlDoc.split("\r\n");

		for (int i = 0; i < rows.length; i++) {

			Matcher tgOp = opTag.matcher(rows[i]);
			Matcher tgCl = clTag.matcher(rows[i]);
			Matcher tgCont = tagContent.matcher(rows[i]);
			Matcher tgTag = tag.matcher(rows[i]);

			if (tgOp.find()) {
				analyzedXml.append(tgOp.group() + "   //открывающий тег;\n");
			}

			if (tgCont.find()) {
				analyzedXml.append(tgCont.group(), 1, (tgCont.group().length() - 1));
				analyzedXml.append("   //содердимое тега;\n");
			}

			if (tgCl.find()) {
				analyzedXml.append(tgCl.group() + "   //закрывающий тег;\n");
			}

			if (tgTag.find()) {
				analyzedXml.append(tgTag.group() + "   //тег без тела;\n");
			}
		}
		return analyzedXml.toString();
	}
}
