package by.epam.classes_objects.t_5;

public class Counter {
	private int startValue;
	private int upperRange;
	private int lowerRange;

	public Counter() {
		this(0, 10, -10);
	}

	public Counter(int start, int minRange, int maxRange) {
		this.startValue = start;
		this.lowerRange = minRange;
		this.upperRange = maxRange;
	}

	public int plus() {
		this.startValue += 1;

		if (startValue > upperRange) {
			this.startValue -= 1;
		}
		return this.startValue;
	}

	public int minus() {
		this.startValue -= 1;

		if (this.startValue < this.lowerRange) {
			this.startValue += 1;
		}
		return this.startValue;
	}

	public int presentVal() {
		return this.startValue;
	}

	public int getStartValue() {
		return startValue;
	}

	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public int getUpperRange() {
		return upperRange;
	}

	public void setUpperRange(int upperRange) {
		this.upperRange = upperRange;
	}

	public int getLowerRange() {
		return lowerRange;
	}

	public void setLowerRange(int lowerRange) {
		this.lowerRange = lowerRange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lowerRange;
		result = prime * result + startValue;
		result = prime * result + upperRange;
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
		Counter other = (Counter) obj;
		if (lowerRange != other.lowerRange)
			return false;
		if (startValue != other.startValue)
			return false;
		if (upperRange != other.upperRange)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [startValue=" + startValue + ", upperRange=" + upperRange + ", lowerRange=" + lowerRange + "]";
	}
}
