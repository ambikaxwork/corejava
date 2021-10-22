package com.xworkz.crud.operator;

public class CoolDrink {
	private String[] brandNames = new String[5];
	private int count;

	public CoolDrink() {
		System.out.println("constructor invoked");
	}

	public void addChoclateName(String name) {
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

	public String[] getbrandNames() {
		return this.brandNames;
	}

	public void update(int kit, String newname) {
		if (kit >= 0 && kit < this.brandNames.length) {
			System.out.println("invoked newname");
			this.brandNames[kit] = newname;
			System.out.println(newname.concat(String.valueOf(kit)));
		} else {
			System.err.println("can not update:".concat(String.valueOf(brandNames.length)));
		}
	}

	public void delete(int kat) {
		if (kat >= 0 && kat < this.brandNames.length) {
			System.out.println("invoked index to delete");
			this.brandNames[kat] = null;
			System.out.println("can not delete:".concat(String.valueOf(kat)));
		} else {
			System.out.println("can not delete:");
		}

	}

}
