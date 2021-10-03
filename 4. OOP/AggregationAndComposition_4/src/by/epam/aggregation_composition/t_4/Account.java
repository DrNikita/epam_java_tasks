package by.epam.aggregation_composition.t_4;

import java.util.Comparator;

public class Account {
	private String number;
	private double balance;
	private boolean isBllocked;

	public Account(String number, double balance) {
		this.number = number;
		this.balance = balance;
		this.isBllocked = false;
	}

	public Account() {
		this.number = "0";
		this.balance = 0;
		this.isBllocked = false;
	}

	@Override
	public String toString() {
		return "Number=" + number + ", balance=" + balance;
	}

	public void blockAccount() {
		this.isBllocked = true;
	}

	public void unBlockAccount() {
		this.isBllocked = false;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBllocked() {
		return isBllocked;
	}

	public void setBllocked(boolean isBllocked) {
		this.isBllocked = isBllocked;
	}

	public static class SortByNumbers implements Comparator<Account> {
		@Override
		public int compare(Account o1, Account o2) {
			return o1.getNumber().compareTo(o2.getNumber());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBllocked ? 1231 : 1237);
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBllocked != other.isBllocked)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
}
