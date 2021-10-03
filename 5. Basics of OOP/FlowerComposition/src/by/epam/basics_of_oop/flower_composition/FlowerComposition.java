package by.epam.basics_of_oop.flower_composition;

import by.epam.basics_of_oop.flowers.*;
import by.epam.basics_of_oop.gift_wrapping.*;
import java.util.ArrayList;

public class FlowerComposition {

	private ArrayList<Flower> flowersList = new ArrayList<Flower>();
	GiftWrapping giftWrapping;
	private boolean isFlowerCompositionComplite = false;

	public void addFlowerToList(String name, String colour, double price) {

		Colours flowerColour = Colours.Black;
		int flag = 0;

		for (int i = 0; i < flowerColour.values().length; i++) {

			if (colour.contains(flowerColour.values()[i].getColour())) {

				flowerColour = Colours.valueOf(Colours.class, colour);
				flag += 1;
			}
		}
		if (flag == 0) {
			System.out.print("You cannot use this colour.");
		} else {
			flag = 0;
		}

		if (!this.isFlowerCompositionComplite) {

			if (name.equalsIgnoreCase("Rose") || name.equalsIgnoreCase("Роза")) {
				this.flowersList.add(new Rose(flowerColour, price));

			} else if (name.equalsIgnoreCase("Gerbera") || name.equalsIgnoreCase("Гербера")) {
				this.flowersList.add(new Gerbera(flowerColour, price));

			} else if (name.equalsIgnoreCase("Daisy") || name.equalsIgnoreCase("Маргаритка")) {
				this.flowersList.add(new Daisy(flowerColour, price));

			} else if (name.equalsIgnoreCase("Tulip") || name.equalsIgnoreCase("Тюльпан")) {
				this.flowersList.add(new Tulip(flowerColour, price));

			} else if (name.equalsIgnoreCase("Chrysanthemum") || name.equalsIgnoreCase("Хризантема")) {
				this.flowersList.add(new Chrysanthemum(flowerColour, price));

			} else {
				System.out.println("There is no flower with that name in the application.");
			}

		} else {
			System.out.println("The flower composition is complete. You can't add flowers any more. "
					+ "Create a new flower composition.");
		}
	}

	public void printFlowersList() {
		System.out.println("Flower list:");
		for (int i = 0; i < this.flowersList.size(); i++) {
			System.out.println(
					"   " + this.flowersList.get(i).getColour() + " " + this.flowersList.get(i).getName() + ".");
		}
	}

	public void wrapUp(String wrappingType, String wrappingMaterial, double price) {

		WrappingType type = WrappingType.Basket;
		WrappingMaterial material = WrappingMaterial.Straw;
		int flag = 0;

		for (int i = 0; i < type.values().length; i++) {

			if (wrappingType.contains(type.values()[i].getType())) {

				type = WrappingType.valueOf(WrappingType.class, wrappingType);
				flag += 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("It is impossible to create a package of this type.");
		} else {
			flag = 0;
		}

		for (int i = 0; i < WrappingMaterial.values().length; i++) {

			if (wrappingMaterial.contains(material.values()[i].getMaterial())) {

				material = WrappingMaterial.valueOf(WrappingMaterial.class, wrappingMaterial);
				flag += 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("It is impossible to create a package of this material.");
		} else {
			flag = 0;
		}

		this.giftWrapping = new GiftWrapping(type, material, price);
		this.isFlowerCompositionComplite = true;
	}

	public void printWrapping() {
		System.out.println("Packing description: " + this.giftWrapping.toString());
	}

	public double getCompositionCost() {

		double compositionCost = 0;

		for (int i = 0; i < this.flowersList.size(); i++) {
			compositionCost += this.flowersList.get(i).getPrice();
		}
		return compositionCost + this.giftWrapping.getPrice();
	}

	public ArrayList<Flower> getFlowersList() {
		return flowersList;
	}

	public void setFlowersList(ArrayList<Flower> flowersList) {
		this.flowersList = flowersList;
	}

	public GiftWrapping getGiftWrapping() {
		return giftWrapping;
	}

	public void setGiftWrapping(GiftWrapping giftWrapping) {
		this.giftWrapping = giftWrapping;
	}

	public boolean isFlowerCompositionComplite() {
		return isFlowerCompositionComplite;
	}

	public void setFlowerCompositionComplite(boolean isFlowerCompositionComplite) {
		this.isFlowerCompositionComplite = isFlowerCompositionComplite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowersList == null) ? 0 : flowersList.hashCode());
		result = prime * result + ((giftWrapping == null) ? 0 : giftWrapping.hashCode());
		result = prime * result + (isFlowerCompositionComplite ? 1231 : 1237);
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
		FlowerComposition other = (FlowerComposition) obj;
		if (flowersList == null) {
			if (other.flowersList != null)
				return false;
		} else if (!flowersList.equals(other.flowersList))
			return false;
		if (giftWrapping == null) {
			if (other.giftWrapping != null)
				return false;
		} else if (!giftWrapping.equals(other.giftWrapping))
			return false;
		if (isFlowerCompositionComplite != other.isFlowerCompositionComplite)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlowerComposition [flowersList=" + flowersList + ", giftWrapping=" + giftWrapping
				+ ", isFlowerCompositionComplite=" + isFlowerCompositionComplite + "]";
	}

}
