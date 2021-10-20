package com.xworkz.crud;

import com.xworkz.crud.operator.Resort;

public class ResortStarter {

	public static void main(String[] args) {
		Resort resort=new Resort();
		resort.getName();
		resort.addResortName("Anamika resort");
		resort.addResortName("srinika resort");
		resort.addResortName("ananya resort");
		resort.addResortName("sri resort");
		resort.addResortName("moonlight resort");
		resort.displayChoclateNames();
		resort.addResortName("day resort");

	}

}
