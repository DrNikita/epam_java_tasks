package by.epam.basics_of_oop.treasures;

public class GoldTreasures implements Treasure {

	private TreasuresType treasuresType;
	private double weight;
	private double factor;
	private String material = "Gold";

	public GoldTreasures(double weight, TreasuresType treasuresType) {
		this.factor = 25000;
		this.weight = weight;
		this.treasuresType = treasuresType;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public double getFactor() {
		return this.factor;
	}

	@Override
	public TreasuresType getTreasuresType() {
		return this.treasuresType;
	}

	@Override
	public double getPrice() {
		return this.weight * this.factor;
	}

	@Override
	public String getMaterial() {
		return this.material;
	}

	public void setTreasuresType(TreasuresType treasuresType) {
		this.treasuresType = treasuresType;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(factor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((treasuresType == null) ? 0 : treasuresType.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		GoldTreasures other = (GoldTreasures) obj;
		if (Double.doubleToLongBits(factor) != Double.doubleToLongBits(other.factor))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (treasuresType != other.treasuresType)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GoldTreasures [treasuresType=" + treasuresType + ", weight=" + weight + ", factor=" + factor
				+ ", material=" + material + "]";
	}
}
