package com.xworkz.inheritance.inherit;

public class SugarFactory extends Factory {
	public SugarFactory() {
		super("sugar");
		System.out.println("invoked no-args SugarFactory");
	}
	public SugarFactory(String name,int age) {
		super("vignesh",24);
		System.out.println("invoked parameterized SugarFactory");
	}
	public SugarFactory(String factoryName, int since, String owner, int noOfWorkers, String product) {
		super("varsha",1999,"shruti",456,"sugar");
		System.out.println("invoked parameterized SugarFactory");
	}
	

}
