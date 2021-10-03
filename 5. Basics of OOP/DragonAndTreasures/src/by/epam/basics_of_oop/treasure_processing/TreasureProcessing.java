package by.epam.basics_of_oop.treasure_processing;

import by.epam.basics_of_oop.treasures.Treasure;
import by.epam.basics_of_oop.treasures.*;
import java.util.ArrayList;

public class TreasureProcessing {
	private Treasure treasure;
	private ArrayList<Treasure> treasuresList;

	public TreasureProcessing() {
		this.treasuresList = new ArrayList<>();
	}

	public void addTreasureToList(double weight, TreasuresType type, String material) {

		if (material.equalsIgnoreCase("diamond")) {

			this.treasure = new DiamondTreasures(weight, type);
			this.treasuresList.add(this.treasure);

		} else if (material.equalsIgnoreCase("gold")) {

			this.treasure = new GoldTreasures(weight, type);
			this.treasuresList.add(this.treasure);

		} else if (material.equalsIgnoreCase("silver")) {

			this.treasure = new SilverTreasures(weight, type);
			this.treasuresList.add(this.treasure);
		}
	}

	public void printTreasuresList() {
		for (int i = 0; i < this.treasuresList.size(); i++) {
			System.out.println(treasuresList.get(i).getMaterial() + " treasures " + "; weight: "
					+ treasuresList.get(i).getWeight() + "kg; storage type: " + treasuresList.get(i).getTreasuresType()
					+ "; price: " + treasuresList.get(i).getPrice() + "$$.");
		}
	}

	public void printTreasure(Treasure treasure) {

		if (treasure == null) {
			System.out.println("No treasures found for the specified amount.");

		} else {
			System.out.println(treasure.getMaterial() + " treasure; storage type: " + treasure.getTreasuresType()
					+ "; weight: " + treasure.getWeight() + "kg; full cost: " + treasure.getPrice() + "$$.");
		}
	}

	public Treasure getMostValuableTreasure() {

		double highestCost = treasuresList.get(0).getPrice();
		Treasure mostValuableTreasure = null;

		for (int i = 1; i < treasuresList.size(); i++) {

			if (highestCost < treasuresList.get(i).getPrice()) {
				mostValuableTreasure = treasuresList.get(i);
			}
		}
		return mostValuableTreasure;
	}

	public Treasure costSelection(double price) {

		Treasure treasure = null;

		for (int i = 1; i < treasuresList.size(); i++) {

			if (price == treasuresList.get(i).getPrice()) {
				treasure = treasuresList.get(i);
			}
		}
		return treasure;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public ArrayList<Treasure> getTreasuresList() {
		return treasuresList;
	}

	public void setTreasuresList(ArrayList<Treasure> treasuresList) {
		this.treasuresList = treasuresList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasure == null) ? 0 : treasure.hashCode());
		result = prime * result + ((treasuresList == null) ? 0 : treasuresList.hashCode());
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
		TreasureProcessing other = (TreasureProcessing) obj;
		if (treasure == null) {
			if (other.treasure != null)
				return false;
		} else if (!treasure.equals(other.treasure))
			return false;
		if (treasuresList == null) {
			if (other.treasuresList != null)
				return false;
		} else if (!treasuresList.equals(other.treasuresList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TreasureProcessing [treasure=" + treasure + ", treasuresList=" + treasuresList + "]";
	}

}