package by.epam.multithreading_port.ships;

public class ProgenitorShip {
	private String manufacturer;
	private double length;
	private double width;
	private double weight;
	private int liftingCapacity;
	private int amountOfCargo;

	public ProgenitorShip(String manufacturer, double length, double width, double weight, int liftingCapacity,
			int amountOfCargo) {

		if (liftingCapacity > amountOfCargo) {
			this.manufacturer = manufacturer;
			this.length = length;
			this.width = width;
			this.weight = weight;
			this.liftingCapacity = liftingCapacity;
			this.amountOfCargo = amountOfCargo;
		} else {
			this.manufacturer = null;
		}
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLiftingCapacity() {
		return liftingCapacity;
	}

	public void setLiftingCapacity(int liftingCapacity) {
		this.liftingCapacity = liftingCapacity;
	}

	public int getAmountOfCargo() {
		return amountOfCargo;
	}

	public void setAmountOfCargo(int amountOfCargo) {
		this.amountOfCargo = amountOfCargo;
	}

	public void addCargo(int amountOfCargo) {
		this.amountOfCargo += amountOfCargo;
	}

	@Override
	public String toString() {
		return manufacturer + "\nLength: " + length + " meters\nWidth: " + width + " meters\nWeight: " + weight
				+ " tons\nLifting capacity: " + liftingCapacity + " containers\nAmount of cargo: " + amountOfCargo;
	}
}
