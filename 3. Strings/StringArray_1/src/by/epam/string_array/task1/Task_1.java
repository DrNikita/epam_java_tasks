package by.epam.string_array.task1;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task_1 {

	public static void main(String[] args) {

		String[] arr = { "camelCaseCaseCase", "snakeCase" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "(cK) " + getSnakeCase(arr[i]) + "(s_k)");
		}
	}

	private static StringBuilder getSnakeCase(String camelCaseName) {

		StringBuilder snake = new StringBuilder();

		char[] chars = camelCaseName.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			
			if (Character.isLowerCase(chars[i])) { // поиск буквы верхнего регистра
				snake.append(chars[i]);
			
			} else {
				snake.append("_" + Character.toLowerCase(chars[i])); // вставка "_" после большой буквы, 
			}                                                        // перевод всех букв в нижний регистр
		}
		return snake;
	}
}
