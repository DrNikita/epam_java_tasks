package by.epam.aggregation_composition.t_5;

import java.util.Arrays;

public class VoucherSearch {
	VouchersList list;
	private int[] parameters;

	public VoucherSearch(VouchersList list, int[] parameters) {
		this.list = list;
		this.parameters = parameters;
		searchVoucher();
	}

	public void searchVoucher() {
		int flag = 0;
		System.out.println("\nНайдены следующие путевки:");
		for (int i = 0; i < this.list.getVouchersList().length; i++) {
			if (Arrays.equals(list.getVouchersList()[i].getParameters(), this.parameters)) {
				System.out.println(list.getVouchersList()[i].toString());
				flag++;
			}
		}
		if (flag == 0) {
			System.out.print("Путевок не найдено");
		}
		flag = 0;
	}

	public VouchersList getList() {
		return list;
	}

	public void setList(VouchersList list) {
		this.list = list;
	}

	public int[] getParameters() {
		return parameters;
	}

	public void setParameters(int[] parameters) {
		this.parameters = parameters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + Arrays.hashCode(parameters);
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
		VoucherSearch other = (VoucherSearch) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (!Arrays.equals(parameters, other.parameters))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VoucherSearch [list=" + list + ", parameters=" + Arrays.toString(parameters) + "]";
	}
}
