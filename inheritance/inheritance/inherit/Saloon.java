package com.xworkz.inheritance.inherit;

public class Saloon {
	private String name="naturals";
	private int noOfHajamas=6;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfHajamas() {
		return noOfHajamas;
	}

	public void setNoOfHajamas(int noOfHajamas) {
		this.noOfHajamas = noOfHajamas;
	}

	public Saloon() {
		System.out.println("invoked no-args Saloon constructor");
	}
	

}
