package by.epam.classes_objects.t_3;

import java.util.Arrays;

public class Student {
	private String fullName;
	private String group;
	private boolean isBest;
	private int[] studentPefomance;

	public Student(String fullName, String group, int[] studentPerfomance) {
		this.fullName = fullName;
		this.group = group;
		this.studentPefomance = studentPerfomance;
		this.isBest = bestPerfomance(this.studentPefomance);
	}

	public int[] getPerfomance() {
		return this.studentPefomance;
	}

	public String getName() {
		return this.fullName;
	}

	public String getGroup() {
		return this.group;
	}

	public boolean getIsBest() {
		return this.isBest;
	}

	private boolean bestPerfomance(int[] studentPerfomance) {
		boolean isBest = false;
		int count = 0;

		for (int i = 0; i < studentPerfomance.length; i++) {
			if (studentPerfomance[i] >= 9) {
				count++;
			}
		}
		if (count == 5) {
			isBest = true;
		}
		return isBest;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int[] getStudentPefomance() {
		return studentPefomance;
	}

	public void setStudentPefomance(int[] studentPefomance) {
		this.studentPefomance = studentPefomance;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setBest(boolean isBest) {
		this.isBest = isBest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + (isBest ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(studentPefomance);
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
		Student other = (Student) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (isBest != other.isBest)
			return false;
		if (!Arrays.equals(studentPefomance, other.studentPefomance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", group=" + group + ", isBest=" + isBest + ", studentPefomance="
				+ Arrays.toString(studentPefomance) + "]";
	}
}
