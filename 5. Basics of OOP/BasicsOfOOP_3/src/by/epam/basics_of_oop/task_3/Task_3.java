package by.epam.basics_of_oop.task_3;

// Создать класс Календарь с внутренним классом, 
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Task_3 {
	public static void main(String[] args) {

		Calendar calendar = new Calendar();

		calendar.addDateToList(2001, 12, 20,true);
		calendar.addDateToList(2011, 10, 10, "Pasha");
		calendar.addDateToList(2001, 12, 21,true);
		calendar.addDateToList(2001, 12, 22);
		calendar.addDateToList(2014, 01, 17, true);
		calendar.addDateToList(2001, 12, 23);
		calendar.addDateToList(2001, 12, 24,"Holiday");

		calendar.printCalendar();
		System.out.println("\n\n");
		calendar.printEasyDays();
	}
}
