package by.epam.basics_of_oop.flowers;

public class Gerbera extends Flower {

	private String name = "Gerbera";

	public Gerbera(Colours colour, double price) {
		super(colour, price);
		super.setName(this.name);
	}
}
