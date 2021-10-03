package by.epam.aggregation_composition.t_3;

import java.util.Arrays;

public class Region {
	private String name;
	private City regionalCenter;
	private double area;
	private int population;
	private District[] region;
	private int pos;
	private int districtsNum;

	public Region(String name, City regionalCenter) {
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.pos = 0;
		this.districtsNum = 5;
		this.region = new District[this.districtsNum];
	}

	public void addDistrict(District district) {
		if (pos < districtsNum) {
			region[pos] = district;
			pos++;
			this.area += district.getArea();
			this.population += district.getPopulation();

		} else {
			District[] newRegion = new District[districtsNum * 2];

			for (int i = 0; i < pos; i++) {
				newRegion[i] = region[i];
			}
			region = newRegion;
			districtsNum = districtsNum * 2;
			region[pos] = district;
			pos++;
			this.area += district.getArea();
			this.population += district.getPopulation();
		}
	}

	public void print() {
		for (int i = 0; i < pos; i++) {
			System.out.println(region[i].toString());
		}
	}

	public City getRegionalCenter() {
		return regionalCenter;
	}

	public double getArea() {
		return area;
	}

	public int getPopulation() {
		return population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District[] getRegion() {
		return region;
	}

	public void setRegion(District[] region) {
		this.region = region;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getDistrictsNum() {
		return districtsNum;
	}

	public void setDistrictsNum(int districtsNum) {
		this.districtsNum = districtsNum;
	}

	public void setRegionalCenter(City regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + districtsNum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + pos;
		result = prime * result + Arrays.hashCode(region);
		result = prime * result + ((regionalCenter == null) ? 0 : regionalCenter.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (districtsNum != other.districtsNum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (pos != other.pos)
			return false;
		if (!Arrays.equals(region, other.region))
			return false;
		if (regionalCenter == null) {
			if (other.regionalCenter != null)
				return false;
		} else if (!regionalCenter.equals(other.regionalCenter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region" + name + ", regionalCenter=" + regionalCenter + ", area=" + area + ", population=" + population
				+ ".";
	}
}
