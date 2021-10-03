package by.epam.basics_of_oop.task_1;

public class Directory {
	private String directory;

	public Directory(String directory) {
		this.directory = directory;
	}

	public Directory() {
		this.directory = "C:/Users/nikit"; // +file name||
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
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
		Directory other = (Directory) obj;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [directory=" + directory + "]";
	}
}
