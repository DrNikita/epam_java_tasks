package by.epam.aggregation_composition.t_2;

public class Wheel {

	private int pos;
	private static int id;
	private int width;
	private int diameter;
	private String manufacturer;

	public Wheel(int width, int diameter, String manufacturer) {
		pos = id++;
		this.width = width;
		this.diameter = diameter;
		this.manufacturer = manufacturer;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Wheel.id = id;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Wheel " + pos + ": width=" + width + ", diameter=" + diameter + ", manufacturer=" + manufacturer + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + pos;
		result = prime * result + width;
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (pos != other.pos)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}
