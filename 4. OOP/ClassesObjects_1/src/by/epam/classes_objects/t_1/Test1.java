package by.epam.classes_objects.t_1;

public class Test1 {
	private int firstVar;
	private int secondVar;

	public static int sum(int x1, int x2) {
		return x1 + x2;
	}

	public static String compare(int x1, int x2) {
		String biggestRes = new String();

		if (x1 > x2) {
			biggestRes = String.valueOf(x1);

		} else if (x1 < x2) {
			biggestRes = String.valueOf(x2);

		} else {
			biggestRes = "Variables are equal.";
		}
		return biggestRes;
	}

	public int getFirstVar() {
		return firstVar;
	}

	public void setFirstVar(int firstVar) {
		this.firstVar = firstVar;
	}

	public int getSecondVar() {
		return secondVar;
	}

	public void setSecondVar(int secondVar) {
		this.secondVar = secondVar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstVar;
		result = prime * result + secondVar;
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
		Test1 other = (Test1) obj;
		if (firstVar != other.firstVar)
			return false;
		if (secondVar != other.secondVar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [firstVar=" + firstVar + ", secondVar=" + secondVar + "]";
	}
}
