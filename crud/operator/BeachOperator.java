package com.xworkz.crud.operator;

public class BeachOperator {
	private String city = new String();
	private String[] beachNames = new String[5];
	private int count = 0;

	public BeachOperator() {
		this("Shimoga");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.city);
	}

	public BeachOperator(String city) {
		this.city = city;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getCity() {
		return this.city;
	}

	public void addBeachName(String name) {
		System.out.println("name:".concat(name));
		if (this.count < 5) {
			beachNames[count] = name;
			count++;
		} else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayBeachNames() {
		System.out.println("beachNames:");
		for (int i = 0; i < beachNames.length; i++) {
			System.out.println(beachNames[i]);
		}
	}

}
