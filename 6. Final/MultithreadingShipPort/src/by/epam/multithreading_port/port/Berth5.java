package by.epam.multithreading_port.port;

import by.epam.multithreading_port.ships.ProgenitorShip;

public class Berth5 extends StartBerth implements Runnable {
	private static boolean isEmpty = true;

	public Berth5(ProgenitorShip ship, String function) {
		super(ship, function);
		
		if (this.isEmpty == true) {
			this.isEmpty = false;
		} else {
			System.out.println("The 5th berth is busy");
		}
	}

	@Override
	public void run() {
		if (this.getFunction().equals("load")) {
			this.loadShip();
		} else if (this.getFunction().equals("unload")) {
			this.unloadTheShip();
		}
		System.out.println(this.getShip().getAmountOfCargo() + ", " + this.getNumberOfContainers());
		this.setEmpty(true);
	}

	public static boolean isEmpty() {
		return isEmpty;
	}

	public static void setEmpty(boolean isEmpty) {
		Berth5.isEmpty = isEmpty;
	}
}
