package by.epam.aggregation_composition.t_2;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: 
// ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Task_2 {
	public static void main(String[] args) {
		Wheel wheel = new Wheel(40, 200, "МТЗ");
		Wheel wheel1 = new Wheel(40, 200, "МТЗ");
		Wheel wheel2 = new Wheel(30, 100, "МТЗ");
		Wheel wheel3 = new Wheel(30, 100, "МТЗ");
		Wheel wheel4 = new Wheel(40, 200, "МТЗ");
		Wheel wheel5 = new Wheel(40, 200, "МТЗ");

		Engine engine = new Engine(350);

		Car car = new Car("МТЗ", 600, 6, 120, 30, 6);

		car.addWheel(wheel);
		car.addWheel(wheel1);
		car.addWheel(wheel2);
		car.addWheel(wheel3);
		car.addWheel(wheel4);
		car.addWheel(wheel5);

		car.printWheelsList();

		Wheel newWheel = new Wheel(30, 100, "Mersedes");

		car.changeTheWheel(newWheel, 3);

		car.printWheelsList();

		car.printFuelLevel();

		car.drive(200);

		car.printFuelLevel();

		car.drive(500);

		car.fillTheCar(90);

		car.drive(700);

		car.printFuelLevel();
	}
}
