package by.epam.aggregation_composition.t_2;

import java.util.Arrays;

public class Car {
	private Engine engine;
	private Wheel[] wheels;
	private int numberOfWheels;
	private int wheelPosition;
	private String model;
	private int capacity;
	private int fuelLevel;
	private int consumption;

	public Car(String model, int power, int numberOfWheels, int capacity, int fuelLevel, int consumption) {
		this.engine = new Engine(power);
		this.numberOfWheels = numberOfWheels;
		this.wheels = new Wheel[this.numberOfWheels];
		this.wheelPosition = 0;
		this.model = model;
		this.capacity = capacity;
		this.fuelLevel = fuelLevel;
		this.consumption = consumption;
	}

	public void addWheel(Wheel wheel) {

		if (wheelPosition < numberOfWheels) {
			wheels[wheelPosition] = wheel;
			wheelPosition++;
		} else {
			Wheel[] newWheels = new Wheel[numberOfWheels * 2];

			for (int i = 0; i < wheelPosition; i++) {
				newWheels[i] = wheels[i];
			}
			wheels = newWheels;
			numberOfWheels = numberOfWheels * 2;
			wheels[wheelPosition] = wheel;
			wheelPosition++;
		}
	}

	public void changeTheWheel(Wheel wheel, int wheelPosition) {
		wheel.setPos(this.wheels[wheelPosition].getPos());
		this.wheels[wheelPosition] = wheel;
	}

	public void printWheelsList() {
		for (int i = 0; i < wheelPosition; i++) {
			System.out.println(wheels[i].toString());
		}
	}

	public void drive(int distance) {
		double fuelNeeds = (distance / 100) * consumption;

		if (fuelNeeds > fuelLevel) {
			System.out.println("Недостаточно топлива для преодаления заданного расстояния.");
			double canDrive = fuelLevel * consumption;
			System.out.println("Машина может проехать " + canDrive + " км.");
		} else {
			System.out.println("Машина проехала " + distance + " км.");
			this.fuelLevel = this.fuelLevel - distance * this.consumption / 100;
		}
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void fillTheCar(int fuelQuantity) {
		if (fuelLevel + fuelQuantity > capacity) {
			System.out.println("Слишком много топлива. Для заправки полного бака трубуется " + (capacity - fuelLevel)
					+ " литров.");
		} else {
			fuelLevel += fuelQuantity;
			System.out.println("В машину было заправлено " + fuelQuantity + " литров.");
		}
	}

	public void printCarModel() {
		System.out.println("Марка автомобиля: " + model);
	}

	public void printFuelLevel() {
		System.out.println("Уровень топлива: " + this.getFuelLevel() + " л");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getWheelPosition() {
		return wheelPosition;
	}

	public void setWheelPosition(int wheelPosition) {
		this.wheelPosition = wheelPosition;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + consumption;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuelLevel;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberOfWheels;
		result = prime * result + wheelPosition;
		result = prime * result + Arrays.hashCode(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (capacity != other.capacity)
			return false;
		if (consumption != other.consumption)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuelLevel != other.fuelLevel)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numberOfWheels != other.numberOfWheels)
			return false;
		if (wheelPosition != other.wheelPosition)
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + Arrays.toString(wheels) + ", numberOfWheels=" + numberOfWheels
				+ ", wheelPosition=" + wheelPosition + ", model=" + model + ", capacity=" + capacity + ", fuelLevel="
				+ fuelLevel + ", consumption=" + consumption + "]";
	}
}
