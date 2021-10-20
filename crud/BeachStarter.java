package com.xworkz.crud;

import com.xworkz.crud.operator.BeachOperator;

public class BeachStarter {

	public static void main(String[] args) {
		BeachOperator beachOperator=new BeachOperator();
		beachOperator.getCity();
		beachOperator.addBeachName("om beach");
		beachOperator.addBeachName("kudla beach");
		beachOperator.addBeachName("malpe beach"); 
		beachOperator.addBeachName("panambur beach");
		beachOperator.addBeachName("baga beach");
		beachOperator.displayBeachNames();
		beachOperator.addBeachName("RK beach");
		beachOperator.displayBeachNames();
		

	}

}
