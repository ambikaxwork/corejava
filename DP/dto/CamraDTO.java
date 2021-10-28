package com.xworkz.dp.dto;

public class CamraDTO {
	private String company;
	private String type;
	private float pixel;
	private float cost;
	private int batteryCapacity;
	private float weight;

	public CamraDTO() {
		System.out.println("invoked no args constructr");
	}

	public CamraDTO(String company, String type, float pixel, float cost, int batteryCapacity, float weight) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
		this.batteryCapacity = batteryCapacity;
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPixel() {
		return pixel;
	}

	public void setPixel(float pixel) {
		this.pixel = pixel;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
