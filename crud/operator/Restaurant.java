package com.xworkz.crud.operator;

public class Restaurant {
	private String[] restaurantNames = new String[5];
	private int count = 0;
	private String name;

	public Restaurant() {
		this("Ambika");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.name);
	}

	public Restaurant(String name) {
		this.name = name;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getName() {
		return this.name;
	}

	public void addrestaurantName(String name1) {
		System.out.println("name:".concat(name1));
		if (this.count < 5) {
			restaurantNames[count] = name1;
			count++;
		} 
		else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayWaterFallNames() {
		System.out.println("Restaurant:");
		for (int i = 0; i < restaurantNames.length; i++) {
			System.out.println(restaurantNames[i]);
		}
	}


}
