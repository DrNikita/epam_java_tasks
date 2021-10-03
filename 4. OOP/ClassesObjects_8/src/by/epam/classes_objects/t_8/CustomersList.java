package by.epam.classes_objects.t_8;

import java.util.*;

public class CustomersList {
	private Customer[] customersList;
	private int listSize;
	private int limit;

	public CustomersList(int custNum) {
		this.listSize = custNum;
		this.limit = 0;
		customersList = new Customer[listSize];
	}

	public CustomersList() {
		this.listSize = 5;
		this.limit = 0;
		customersList = new Customer[listSize];
	}

	public void listFilling(Customer customer) {

		if (limit < listSize) {
			customersList[limit] = customer;
			limit++;

		} else {
			Customer[] newList = new Customer[listSize * 2];

			for (int i = 0; i < limit; ++i) {
				newList[i] = customersList[i];
			}

			customersList = newList;
			listSize = listSize * 2;
			customersList[limit] = customer;
			limit++;
		}
	}

	public void print() {
		for (int i = 0; i < listSize; ++i) {
			if (customersList[i] != null) {
				customersList[i].print();
			}
		}
	}

	public void sortByName() {
		Arrays.sort(customersList, 0, limit, new Customer.SortByName());
	}

	public void checkCardNum(String a, String b) {
		for (int i = 0; i < limit; ++i) {
			if (customersList[i].getCreditCardNumber().compareTo(a) >= 0
					&& customersList[i].getCreditCardNumber().compareTo(b) <= 0)
				customersList[i].print();
		}
	}

	public Customer[] getCustomersList() {
		return customersList;
	}

	public void setCustomersList(Customer[] customersList) {
		this.customersList = customersList;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(customersList);
		result = prime * result + limit;
		result = prime * result + listSize;
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
		CustomersList other = (CustomersList) obj;
		if (!Arrays.equals(customersList, other.customersList))
			return false;
		if (limit != other.limit)
			return false;
		if (listSize != other.listSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomersList [customersList=" + Arrays.toString(customersList) + ", listSize=" + listSize + ", limit="
				+ limit + "]";
	}
}
