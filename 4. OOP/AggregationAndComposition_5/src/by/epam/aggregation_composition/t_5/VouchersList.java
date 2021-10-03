package by.epam.aggregation_composition.t_5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class VouchersList {
	private TravelVoucher[] vouchersList;
	private int size;
	private int limit;

	public VouchersList() {
		this.size = 1;
		this.limit = 0;
		this.vouchersList = new TravelVoucher[this.size];
	}

	public void addVoucher(TravelVoucher voucher) {
		if (limit < size) {
			vouchersList[limit] = voucher;
			limit++;
		} else {
			TravelVoucher[] newList = new TravelVoucher[size + 1];
			for (int i = 0; i < limit; i++) {
				newList[i] = vouchersList[i];
			}
			vouchersList = newList;
			size = size + 1;
			vouchersList[limit] = voucher;
			limit++;
		}
	}

	public TravelVoucher[] getVouchersList() {
		return this.vouchersList;
	}

	public void printList() {
		for (int i = 0; i < limit; i++) {
			System.out.println(this.vouchersList[i].toString() + "\n");
		}
	}

	public void sortDate() {
		Arrays.sort(vouchersList, new Comparator<TravelVoucher>() {
			DateFormat f = new SimpleDateFormat("dd/MM/yyyy");

			@Override
			public int compare(TravelVoucher o1, TravelVoucher o2) {
				try {
					return f.parse(o1.getDate()).compareTo(f.parse(o2.getDate()));
				} catch (ParseException e) {
					throw new IllegalArgumentException(e);
				}
			}
		});
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

	public void setVouchersList(TravelVoucher[] vouchersList) {
		this.vouchersList = vouchersList;
	}

	@Override
	public String toString() {
		return "VouchersList [vouchersList=" + Arrays.toString(vouchersList) + ", size=" + size + ", limit=" + limit
				+ "]";
	}
}
