package by.epam.aggregation_composition.t_4;

import java.util.Arrays;

public class Client {
	private String name;
	private String adress;
	private String mobilePhone;
	private Account[] accounts;
	private int pos;
	private int size;

	public Client(String name, String adress, String mobilePhone) {
		super();
		this.name = name;
		this.adress = adress;
		this.mobilePhone = mobilePhone;
		this.pos = 0;
		this.size = 1;
		this.accounts = new Account[this.size];
	}

	public void addAccount(Account account) {
		if (pos < size) {
			accounts[pos] = account;
			pos++;

		} else {
			Account[] newAcc = new Account[size + 1];

			for (int i = 0; i < pos; i++) {
				newAcc[i] = accounts[i];
			}

			accounts = newAcc;
			size = size + 1;
			accounts[pos] = account;
			pos++;
		}
	}

	public void blockAccount(String number) {
		this.getAccount(number).blockAccount();
		System.out.println("Был заблокирован аккаунт номер " + number);
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void printAccountsList() {
		for (int i = 0; i < pos; i++) {
			System.out.println(accounts[i].toString());
		}
	}

	public Account getAccount(String number) {
		Account account = new Account();
		for (int i = 0; i < pos; i++) {
			if (accounts[i].getNumber().equals(number)) {
				account = accounts[i];
			}
		}
		return account;
	}

	public double accountsBalance() {
		double balance = 0;
		for (int i = 0; i < pos; i++) {
			if (!accounts[i].isBllocked()) {
				balance += accounts[i].getBalance();
			}
		}
		return balance;
	}

	public double positiveAccountsBalance() {
		double posBalance = 0;
		for (int i = 0; i < pos; i++) {
			if (!(accounts[i].isBllocked()) && accounts[i].getBalance() > 0) {
				posBalance += accounts[i].getBalance();
			}
		}
		return posBalance;
	}

	public double negativeAccountsBalance() {
		double negBalance = 0;
		for (int i = 0; i < pos; i++) {
			if (!(accounts[i].isBllocked()) && accounts[i].getBalance() < 0) {
				negBalance += accounts[i].getBalance();
			}
		}
		return negBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pos;
		result = prime * result + size;
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
		Client other = (Client) obj;
		if (!Arrays.equals(accounts, other.accounts))
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pos != other.pos)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", adress=" + adress + ", mobilePhone=" + mobilePhone + ", accounts="
				+ Arrays.toString(accounts) + ", pos=" + pos + ", size=" + size + "]";
	}
}
