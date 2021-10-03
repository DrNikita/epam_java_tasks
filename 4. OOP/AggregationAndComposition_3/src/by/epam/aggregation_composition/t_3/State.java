package by.epam.aggregation_composition.t_3;

import java.util.Arrays;

public class State {
	private String name;
	private City capital;
	private int population;
	private double area;
	private Region[] state;
	private int pos;
	private int statesNum;

	public State(String name, City capital) {
		this.name = name;
		this.capital = capital;
		this.pos = 0;
		this.statesNum = 5;
		this.state = new Region[this.statesNum];
	}

	public void addRegion(Region region) {
		if (pos < statesNum) {
			state[pos] = region;
			pos++;
			this.area += region.getArea();
			this.population += region.getPopulation();
		} else {
			Region[] newState = new Region[statesNum * 2];
			for (int i = 0; i < pos; i++) {
				newState[i] = state[i];
			}
			state = newState;
			statesNum = statesNum * 2;
			state[pos] = region;
			pos++;
			this.area += region.getArea();
			this.population += region.getPopulation();
		}
	}

	public void printCapital() {
		System.out.println("Столица: " + capital + ";");
	}

	public void printRegionsNum() {
		System.out.println("Количество областей: " + pos + ";");
	}

	public void printRegionalCenters() {
		System.out.print("Региональные центры: ");
		for (int i = 0; i < pos; i++) {
			System.out.print(state[i].getRegionalCenter().getName() + "; ");
		}
		System.out.println();
	}

	public void printStateArea() {
		System.out.println("Площадь: " + area + " км^2;");
	}

	public void printPopulation() {
		System.out.println("Население: " + population + " чел;");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Region[] getState() {
		return state;
	}

	public void setState(Region[] state) {
		this.state = state;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getStatesNum() {
		return statesNum;
	}

	public void setStatesNum(int statesNum) {
		this.statesNum = statesNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + pos;
		result = prime * result + Arrays.hashCode(state);
		result = prime * result + statesNum;
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
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
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
		if (!Arrays.equals(state, other.state))
			return false;
		if (statesNum != other.statesNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", capital=" + capital + ", population=" + population + ", area=" + area
				+ ", state=" + Arrays.toString(state) + ", pos=" + pos + ", statesNum=" + statesNum + "]";
	}
}
