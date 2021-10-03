package by.epam.final_tasks.user;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import by.epam.final_tasks.email.*;

public class User {
	private String name;
	private int id;
	private static int userId;
	private Email userrEmail;
	private String emailAdress;
	private String password;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	public void createAnAccount(String email, String password) throws FileNotFoundException {
		this.emailAdress = email;
		this.userrEmail = new Email(emailAdress);
		this.password = password;
		this.id = userId;
		userId += 1;
		ListOfUsers addUser = new ListOfUsers(this);
		System.out.print("Аккаунт создан.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getUserId() {
		return userId;
	}

	public static void setUserId(int userId) {
		User.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Email getUserrEmail() {
		return userrEmail;
	}

	public void setUserrEmail(Email userrEmail) {
		this.userrEmail = userrEmail;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAdress == null) ? 0 : emailAdress.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userrEmail == null) ? 0 : userrEmail.hashCode());
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
		User other = (User) obj;
		if (emailAdress == null) {
			if (other.emailAdress != null)
				return false;
		} else if (!emailAdress.equals(other.emailAdress))
			return false;
		if (id != other.id)
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
		if (userrEmail == null) {
			if (other.userrEmail != null)
				return false;
		} else if (!userrEmail.equals(other.userrEmail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", userrEmail=" + userrEmail + ", emailAdress=" + emailAdress
				+ ", password=" + password + "]";
	}
}
