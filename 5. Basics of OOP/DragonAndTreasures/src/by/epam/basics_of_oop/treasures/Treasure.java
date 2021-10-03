package by.epam.basics_of_oop.treasures;

public interface Treasure {
	TreasuresType getTreasuresType();

	double getWeight();

	double getFactor();

	double getPrice();

	String getMaterial();
}
