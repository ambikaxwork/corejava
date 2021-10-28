package com.xworkz.inheritance.inherit;

public class GoldFish extends Fish {
	private String color="gold";
	private String size="big";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public GoldFish() {
		System.out.println("invoked no-args GoldFish constructor");
	}

}
