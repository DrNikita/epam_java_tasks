package by.epam.basics_of_oop.flowers;

public class Chrysanthemum extends Flower {

	private String name = "Chrysanthemum";

	public Chrysanthemum(Colours colour, double price) {
		super(colour, price);
		super.setName(this.name);
	}
}
