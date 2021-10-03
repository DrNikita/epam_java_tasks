package by.epam.basics_of_oop.gift_wrapping;

public enum WrappingType {
	Box("Box"), Wrapper("Wrapper"), Tape("Tape"), Basket("Basket"), Vase("Vase"), Pot("Pot");

	private String type;

	WrappingType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
