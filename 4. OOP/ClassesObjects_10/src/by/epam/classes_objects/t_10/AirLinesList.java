package by.epam.classes_objects.t_10;

import java.util.Arrays;
import java.util.Scanner;

public class AirLinesList {
	private Airline[] flights;
	private int size;
	private int limit;

	public AirLinesList(int size) {
		this.size = size;
		this.limit = 0;
		this.flights = new Airline[size];
	}

	public AirLinesList() {
		this.size = 5;
		this.limit = 0;
		this.flights = new Airline[size];
	}

	public void listFilling(Airline flight) {
		if (limit < size) {
			flights[limit] = flight;
			limit++;

		} else {
			Airline[] newList = new Airline[size * 2];

			for (int i = 0; i < size; i++) {
				newList[i] = flights[i];
			}
			flights = newList;
			size = size * 2;
			flights[limit] = flight;
			limit++;
		}
	}

	public void printList() {
		for (int i = 0; i < limit; i++) {
			this.flights[i].print();
		}
	}

	public void findDestination(String destination) {
		for (int i = 0; i < limit; i++) {
			if (flights[i].getDestination().equalsIgnoreCase(destination)) {
				flights[i].print();
			}
		}
	}

	public void findDay(String day) {
		for (int i = 0; i < limit; i++) {
			if (flights[i].getDay().equalsIgnoreCase(day)) {
				flights[i].print();
			}
		}
	}

	public void findTime(String time) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите день недели: ");
		String day = sc.nextLine();
		for (int i = 0; i < limit; i++) {
			if (flights[i].getDay().equalsIgnoreCase(day) && flights[i].getTime().compareTo(time) >= 0) {
				flights[i].print();
			}
		}
	}

	public Airline[] getFlights() {
		return flights;
	}

	public void setFlights(Airline[] flights) {
		this.flights = flights;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
		result = prime * result + Arrays.hashCode(flights);
		result = prime * result + limit;
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
		AirLinesList other = (AirLinesList) obj;
		if (!Arrays.equals(flights, other.flights))
			return false;
		if (limit != other.limit)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AirLinesList [flights=" + Arrays.toString(flights) + ", size=" + size + ", limit=" + limit + "]";
	}
}
