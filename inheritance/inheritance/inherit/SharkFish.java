package com.xworkz.inheritance.inherit;

public class SharkFish extends Fish{
	private float height=2.3f;
	private float weight=6.8f;
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public SharkFish() {
		System.out.println("invoked no-args SharkFish constructor");
	}

}
