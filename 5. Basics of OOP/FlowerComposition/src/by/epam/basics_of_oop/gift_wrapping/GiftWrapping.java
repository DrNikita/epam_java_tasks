package by.epam.basics_of_oop.gift_wrapping;

public class GiftWrapping {
	private WrappingType wrappingType;
	private WrappingMaterial material;
	private double price;

	public GiftWrapping(WrappingType type, WrappingMaterial material, double price) {
		this.wrappingType = type;
		this.material = material;
		this.price = price;
	}

	public WrappingType getWrappingType() {
		return wrappingType;
	}

	public void setWrappingType(WrappingType wrappingType) {
		this.wrappingType = wrappingType;
	}

	public WrappingMaterial getMaterial() {
		return material;
	}

	public void setMaterial(WrappingMaterial material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wrappingType == null) ? 0 : wrappingType.hashCode());
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
		GiftWrapping other = (GiftWrapping) obj;
		if (material != other.material)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (wrappingType != other.wrappingType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return wrappingType + " made of " + material + ", packing cost: " + price + " rub.";
	}

}
