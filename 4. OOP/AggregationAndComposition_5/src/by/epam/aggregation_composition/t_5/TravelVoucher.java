package by.epam.aggregation_composition.t_5;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TravelVoucher {
	private String[] voucher;
	VoucherParameters.TourType restType;
	VoucherParameters.TransportType transport;
	VoucherParameters.Season season;
	VoucherParameters.DaysNum days;
	VoucherParameters.Food food;
	private int[] paremeters;

	public TravelVoucher(int rest, int transport, int season, int days, int food, String date) {
		this.paremeters = new int[] { rest, transport, season, days, food };
		this.voucher = new String[6];
		this.voucher[0] = this.restType.values()[rest].getType();
		this.voucher[1] = this.transport.values()[transport].getType();
		this.voucher[2] = this.season.values()[season].getType();
		this.voucher[3] = this.days.values()[days].getType();
		this.voucher[4] = this.food.values()[food].getType();
		this.voucher[5] = date;
	}

	public int[] getParameters() {
		return this.paremeters;
	}

	public String[] getVoucher() {
		return voucher;
	}

	public String getDate() {
		return voucher[5];
	}

	@Override
	public String toString() {
		return ("Путевка:\n     Тип отдыха: " + voucher[0] + "\n     Транспорт: " + voucher[1] + "\n     Сезон: "
				+ voucher[2] + "\n     Количество дней: " + voucher[3] + "\n     Питание: " + voucher[4]
				+ "\n     Дата: " + voucher[5]);
	}

	public VoucherParameters.TourType getRestType() {
		return restType;
	}

	public void setRestType(VoucherParameters.TourType restType) {
		this.restType = restType;
	}

	public VoucherParameters.TransportType getTransport() {
		return transport;
	}

	public void setTransport(VoucherParameters.TransportType transport) {
		this.transport = transport;
	}

	public VoucherParameters.Season getSeason() {
		return season;
	}

	public void setSeason(VoucherParameters.Season season) {
		this.season = season;
	}

	public VoucherParameters.DaysNum getDays() {
		return days;
	}

	public void setDays(VoucherParameters.DaysNum days) {
		this.days = days;
	}

	public VoucherParameters.Food getFood() {
		return food;
	}

	public void setFood(VoucherParameters.Food food) {
		this.food = food;
	}

	public int[] getParemeters() {
		return paremeters;
	}

	public void setParemeters(int[] paremeters) {
		this.paremeters = paremeters;
	}

	public void setVoucher(String[] voucher) {
		this.voucher = voucher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + Arrays.hashCode(paremeters);
		result = prime * result + ((restType == null) ? 0 : restType.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + Arrays.hashCode(voucher);
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
		TravelVoucher other = (TravelVoucher) obj;
		if (days != other.days)
			return false;
		if (food != other.food)
			return false;
		if (!Arrays.equals(paremeters, other.paremeters))
			return false;
		if (restType != other.restType)
			return false;
		if (season != other.season)
			return false;
		if (transport != other.transport)
			return false;
		if (!Arrays.equals(voucher, other.voucher))
			return false;
		return true;
	}
}
