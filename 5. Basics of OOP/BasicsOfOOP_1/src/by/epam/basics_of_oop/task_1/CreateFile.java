package by.epam.basics_of_oop.task_1;

public class CreateFile extends File {
	private String type;
	private String directory;
	private String name;
	private String content;

	public CreateFile(String type, String directory, String name) {
		super(type, directory, name);
		this.type = super.getType();
		this.directory = super.getDirectory() + super.getName();
		this.name = super.getName();
		this.content = "";
	}

	public void addContent(String text) {
		this.content += text;
	}

	public void printContent() {
		System.out.println("Content in the file \"" + name + "\" is: " + this.content);
	}

	public void clearContent() {
		this.content = "";
	}

	public void rename(String newName) {
		this.name = newName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateFile other = (CreateFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " - type: " + type + ", directory: " + directory;
	}
}
