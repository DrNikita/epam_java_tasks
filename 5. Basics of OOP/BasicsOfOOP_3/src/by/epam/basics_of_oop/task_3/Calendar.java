package by.epam.basics_of_oop.task_3;

import java.util.ArrayList;

public class Calendar {

	private int year;
	private int month;
	private int day;
	private String event;

	private ArrayList<Calendar> days = new ArrayList<Calendar>();

	public Calendar() {
	}

	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.event = null;
	}

	public Calendar(int year, int month, int day, boolean dayOff) {
		this.year = year;
		this.month = month;
		this.day = day;

		if (dayOff) {
			this.event = "relaxation";
		} else {
			this.event = null;
		}
	}

	public Calendar(int year, int month, int day, String holiday) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.event = holiday;
	}

	public void addDateToList(int year, int month, int day) {
		days.add(new Calendar(year, month, day));
	}

	public void addDateToList(int year, int month, int day, boolean dayOff) {
		days.add(new Calendar(year, month, day, dayOff));
	}

	public void addDateToList(int year, int month, int day, String holiday) {
		days.add(new Calendar(year, month, day, holiday));
	}

	public void printCalendar() {
		for (int i = 0; i < days.size(); i++) {
			if (days.get(i).getEvent() != null) {
				System.out.println(days.get(i).getDay() + "/" + days.get(i).getMonth() + "/" + days.get(i).getYear()
						+ ", " + days.get(i).getEvent() + ".");
			} else {
				System.out.println(
						days.get(i).getDay() + "/" + days.get(i).getMonth() + "/" + days.get(i).getYear() + ".");
			}
		}
	}

	public void printEasyDays() {
		EasyDays easyDays = new EasyDays();
		easyDays.printEasyDays();
	}

	public class EasyDays {

		private ArrayList<Calendar> youCanChill = new ArrayList<Calendar>();

		public EasyDays() {

			for (int i = 0; i < days.size(); i++) {

				if (days.get(i).getEvent() != null) {
					youCanChill.add(days.get(i));
				}
			}
		}

		public void printEasyDays() {
			for (int i = 0; i < youCanChill.size(); i++) {
				System.out.println(youCanChill.get(i).getDay() + "/" + youCanChill.get(i).getMonth() + "/"
						+ youCanChill.get(i).getYear() + ", " + youCanChill.get(i).getEvent() + ".");
			}
		}

		public ArrayList<Calendar> getYouCanChill() {
			return youCanChill;
		}

		public void setYouCanChill(ArrayList<Calendar> youCanChill) {
			this.youCanChill = youCanChill;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((youCanChill == null) ? 0 : youCanChill.hashCode());
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
			EasyDays other = (EasyDays) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (youCanChill == null) {
				if (other.youCanChill != null)
					return false;
			} else if (!youCanChill.equals(other.youCanChill))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "EasyDays [youCanChill=" + youCanChill + "]";
		}

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public ArrayList<Calendar> getDays() {
		return days;
	}

	public void setDays(ArrayList<Calendar> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + month;
		result = prime * result + year;
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
		Calendar other = (Calendar) obj;
		if (day != other.day)
			return false;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [year=" + year + ", month=" + month + ", day=" + day + ", event=" + event + ", days=" + days
				+ "]";
	}

}
