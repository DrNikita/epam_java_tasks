package by.epam.classes_objects.t_3;

import java.util.Arrays;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
// равные только 9 или 10.

public class Task_3 {
	public static void main(String[] args) {
		Student st0 = new Student("Andrey A.A.", "0k3291", new int[] { 6, 8, 9, 3, 6 });
		Student st1 = new Student("Nik A.A.", "7k3291", new int[] { 8, 8, 9, 8, 10 });
		Student st2 = new Student("Joe B.V.", "8k3291", new int[] { 7, 9, 10, 10, 9 });
		Student st3 = new Student("Shadow F.M.", "7k3291", new int[] { 10, 10, 10, 10, 10 });
		Student st4 = new Student("Hello A.V.", "7k3291", new int[] { 9, 7, 10, 9, 6 });
		Student st5 = new Student("World V.V.", "8k3291", new int[] { 6, 7, 7, 8, 10 });
		Student st6 = new Student("Java W.W.", "7k3291", new int[] { 9, 9, 9, 9, 9 });
		Student st7 = new Student("Offlane A.N.", "9k3291", new int[] { 10, 10, 10, 10, 10 });
		Student st8 = new Student("Midlane N.V.", "9kr3291", new int[] { 10, 10, 10, 10, 10 });
		Student st9 = new Student("Easylane S.N.", "9k3291", new int[] { 10, 10, 10, 10, 10 });

		Student[] group = new Student[] { st0, st1, st2, st3, st4, st5, st6, st7, st8, st9 };

		for (int i = 0; i < group.length; i++) {
			if (group[i].getIsBest()) {
				System.out.println(group[i].getName() + " " + group[i].getGroup());
			}
		}
	}
}
