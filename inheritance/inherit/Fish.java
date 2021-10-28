package com.xworkz.inheritance.inherit;

public class Fish {
	private String region="manglore";
	private boolean alive=false;
	
	public Fish() {
		System.out.println("invoked no-args Fish constructor");
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
