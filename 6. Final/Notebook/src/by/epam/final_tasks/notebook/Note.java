package by.epam.final_tasks.notebook;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note {
	private String theme;
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	GregorianCalendar date = new GregorianCalendar();
	private String email;
	private String message;
	private String note;

	public Note(String theme, String email, String message) throws FileNotFoundException {
		if (this.infoCheck(theme, email, message)) {
			this.theme = theme;
			this.email = email;
			this.message = message;
			this.note = "Theme: " + this.theme + "\nDate: " + this.df.format(date.getTime()) + "\nEmail: " + this.email
					+ "\nMessage: " + this.message + "\n\n";
		} else {
			this.theme = "";
			this.email = "";
			this.message = "";
			this.note = "";
			System.out.println("Incorrect data\nNote cannot be added");
		}
	}

	private boolean infoCheck(String theme, String email, String message) {
		boolean result = false;

		Pattern themeFormPattern = Pattern.compile(".+");
		Matcher themeFormMatcher = themeFormPattern.matcher(theme);

		Pattern emailFormPattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher emailFormMatcher = emailFormPattern.matcher(email);

		Pattern messageFormPattern = Pattern.compile(".+");
		Matcher messageFormMatcher = messageFormPattern.matcher(message);

		if (themeFormMatcher.find() && emailFormMatcher.find() && messageFormMatcher.find()) {
			result = true;
		}
		return result;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public DateFormat getDf() {
		return df;
	}

	public void setDf(DateFormat df) {
		this.df = df;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Note [theme=" + theme + ", df=" + df + ", date=" + date + ", email=" + email + ", message=" + message
				+ ", note=" + note + "]";
	}
}