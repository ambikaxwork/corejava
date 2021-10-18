package com.xworkz.access.developer;

public class Developer {
	public static String name;
	public String role;
	public int age;
	public Company company=new Company();
	public Developer(String name,int age) {
		this.name=name;
		this.age=age;	
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.role);
		System.out.println(this.age);
		//System.out.println(this.company);
	}
	
	

}