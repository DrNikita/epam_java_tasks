package by.epam.basics_of_oop.task_2;

// Создать класс Payment с внутренним классом, 
// с помощью объектов которого можно сформировать покупку из нескольких товаров.

public class Task_2 {
	public static void main(String[] args) {

		Payment productsList = new Payment();

		productsList.addProductToList("Milk", 2.60, 2);
		productsList.addProductToList("Bag", 0.05, 2);
		productsList.addProductToList("Bread", 1.50, 2);
		productsList.addProductToList("Coca Cola", 3.50, 1);
		productsList.addProductToList("Tea", 4.20, 3);
		productsList.addProductToList("Meat", 3.80, 1);
		productsList.addProductToList("Packet of biscuits", 3.00, 3);
		productsList.showList();

		System.out.println("Total purchases: " + productsList.getTotalAmount() + "р.");
	}
}
