package com.xworkz.inheritance;

import com.xworkz.inheritance.inherit.NaturalSaloon;
import com.xworkz.inheritance.inherit.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		NaturalSaloon natural=new NaturalSaloon();
		Saloon saloon=new NaturalSaloon();
		NaturalSaloon natural1=new NaturalSaloon("naturals", 10);
		System.out.println(natural.getName());
		System.out.println(saloon.getName());
		System.out.println(natural.getNoOfHajamas());
		System.out.println(saloon.getNoOfHajamas());

	}

}
