package com.xworkz.crud.operator;

public class WaterFall {
	private String[] waterFallNames = new String[5];
	private int count = 0;
	private String name;

	public WaterFall() {
		this("Ambika");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.name);
	}

	public WaterFall(String name) {
		this.name = name;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getName() {
		return this.name;
	}

	public void addWaterFallName(String name1) {
		System.out.println("name:".concat(name1));
		if (this.count < 5) {
			waterFallNames[count] = name1;
			count++;
		} 
		else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayWaterFallNames() {
		System.out.println("choclateNames:");
		for (int i = 0; i < waterFallNames.length; i++) {
			System.out.println(waterFallNames[i]);
		}
	}

}



