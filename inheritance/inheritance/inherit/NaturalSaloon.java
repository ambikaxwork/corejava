package com.xworkz.inheritance.inherit;

public class NaturalSaloon extends Saloon {
	private String name="v4";
	private int noOfHajamas=9;
	
	public NaturalSaloon() {
		System.out.println("invoked no-args NaturalSaloon constructor");
	}

	public NaturalSaloon(String name, int noOfHajamas) {
		super();
		System.out.println("invoked parameterized constructor");
		this.name = name;
		this.noOfHajamas = noOfHajamas;
	}

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
	

}
