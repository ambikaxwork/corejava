package com.xworkz.crud.operator;

public class Cofee {
	private String[] brandNames = new String[5];
	private int count;

	public Cofee() {
		System.out.println("constructor invoked");
	}

	public void addCofeeName(String name) {
		System.out.println("name:".concat(name));
		if (count < brandNames.length) {
			brandNames[count++] = name;
		} else {
			System.err.println("array full so u can go now");
		}
	}

	public void displaybrandNames() {
		System.out.println("brandNames:");
		for (int i = 0; i < brandNames.length; i++) {
			System.out.println(brandNames[i]);
		}
	}

	public String[] getCofeeBybrandNames() {
		return this.brandNames;
	}

	public void update(int crunch, String newname) {
		if (crunch >= 0 && crunch < this.brandNames.length) {
			System.out.println("invoked newname");
			this.brandNames[crunch] = newname;
			System.out.println(newname.concat(String.valueOf(crunch)));
		} else {
			System.err.println("can not update:".concat(String.valueOf(brandNames.length)));
		}
	}

	public void delete(int munch) {
		if (munch >= 0 && munch < this.brandNames.length) {
			System.out.println("invoked index to delete");
			this.brandNames[munch] = null;
			System.out.println("can not delete:".concat(String.valueOf(munch)));
		} else {
			System.out.println("can not delete:");
		}

	}

}
