package by.epam.aggregation_composition.t_3;

import java.util.Arrays;

public class District {
	private String name;
	private int population;
	private double area;
	private City[] district;
	private int pos;
	private int citiesNum;

	public District(String name, int population, double area) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.pos = 0;
		this.citiesNum = 5;
		this.district = new City[this.citiesNum];
	}

	public void addCity(City city) {
		if (pos < citiesNum) {
			district[pos] = city;
			pos++;

		} else {
			City[] newDistrict = new City[citiesNum * 2];

			for (int i = 0; i < pos; i++) {
				newDistrict[i] = district[i];
			}
			district = newDistrict;
			citiesNum = citiesNum * 2;
			district[pos] = city;
			pos++;
		}
	}

	public void print() {
		for (int i = 0; i < pos; i++) {
			System.out.println(district[i].toString());
		}
	}

	@Override
	public String toString() {
		return "District name=" + name + ", population=" + population + ", area=" + area + ".";
	}

	public int getPopulation() {
		return population;
	}

	public double getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City[] getDistrict() {
		return district;
	}

	public void setDistrict(City[] district) {
		this.district = district;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getCitiesNum() {
		return citiesNum;
	}

	public void setCitiesNum(int citiesNum) {
		this.citiesNum = citiesNum;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + citiesNum;
		result = prime * result + Arrays.hashCode(district);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + pos;
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
		District other = (District) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (citiesNum != other.citiesNum)
			return false;
		if (!Arrays.equals(district, other.district))
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
		return true;
	}
}
