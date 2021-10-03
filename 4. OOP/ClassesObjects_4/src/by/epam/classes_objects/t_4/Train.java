package by.epam.classes_objects.t_4;

import java.util.Comparator;

public class Train {
	private String destination;
	private int trainNumber;
	private String time;

	public Train(String destinanion, int trainNumber, String time) {
		this.destination = destinanion;
		this.trainNumber = trainNumber;
		this.time = time;
	}

	public static class TrainNumberSort implements Comparator<Train> {
		@Override
		public int compare(Train o1, Train o2) {
			return o2.trainNumber - o1.trainNumber;
		}
	}

	public static class DesignationSort implements Comparator<Train> {
		@Override
		public int compare(Train o1, Train o2) {
			if (o1.destination == o2.destination) {
				return o1.time.compareTo(o2.time);
			} else {
				return o1.time.compareTo(o2.time);
			}
		}
	}

	public void printList() {
		System.out.println(this.destination + ", " + this.trainNumber + ", " + this.time + ".");
	}

	public int getTrainNumber() {
		return this.trainNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", trainNumber=" + trainNumber + ", time=" + time + "]";
	}
}
