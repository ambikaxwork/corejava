package com.xworkz.access;
import com.xworkz.access.developer.*;
import static com.xworkz.access.developer.Developer.name;

public class DeveloperStarter {

	public static void main(String[] args) {
		Developer developer=new Developer("Ambika",21);
		System.out.println(name);
		System.out.println(developer.age);
		developer.display();
		Company company=new Company();
		company.name="Amazon";
		System.out.println(company.name);
		
	

	}

}
