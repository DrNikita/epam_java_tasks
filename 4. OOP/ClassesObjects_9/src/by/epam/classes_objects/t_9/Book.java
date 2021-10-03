package by.epam.classes_objects.t_9;

public class Book {
	private int ID;
	private static int id;
	private int publishYear;
	private String name, author, publish, pages, price, binding;

	public Book(String name, String author, String publish, int publishYear, String pagesNumber, String price,
			String binding) {
		this.ID = id;
		id++;
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.publishYear = publishYear;
		this.pages = pagesNumber;
		this.price = price;
		this.binding = binding;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return ID + ". Title of the book: " + name + ", author: " + author + ", publishing: " + publish
				+ ", published in:" + publishYear + ", number of pages: " + pages + ", price: " + price + ", binding: "
				+ binding + ".";
	}

	public void print() {
		System.out.println(toString());
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Book.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pages == null) ? 0 : pages.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((publish == null) ? 0 : publish.hashCode());
		result = prime * result + publishYear;
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
		Book other = (Book) obj;
		if (ID != other.ID)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages == null) {
			if (other.pages != null)
				return false;
		} else if (!pages.equals(other.pages))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (publish == null) {
			if (other.publish != null)
				return false;
		} else if (!publish.equals(other.publish))
			return false;
		if (publishYear != other.publishYear)
			return false;
		return true;
	}
}
