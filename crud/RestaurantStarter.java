package com.xworkz.crud;

import com.xworkz.crud.operator.Restaurant;

public class RestaurantStarter {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant();
		restaurant.getName();
		restaurant.addrestaurantName("Ambiaka");
		restaurant.addrestaurantName("poojya");
		restaurant.addrestaurantName("anusha");
		restaurant.addrestaurantName("amogh");
		restaurant.addrestaurantName("sanchitha");
		restaurant.addrestaurantName("anamika");
		restaurant.displayWaterFallNames();

	}

}
