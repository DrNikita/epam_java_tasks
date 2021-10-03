package by.epam.basics_of_oop.flowers;

public class Daisy extends Flower {

	private String name = "Daisy";

	public Daisy(Colours colour, double price) {
		super(colour, price);
		super.setName(this.name);
	}
}
