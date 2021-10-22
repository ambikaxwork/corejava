package com.xworkz.crud;

import com.xworkz.crud.operator.Cofee;

public class CofeeStarter {

	public static void main(String[] args) {
		Cofee cofee=new Cofee();
		cofee.getCofeeBybrandNames();
		cofee.addCofeeName("Bru instant");
		cofee.addCofeeName("Bru");
		cofee.addCofeeName("manjusha");
		cofee.addCofeeName("levista");
		cofee.addCofeeName("nescafe");
		cofee.displaybrandNames();
		cofee.update(3, "nescafe sunrises");
		cofee.delete(0);

	}

}
