package by.epam.basics_of_oop.dragon_treasure;

import by.epam.basics_of_oop.treasures.GoldTreasures;

// Дракон и его сокровища. Создать программу, 
// позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
// Реализовать возможность просмотра сокровищ, 
// выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.

public class Print {
	public static void main(String[] args) {

		GoldTreasures goldTeasures = new GoldTreasures(1000, "Gold");
		System.out.print(goldTeasures.getMaterial());
	}
}
