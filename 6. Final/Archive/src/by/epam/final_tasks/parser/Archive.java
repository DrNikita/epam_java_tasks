package by.epam.final_tasks.parser;

import java.util.ArrayList;
import java.util.List;

public class Archive {
	private static ArrayList<Student> students = new ArrayList();

	public ArrayList<Student> getStudets() {
		return students;
	}

	public void setStudet(Student student) {
		this.students.add(student);
	}

	public static ArrayList<Student> getStudents() {
		return students;
	}

	public static void setStudents(ArrayList<Student> students) {
		Archive.students = students;
	}
}
