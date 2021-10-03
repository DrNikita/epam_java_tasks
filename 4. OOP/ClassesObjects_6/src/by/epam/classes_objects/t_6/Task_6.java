package by.epam.classes_objects.t_6;

// Составьте описание класса для представления времени. Предусмотрте возможности установки времени и 
// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
// В случае недопустимых значений полей поле устанавливается в значение 0. 
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Task_6 {
	public static void main(String[] args) {
		Time clock = new Time();

		clock.setHours(18);
		clock.setMinutes(40);
		clock.setSeconds(18);

		clock.plusHours(2);
		clock.plusMinutes(68);
		clock.plusSeconds(3640);

		clock.printTime();
	}
}
