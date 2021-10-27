package com.xworkz.dp.dto;

public class BucketDTO {
	private String color;
	private String company;
	private float size;
	private float price;
	private float quantity;
	private float weight;

	public BucketDTO() {
		System.out.println("no args constructor is invoked");
	}

	public BucketDTO(String color, String company, float size, float price, float quantity, float weight) {
		super();
		this.color = color;
		this.company = company;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
