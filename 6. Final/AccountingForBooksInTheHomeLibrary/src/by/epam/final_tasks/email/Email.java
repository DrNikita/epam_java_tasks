package by.epam.final_tasks.email;

import java.util.ArrayList;

public class Email {
	private String adress;
	private ArrayList<String> mail;

	public Email(String adress) {

		this.adress = adress;
		mail = new ArrayList<String>();
		Network network = new Network(this);
	}

	public ArrayList<String> getMail() {
		return mail;
	}

	public void setMail(ArrayList<String> mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void sendMail(String mail) {
		this.mail.add(mail);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
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
		Email other = (Email) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email [adress=" + adress + ", mail=" + mail + "]";
	}
}
