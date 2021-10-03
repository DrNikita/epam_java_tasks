package by.epam.basics_of_oop.flowers;

public enum Colours {
	Green("Green"), Blue("Blue"), Pink("Pink"), Brown("Brown"), Рurple("Рurple"), Black("Black"), Orange("Orange"),
	White("White"), Red("Red"), Yellow("Yellow");

	String colour;

	Colours(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
