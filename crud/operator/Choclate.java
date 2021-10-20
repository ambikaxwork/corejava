package com.xworkz.crud.operator;

public class Choclate {

	private String[] choclateNames = new String[5];
	private int count = 0;
	private String name;

	public Choclate() {
		this("Ambika");
		System.out.println("invoked no-argument constructor");
		System.out.println(this.name);
	}

	public Choclate(String name) {
		this.name = name;
		System.out.println("invoked parameterizwd constructor");
	}

	public String getName() {
		return this.name;
	}

	public void addChoclateName(String name1) {
		System.out.println("name:".concat(name1));
		if (this.count < 5) {
			choclateNames[count] = name1;
			count++;
		} 
		else {
			System.err.println("array full so u can go now");
		}
	}

	public void displayChoclateNames() {
		System.out.println("choclateNames:");
		for (int i = 0; i < choclateNames.length; i++) {
			System.out.println(choclateNames[i]);
		}
	}

}
