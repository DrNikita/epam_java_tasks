package by.epam.multithreading_port.port;

import by.epam.multithreading_port.ships.ProgenitorShip;

public class StartBerth {
	private static int capacity = 150000;
	private static int numberOfContainers = 100000;
	private ProgenitorShip ship;
	private String function;

	public StartBerth(ProgenitorShip ship, String function) {

		this.ship = ship;
		this.function = function;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfContainers() {
		return numberOfContainers;
	}

	public void setNumberOfContainers(int numberOfContainers) {
		this.numberOfContainers = numberOfContainers;
	}

	public ProgenitorShip getShip() {
		return ship;
	}

	public void setShip(ProgenitorShip ship) {
		this.ship = ship;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public void addContainers(int numberOfContainers) {
		this.numberOfContainers += numberOfContainers;
	}

	public void loadShip() {
		if (this.ship.getManufacturer() == null) {

			System.out.println("The ship was overloaded");
		} else {
			int loadingShip = (int) (this.ship.getLiftingCapacity() - this.ship.getAmountOfCargo());
			if (loadingShip > this.getNumberOfContainers()) {
				System.out.println("There are not enough containers in the port");
			} else {
				this.ship.addCargo(loadingShip);
				this.setNumberOfContainers(this.getNumberOfContainers() - loadingShip);
			}
		}
	}

	public void unloadTheShip() {
		if (this.ship.getManufacturer() == null) {

			System.out.println("The ship was overloaded");
		} else {

			int unloadingShip = 0 - this.getShip().getAmountOfCargo();
			if (this.getNumberOfContainers() - unloadingShip > this.getCapacity()) {
				System.out.println("There are not enough capacity in the port");
			} else {
				this.ship.addCargo(unloadingShip);
				this.addContainers(unloadingShip * (-1));
			}
		}
	}
}
