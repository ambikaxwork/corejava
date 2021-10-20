package com.xworkz.crud;

import com.xworkz.crud.operator.WaterFall;

public class WaterFallStarter {

	public static void main(String[] args) {
		WaterFall waterFall=new WaterFall();
		waterFall.addWaterFallName("jog falls");
		waterFall.addWaterFallName("barachukki");
		waterFall.addWaterFallName("gaganachukki");
		waterFall.addWaterFallName("sirimane");
		waterFall.addWaterFallName("huncha");
		waterFall.displayWaterFallNames();

	}

}
