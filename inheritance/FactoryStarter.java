package com.xworkz.inheritance;

import com.xworkz.inheritance.inherit.Factory;
import com.xworkz.inheritance.inherit.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {
		Factory factory=new SugarFactory();
		SugarFactory sugarFactory=new SugarFactory(null, 0);
		Factory factory1=new SugarFactory(null, 0, null, 0, null);
		

	}

}
