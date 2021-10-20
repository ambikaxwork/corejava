package com.xworkz.crud;

import com.xworkz.crud.operator.Choclate;

public class ChoclateStarter {

	public static void main(String[] args) {
		Choclate choclate = new Choclate();
		choclate.getName();
		choclate.addChoclateName("kitkat");
		choclate.addChoclateName("dairy milk");
		choclate.addChoclateName("5 star");
		choclate.addChoclateName("kagge");
		choclate.addChoclateName("perk");
		choclate.displayChoclateNames();

		Choclate choclate1 = new Choclate();
		choclate1.getName();
		choclate1.addChoclateName("munch");
		choclate1.addChoclateName("dark choclate");
		choclate1.addChoclateName("milky bar");
		choclate1.addChoclateName("kagge");
		choclate1.addChoclateName("perk");
		choclate1.addChoclateName("hershyes");
		choclate1.displayChoclateNames();

	}

}
