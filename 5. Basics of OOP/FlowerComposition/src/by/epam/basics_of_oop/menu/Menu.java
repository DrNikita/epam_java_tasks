package by.epam.basics_of_oop.menu;

// Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции 
// (объект, представляющий собой цветочную композицию). 
// Составляющими цветочной композиции являются цветы и упаковка.

import by.epam.basics_of_oop.flower_composition.FlowerComposition;

public class Menu {
	public static void main(String[] args) {

		FlowerComposition flowerComposition = new FlowerComposition();

		flowerComposition.addFlowerToList("Rose", "Black", 75);
		flowerComposition.addFlowerToList("Rose", "Black", 75);
		flowerComposition.addFlowerToList("Rose", "Black", 75);
		flowerComposition.addFlowerToList("Rose", "Black", 75);
		flowerComposition.addFlowerToList("Chrysanthemum", "Red", 35);
		flowerComposition.addFlowerToList("Chrysanthemum", "Red", 35);
		flowerComposition.addFlowerToList("Chrysanthemum", "Red", 35);
		flowerComposition.addFlowerToList("Chrysanthemum", "Red", 35);
		flowerComposition.addFlowerToList("Chrysanthemum", "Red", 35);
		flowerComposition.addFlowerToList("Gerbera", "Pink", 30);
		flowerComposition.addFlowerToList("Gerbera", "Pink", 30);
		flowerComposition.addFlowerToList("Gerbera", "Pink", 30);

		flowerComposition.wrapUp("Basket", "Wood", 68);

		flowerComposition.addFlowerToList("Gerbera", "Pink", 30);

		flowerComposition.printFlowersList();

		flowerComposition.printWrapping();

		System.out.println("The cost of composition is " + flowerComposition.getCompositionCost() + " rub.");
	}
}
