package by.epam.aggregation_composition.t_1;

public class Text {
	private String header;
	private String text = "";

	public Text(Word word) {
		this.header = word.getWord();
	}

	public Text(Sntence header) {
		this.header = header.getSentence();
	}

	public void addTextSentence(Sntence sentence) {
		text += sentence.getSentence() + ".";
	}

	public void addTextWord(Word word) {
		text += " " + word.getWord();
	}

	public String getHeader() {
		return header;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void print() {
		System.out.print(this.header + "\n" + this.text);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [header=" + header + ", text=" + text + "]";
	}
}
