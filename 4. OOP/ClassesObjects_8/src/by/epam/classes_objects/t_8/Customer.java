package by.epam.classes_objects.t_8;

import java.util.*;

public class Customer {

	private int ID;
	private static int id;
	private String firstName, secondName, patronymic, adress, creditCardNumber, bankAccountNumber;

	public Customer(String secondName, String firstName, String patronymic, String adress, String creditCardNumber,
			String bankAccountNumber) {
		this.ID = id++;
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Customer() {
		this.ID = id++;
		this.firstName = "<blank>";
		this.secondName = "<blank>";
		this.patronymic = "<blank>";
		this.adress = "<blank>";
		this.creditCardNumber = "<blank>";
		this.bankAccountNumber = "<blank>";
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getID() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public String getPatronymic() {
		return this.patronymic;
	}

	public String getAdress() {
		return this.adress;
	}

	public String getCreditCardNumber() {
		return this.creditCardNumber;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	@Override
	public String toString() {
		String info = new String();
		info = info + this.ID + ". " + this.firstName + " " + this.secondName + " " + this.patronymic + ".\n"
				+ this.adress + ".\n" + this.creditCardNumber + "; " + this.bankAccountNumber + ".";
		return info;
	}

	public void print() {
		System.out.println(toString());
	}

	public static class SortByName implements Comparator<Customer> {
		@Override
		public int compare(Customer o1, Customer o2) {
			if (o1.secondName != o2.secondName)
				return o1.secondName.compareTo(o2.secondName);
			if (o1.firstName != o2.firstName)
				return o1.firstName.compareTo(o2.firstName);
			return o1.patronymic.compareTo(o2.patronymic);
		}
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Customer.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((bankAccountNumber == null) ? 0 : bankAccountNumber.hashCode());
		result = prime * result + ((creditCardNumber == null) ? 0 : creditCardNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
		Customer other = (Customer) obj;
		if (ID != other.ID)
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bankAccountNumber == null) {
			if (other.bankAccountNumber != null)
				return false;
		} else if (!bankAccountNumber.equals(other.bankAccountNumber))
			return false;
		if (creditCardNumber == null) {
			if (other.creditCardNumber != null)
				return false;
		} else if (!creditCardNumber.equals(other.creditCardNumber))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

}
