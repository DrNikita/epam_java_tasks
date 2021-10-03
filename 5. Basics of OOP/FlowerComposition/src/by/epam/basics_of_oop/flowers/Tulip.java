package by.epam.basics_of_oop.flowers;

public class Tulip extends Flower {

	private String name = "Tulip";

	public Tulip(Colours colour, double price) {
		super(colour, price);
		super.setName(this.name);
	}
}
