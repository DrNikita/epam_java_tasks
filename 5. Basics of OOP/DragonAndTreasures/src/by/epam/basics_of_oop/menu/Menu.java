package by.epam.basics_of_oop.menu;

// Дракон и его сокровища. Создать программу, 
// позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища 
// и выбора сокровищ на заданную сумму.

import by.epam.basics_of_oop.treasure_processing.*;
import by.epam.basics_of_oop.treasures.TreasuresType;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		TreasureProcessing treasure = new TreasureProcessing();

		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		treasure.addTreasureToList(500, TreasuresType.Coins, "gold");
		treasure.addTreasureToList(80, TreasuresType.Decorations, "diamond");
		treasure.addTreasureToList(10000, TreasuresType.Ingots, "silver");
		treasure.addTreasureToList(4000, TreasuresType.Coins, "silver");
		treasure.addTreasureToList(500, TreasuresType.Decorations, "gold");
		treasure.addTreasureToList(8, TreasuresType.Shards, "diamond");
		treasure.addTreasureToList(1500, TreasuresType.Ingots, "gold");

		while (flag) {

			System.out.print("\n1. Treasures list. \n" + "2. Finding the most expensive treasure. \n"
					+ "3. To find the treasure in a given amount. \n" + "0. Close.\nEnter the operation number: ");

			int option = s.nextInt();

			switch (option) {

			case (1):
				System.out.println("\nList of all treasures: ");
				treasure.printTreasuresList();
				break;

			case (2):
				System.out.println("\nMost valuable treasure: ");
				treasure.printTreasure(treasure.getMostValuableTreasure());
				break;

			case (3):
				System.out.println("\nEnter the value of the treasure: ");
				double price = sc.nextDouble();
				System.out.println("\nTreasure worth " + price + ": ");
				treasure.printTreasure(treasure.costSelection(price));
				break;

			case (0):
				flag = false;
				break;

			default:
				System.out.println("\nEnter enother option.");
				break;
			}
		}

	}
}
