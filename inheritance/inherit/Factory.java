package com.xworkz.inheritance.inherit;

public class Factory {
	private String factoryName;
	private int since;
	private String owner;
	private int noOfWorkers;
	private String product;
	
	public Factory() {
		System.out.println("invoked no-args Fcatory constructor");
	}
	public Factory(String factoryName) {
		System.out.println("invoked parameterized Factory constructor");
		this.factoryName=factoryName;
		System.out.println(this.factoryName);
	}
	public Factory(String owner,int since) {
		System.out.println("invoked parameterized Factory constructor");
		this.owner=owner;
		this.since=since;
		System.out.println(this.owner);
		System.out.println(this.since);
	}
	public Factory(String factoryName, int since, String owner, int noOfWorkers, String product) {
		super();
		this.factoryName = factoryName;
		this.since = since;
		this.owner = owner;
		this.noOfWorkers = noOfWorkers;
		this.product = product;
		System.out.println(this.factoryName);
		System.out.println(this.owner);
		System.out.println(this.since);
		System.out.println(this.noOfWorkers);
		System.out.println(this.product);
		
	}
	

}
