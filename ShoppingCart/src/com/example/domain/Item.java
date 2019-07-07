package com.example.domain;

public class Item {

	int id;
	String name;
	float price;
	int quantity;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
