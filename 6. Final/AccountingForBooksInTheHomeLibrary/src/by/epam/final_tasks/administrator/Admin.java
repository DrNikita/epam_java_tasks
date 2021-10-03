package by.epam.final_tasks.administrator;

import by.epam.final_tasks.email.Email;

public class Admin {
	private String password;
	private String name;
	private String emailAdress;
	private Email adminsEmail;

	public Admin() {
	}

	public Admin(String password, String name, String emailAdress) {
		this.password = password;
		this.name = name;
		this.emailAdress = emailAdress;
		this.adminsEmail = new Email(this.emailAdress);
		ListOfAdmins listOfAdmins = new ListOfAdmins(this);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public Email getAdminsEmail() {
		return adminsEmail;
	}

	public void setAdminsEmail(Email adminsEmail) {
		this.adminsEmail = adminsEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminsEmail == null) ? 0 : adminsEmail.hashCode());
		result = prime * result + ((emailAdress == null) ? 0 : emailAdress.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Admin other = (Admin) obj;
		if (adminsEmail == null) {
			if (other.adminsEmail != null)
				return false;
		} else if (!adminsEmail.equals(other.adminsEmail))
			return false;
		if (emailAdress == null) {
			if (other.emailAdress != null)
				return false;
		} else if (!emailAdress.equals(other.emailAdress))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [password=" + password + ", name=" + name + ", emailAdress=" + emailAdress + ", adminsEmail="
				+ adminsEmail + "]";
	}
}
