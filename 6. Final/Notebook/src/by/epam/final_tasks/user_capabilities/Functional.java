package by.epam.final_tasks.user_capabilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.epam.final_tasks.print_write.FileModification;

public class Functional {
	private FileModification fileModification;
	private Pattern note;
	private Matcher matcher;
	private File notebook = new File("Notebook");

	public Functional() throws FileNotFoundException {
		this.fileModification = new FileModification();
		this.note = Pattern.compile(".*\n.*\n.*\n.*\n{2}");
		this.matcher = note.matcher(this.fileModification.readFileData());
	}

	public String searchByTheme(String theme, String string) throws FileNotFoundException {
		String themes = "";
		Scanner scan = new Scanner(string);

		Pattern formPattern = Pattern.compile(".+");
		Matcher formMatcher = formPattern.matcher(theme);

		if (formMatcher.find()) {
			Pattern themePattern = Pattern.compile("Theme:\s" + theme);

			while (scan.hasNext()) {
				scan.nextLine();
				if (this.matcher.find()) {
					Matcher themeMatcher = themePattern.matcher(matcher.group());

					if (themeMatcher.find()) {
						themes += this.matcher.group();
					}
				}
			}
		} else {
			System.out.println("Theme has not been entered");
		}
		scan.close();
		return themes;
	}

	public String searchByDate(String date, String string) throws FileNotFoundException {
		String themes = "";
		Scanner scan = new Scanner(this.fileModification.readFileData());

		Pattern formPattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
		Matcher formMatcher = formPattern.matcher(date);

		if (formMatcher.find()) {
			Pattern datePattern = Pattern.compile("Date:\s" + date);

			while (scan.hasNext()) {
				scan.nextLine();
				if (this.matcher.find()) {
					Matcher dateMatcher = datePattern.matcher(matcher.group());

					if (dateMatcher.find()) {
						themes += this.matcher.group();
					}
				}
			}
		} else {
			System.out.println("Incorrect date.");
		}
		scan.close();
		return themes;
	}

	public String searchByEmail(String email, String string) throws FileNotFoundException {
		String themes = "";
		Scanner scan = new Scanner(this.fileModification.readFileData());

		Pattern formPattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher formMatcher = formPattern.matcher(email);

		if (formMatcher.find()) {
			Pattern emailPattern = Pattern.compile("Email:\s" + email);

			while (scan.hasNext()) {
				scan.nextLine();
				if (this.matcher.find()) {
					Matcher themeMatcher = emailPattern.matcher(matcher.group());

					if (themeMatcher.find()) {
						themes += this.matcher.group();
					}
				}
			}
		} else {
			System.out.println("Incorrect email");
		}
		scan.close();
		return themes;
	}

	public String searchByNote(String note, String string) throws FileNotFoundException {
		String themes = "";
		Scanner scan = new Scanner(this.fileModification.readFileData());

		Pattern formPattern = Pattern.compile(".+");
		Matcher formMatcher = formPattern.matcher(note);

		if (formMatcher.find()) {
			Pattern notePattern = Pattern.compile("Message:\s" + note);

			while (scan.hasNextLine()) {
				scan.nextLine();
				if (this.matcher.find()) {
					Matcher themeMatcher = notePattern.matcher(matcher.group());

					if (themeMatcher.find()) {
						themes += this.matcher.group();
					}
				}
			}
		} else {
			System.out.println("Note has not been entered.");
		}
		scan.close();
		return themes;
	}

	public String searchByWord(String word, String string) throws FileNotFoundException {
		String themes = "";
		Scanner scan = new Scanner(this.fileModification.readFileData());

		Pattern formPattern = Pattern.compile("\\S\\w+\\S");
		Matcher formMatcher = formPattern.matcher(word);

		if (formMatcher.find()) {
			Pattern wordPattern = Pattern.compile("Message:\s.+");

			while (scan.hasNextLine()) {
				scan.nextLine();
				if (this.matcher.find()) {
					Matcher wordMatcher = wordPattern.matcher(matcher.group());

					if (wordMatcher.find() && wordMatcher.group().contains(word)) {
						themes += this.matcher.group();
					}
				}
			}
		} else {
			System.out.println("Not a word");
		}
		scan.close();
		return themes;
	}
}