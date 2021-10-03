package by.epam.multithreading_port.test;

// Попробуйте решить данную задачу хотя бы на 50%.
// Задание 4. Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров. 
// Число контейнеров, находящихся в текущий момент в порту и на корабле, должно быть неотрицательным 
// и превышающим заданную грузоподъемность судна и вместимость порта. В порту работает несколько причалов. 
// У одного причала может стоять один корабль. Корабль может загружаться у причала или разгружаться.

import by.epam.multithreading_port.port.*;
import by.epam.multithreading_port.ships.CargoShip1;

public class Test {
	public static void main(String[] args) {

		CargoShip1 cargoShip1 = new CargoShip1("Hyundai", 250, 100, 12000, 10000, 1000);
		CargoShip1 cargoShip2 = new CargoShip1("STASCo", 300, 200, 15000, 20000, 15000);
		CargoShip1 cargoShip3 = new CargoShip1("Samsung Heavy Industries", 300, 185, 10000, 15000, 3000);
		CargoShip1 cargoShip4 = new CargoShip1("Моза", 290, 120, 15000, 14000, 9000);
		CargoShip1 cargoShip5 = new CargoShip1("Mekaines", 310, 210, 17000, 22000, 10000);

		Berth1 berth1 = new Berth1(cargoShip1, "load");
		Berth2 berth2 = new Berth2(cargoShip2, "unload");
		Berth3 berth3 = new Berth3(cargoShip3, "unload");
		Berth4 berth4 = new Berth4(cargoShip4, "load");
		Berth5 berth5 = new Berth5(cargoShip5, "unload");

		berth1.run();
		berth2.run();
		berth3.run();
		berth4.run();
		berth5.run();
	}
}
