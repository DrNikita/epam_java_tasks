package by.epam.classes_objects.t_2;

public class Test2 {
	private String firstName;
	private String secondName;

	public Test2() {
		this.firstName = "ZXC";
		this.secondName = "QWE";
	}

	public Test2(String fN, String sN) {
		this.firstName = fN;
		this.secondName = sN;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setSecondName(String name) {
		this.secondName = name;
	}

	public String getSecondName() {
		return this.secondName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
		Test2 other = (Test2) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test2 [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
}
