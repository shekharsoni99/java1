package com.example.demo;

public class ProductDetails {

	private int id;
	private String name;
	private int price;
	private String brand;
	private String category;
	private int registration_number;
	private int manufacturer_id;
	
	public ProductDetails(int id, String name, int price, String brand, String category, int registration_number, int manufacturer_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registration_number = registration_number;
		this.manufacturer_id = manufacturer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(int registration_number) {
		this.registration_number = registration_number;
	}

	public int getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(int manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	
	@Override
	public String toString() {
		return getId() + " " + getName() + " " + getCategory() + " " + getBrand() + " " + getPrice() + " " + getManufacturer_id() + " " + getRegistration_number();
	}
}
