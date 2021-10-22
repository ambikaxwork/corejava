package com.xworkz.crud;

import com.xworkz.crud.operator.CoolDrink;

public class CoolDrinkStarter {

	public static void main(String[] args) {
		CoolDrink coolDrink=new CoolDrink();
		coolDrink.getbrandNames();
		coolDrink.addChoclateName("thumbs up");
		coolDrink.addChoclateName("7 up");
		coolDrink.addChoclateName("zinga");
		coolDrink.addChoclateName("maaza");
		coolDrink.addChoclateName("coke");
		coolDrink.displaybrandNames();
		coolDrink.update(4, "slice");
		coolDrink.delete(1);
		
		

	}

}
