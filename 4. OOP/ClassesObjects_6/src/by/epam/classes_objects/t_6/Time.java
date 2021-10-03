package by.epam.classes_objects.t_6;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		this(0, 0, 0);
	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public void setHours(int hours) {
		this.hours = hours;
		if (this.hours > 23) {
			this.hours = 0;
		}
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
		if (this.minutes > 59) {
			this.minutes = 0;
		}
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
		if (this.seconds > 59) {
			this.seconds = 0;
		}
	}

	public void plusHours(int plus) {
		this.hours += plus;
		if (this.hours > 23) {
			this.hours = 0;
		}
	}

	public void minusHours(int minus) {
		this.hours -= minus;
		if (this.hours < 0) {
			this.hours = 0;
		}
	}

	public void plusMinutes(int plus) {
		this.minutes += plus;

		if (this.minutes > 59) {
			plusHours(this.minutes / 60);
			this.minutes = this.minutes - 60 * (this.minutes / 60);
		}
	}

	public void minusMinutes(int minus) {
		this.minutes -= minus;

		if (this.minutes < 0) {
			minusHours(this.minutes / -60);
			this.minutes = (this.minutes + 60 * (this.minutes / -60)) / -1;
		}
	}

	public void plusSeconds(int plus) {
		this.seconds += plus;
		if (this.seconds > 60) {
			plusMinutes(this.seconds / 60);
			this.seconds = this.seconds - 60 * (this.seconds / 60);
		}
	}

	public void minusSeconds(int minus) {
		this.seconds -= minus;

		if (this.seconds < 0) {
			minusMinutes(this.seconds / -60);
			this.seconds = (this.seconds + 60 * (this.seconds / -60)) / -1;
		}
	}

	public void printTime() {
		System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
}
