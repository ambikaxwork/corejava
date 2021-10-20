package com.xworkz.crud;

import com.xworkz.crud.operator.Gin;

public class GinStarter {

	public static void main(String[] args) {
		Gin ginName=new Gin();
		ginName.getName();
		ginName.addrestaurantName("Tanqueray");
		ginName.addrestaurantName("BullDog");
		ginName.addrestaurantName("Monkey 47");
		ginName.addrestaurantName("sipsmith");
		ginName.addrestaurantName("gin mare");
		ginName.displayWaterFallNames();
		ginName.addrestaurantName("Colombo No");
		ginName.displayWaterFallNames();
		

	}

}
