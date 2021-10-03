package by.epam.basics_of_oop.flowers;

public class Rose extends Flower {

	private String name = "Rose";

	public Rose(Colours colour, double price) {
		super(colour, price);
		super.setName(this.name);
	}
}
