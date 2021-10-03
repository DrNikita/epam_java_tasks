package by.epam.basics_of_oop.gift_wrapping;

public enum WrappingMaterial {

	Clay("Clay"), Straw("Straw"), Paper("Paper"), Wood("Wood");

	private String material;

	WrappingMaterial(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
