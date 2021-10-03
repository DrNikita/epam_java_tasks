package by.epam.classes_objects.t_10;

// Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, 
// set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, 
// с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class Task_10 {
	public static void main(String[] args) {
		AirLinesList flights = new AirLinesList();

		Airline flight = new Airline("Минск", "403", "Широкофюзеляжный", "6:00", "Понедельник");
		Airline flight1 = new Airline("Киев", "86", "Узкофюзеляжный", "9:00", "Вторник");
		Airline flight2 = new Airline("Москва", "101", "Широкофюзеляжный", "14:00", "Среда");
		Airline flight3 = new Airline("Варшава", "38", "Узкофюзеляжный", "11:00", "Четверг");
		Airline flight4 = new Airline("Минск", "403", "Широкофюзеляжный", "12:00", "Понедельник");
		Airline flight5 = new Airline("Варшава", "38", "Узкофюзеляжный", "8:00", "Четверг");
		Airline flight6 = new Airline("Москва", "101", "Широкофюзеляжный", "19:00", "Среда");

		flights.listFilling(flight);
		flights.listFilling(flight1);
		flights.listFilling(flight2);
		flights.listFilling(flight3);
		flights.listFilling(flight4);
		flights.listFilling(flight5);
		flights.listFilling(flight6);

		flights.findDestination("Киев");
		System.out.print("\n\n");
		flights.findDay("Четверг");
		System.out.print("\n\n");
		flights.findTime("15:00");
	}
}
