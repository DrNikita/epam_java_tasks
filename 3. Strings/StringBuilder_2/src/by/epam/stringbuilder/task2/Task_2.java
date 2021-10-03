package by.epam.stringbuilder.task2;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task_2 {
	public static void main(String[] args) {

		StringBuilder line = new StringBuilder("Lava");

		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == 'a') {
				line.insert(i + 1, 'b');
			}
		}
		System.out.print(line);
	}
}
