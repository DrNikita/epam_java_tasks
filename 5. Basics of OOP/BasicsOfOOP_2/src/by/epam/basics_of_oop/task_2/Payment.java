package by.epam.basics_of_oop.task_2;

import java.util.ArrayList;

public class Payment {

	private ArrayList<Product> productsList = new ArrayList<Product>();
	private double totalAmount;

	public class Product {
		private String productName;
		private double price;

		public Product(String name, double price) {
			this.productName = name;
			this.price = price;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((productName == null) ? 0 : productName.hashCode());
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			return true;
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public String toString() {
			return "Product [productName=" + productName + ", price=" + price + "]";
		}

	}

	public void addProductToList(String name, double price, int amount) {
		for (int i = 0; i < amount; i++) {
			productsList.add(new Product(name, price));
		}
	}

	public void showList() {
		for (int i = 0; i < productsList.size(); i++) {
			System.out.println(productsList.get(i).getProductName() + ", " + productsList.get(i).getPrice() + "р;");
		}
	}

	public ArrayList<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(ArrayList<Product> productsList) {
		this.productsList = productsList;
	}

	public double getTotalAmount() {

		for (int i = 0; i < productsList.size(); i++) {

			this.totalAmount += productsList.get(i).getPrice();
		}

		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productsList == null) ? 0 : productsList.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Payment other = (Payment) obj;
		if (productsList == null) {
			if (other.productsList != null)
				return false;
		} else if (!productsList.equals(other.productsList))
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [productsList=" + productsList + ", totalAmount=" + totalAmount + "]";
	}

}
