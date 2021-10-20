package com.xworkz.crud.operator;

public class Islands {
	private String[] islandsNames = new String[5];
	private int count = 0;
	private String name;

	public Islands() {
		this("Ambika");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.name);
	}

	public Islands(String name) {
		this.name = name;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getName() {
		return this.name;
	}

	public void addWaterFallName(String name1) {
		System.out.println("name:".concat(name1));
		if (this.count < 5) {
			islandsNames[count] = name1;
			count++;
		} 
		else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayWaterFallNames() {
		System.out.println("choclateNames:");
		for (int i = 0; i < islandsNames.length; i++) {
			System.out.println(islandsNames[i]);
		}
	}

}


