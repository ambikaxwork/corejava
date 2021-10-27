package com.xworkz.dp.dto;

public class Bracelete {

	private String color;
	private String material;
	private boolean gemUsed;
	private boolean gifted;
	private float price;

	public Bracelete() {
		System.out.println("invoked no-arg constructor");
	}

	public Bracelete(String color, String material, boolean gemUsed, boolean gifted, float price) {
		super();
		this.color = color;
		this.material = material;
		this.gemUsed = gemUsed;
		this.gifted = gifted;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
