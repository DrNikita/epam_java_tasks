package by.epam.final_tasks.menu;

//  Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. 
//  Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
//  Общие пояснения к практическому заданию.
//• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
//• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров 
//  (группу параметров можно определить самостоятельно), получить требуемые записи в отсортированном виде, 
//  найти записи, текстовое поле которой содержит определенное слово, а также добавить новую запись.
//• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
//• Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;
import by.epam.final_tasks.notebook.Note;
import by.epam.final_tasks.print_write.FileModification;
import by.epam.final_tasks.user_capabilities.Functional;

public class Menu {
	public static void main(String[] args) throws FileNotFoundException {
		FileModification fileModification = new FileModification();
		fileModification.readFileData();

		boolean flag = true;

		while (flag) {

			System.out.println("1. Добавить заметку\n2. Найти запись\n3. Очистить блокнот\n0. Выход");
			Scanner inOption = new Scanner(System.in);
			int option = inOption.nextInt();

			switch (option) {

			case (1):
				System.out.println("Тема: ");
				Scanner inTheme = new Scanner(System.in);
				String theme = inTheme.nextLine();

				System.out.println("Электронная почта: ");
				Scanner inEmail = new Scanner(System.in);
				String email = inEmail.nextLine();

				System.out.println("Заметка: ");
				Scanner inNote = new Scanner(System.in);
				String note = inTheme.nextLine();

				Note note0 = new Note(theme, email, note);
				fileModification.addToContent(note0);
				break;

			case (2):
				System.out.println(
						"Найти запись по:\n1. теме\n2. дате\n3. e-mail\n4. сообщению\n5. слову в сообщении\n6. теме и дате");
				Scanner inParameter = new Scanner(System.in);
				int parameter = inParameter.nextInt();

				switch (parameter) {

				case (1):
					System.out.println("Введите тему:");
					Scanner inFindTheme = new Scanner(System.in);
					String findTheme = inFindTheme.nextLine();

					Functional findByTheme = new Functional();
					System.out.println(findByTheme.searchByTheme(findTheme, fileModification.readFileData()));
					break;

//				case (2):
//					System.out.println("Введите дату:");
//					Scanner inFindDate = new Scanner(System.in);
//					String findDate = inFindDate.nextLine();
//
//					Functional findByDate = new Functional();
//					System.out.println(findByDate.searchByDate(findDate, fileModification.readFileData()));
//					
//					Collections.sort(datestring, new Comparator<String>() {
//		                @Override
//		                public int compare(String object1, String object2) {
//		                    return object1.compareTo(object2);
//		                }
//		            });
//					break;

				case (3):
					System.out.println("Введите email:");
					Scanner inFindEmail = new Scanner(System.in);
					String findEmail = inFindEmail.nextLine();

					Functional findByEmail = new Functional();
					System.out.println(findByEmail.searchByEmail(findEmail, fileModification.readFileData()));
					break;

				case (4):
					System.out.println("Введите сообщение:");
					Scanner inFindMessage = new Scanner(System.in);
					String findMessage = inFindMessage.nextLine();

					Functional findByMessage = new Functional();
					System.out.println(findByMessage.searchByNote(findMessage, fileModification.readFileData()));
					break;

				case (5):
					System.out.println("Введите слово:");
					Scanner inFindWord = new Scanner(System.in);
					String findWord = inFindWord.nextLine();

					Functional findByWord = new Functional();
					System.out.println(findByWord.searchByWord(findWord, fileModification.readFileData()));
					break;

				case (6):
					System.out.println("Введите тему:");
					Scanner inFindThemeD = new Scanner(System.in);
					String findThemeD = inFindThemeD.nextLine();

					System.out.println("Введите дату:");
					Scanner inFindDateT = new Scanner(System.in);
					String findDateT = inFindDateT.nextLine();

					Functional findByThemeD = new Functional();
					Functional findByDateT = new Functional();

					String themeNotes = findByThemeD.searchByTheme(findThemeD, fileModification.readFileData());

					System.out.println(findByDateT.searchByDate(findDateT, themeNotes));
					break;
				}

//			case (3):
//				fileModification.clearFile();
//				break;

			case (0):
				flag = false;
				break;
			}
		}
	}
}
