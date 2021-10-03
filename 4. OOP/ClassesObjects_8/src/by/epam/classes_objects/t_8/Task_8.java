package by.epam.classes_objects.t_8;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
// set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, 
// с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Task_8 {
	public static void main(String[] args) {
		CustomersList cust = new CustomersList();
		Customer customer = new Customer("Егор", "Dr", "Николаевич", "Минск", "96", "42552003");
		Customer customer1 = new Customer("Василий", "Mc", "Егорович", "Москва", "401", "42554018");
		Customer customer2 = new Customer("Никита", "Mr", "Василиевич", "Дукора", "404", "42551816");
		Customer customer3 = new Customer("Антон", "Mr", "Никитович", "Витебск", "118", "42558901");
		Customer customer4 = new Customer("Сергей", "Mr", "Антонович", "Брест", "103", "42551214");

		cust.listFilling(customer);
		cust.listFilling(customer1);
		cust.listFilling(customer2);
		cust.listFilling(customer3);
		cust.listFilling(customer4);

		cust.sortByName();
		cust.print();
		System.out.print("\n\n");
		cust.checkCardNum("100", "200");
	}
}
