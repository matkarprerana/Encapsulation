package com.tka.jan2;

public class orders {

	private int order_Id;
	private String cust_name;
	private String pro_name;
	private int quantity;
	private double price;
	private double total_amount;
	
	public orders() {
		super();
	}

	public orders(int order_Id, String cust_name, String pro_name, int quantity, double price, double total_amount) {
		super();
		this.order_Id = order_Id;
		this.cust_name = cust_name;
		this.pro_name = pro_name;
		this.quantity = quantity;
		this.price = price;
		this.total_amount = total_amount;
	}

	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	@Override
	public String toString() {
		return "orders [cust_name=" + cust_name + ", pro_name=" + pro_name + ", price=" + price + "]";
	}
	
	
	
}
