package com.xworkz.crud.operator;

public class Resort {
	private String[] resortNames = new String[5];
	private int count = 0;
	private String name;

	public Resort() {
		this("Ambika");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.name);
	}

	public Resort(String name) {
		this.name = name;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getName() {
		return this.name;
	}

	public void addResortName(String name1) {
		System.out.println("name:".concat(name1));
		if (this.count < 5) {
			resortNames[count] = name1;
			count++;
		} 
		else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayChoclateNames() {
		System.out.println("resortNames:");
		for (int i = 0; i < resortNames.length; i++) {
			System.out.println(resortNames[i]);
		}
	}

}



