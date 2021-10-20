package com.xworkz.crud;

import com.xworkz.crud.operator.Islands;

public class IslandsStarter {

	public static void main(String[] args) {
		Islands islands=new Islands();
		islands.getName();
		islands.addWaterFallName("andaman nicobar");
		islands.addWaterFallName("lakshdweep");
		islands.addWaterFallName("andaman");
		islands.addWaterFallName("nicobar");
		islands.addWaterFallName("lakshya");
		islands.displayWaterFallNames();
		

	}

}
