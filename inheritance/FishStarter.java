package com.xworkz.inheritance;

import com.xworkz.inheritance.inherit.Fish;
import com.xworkz.inheritance.inherit.GoldFish;
import com.xworkz.inheritance.inherit.SharkFish;

public class FishStarter {

	public static void main(String[] args) {
		SharkFish shark1=new SharkFish();
	    System.out.println(shark1.getHeight());
	    System.out.println(shark1.getWeight());
		GoldFish  gold1=new GoldFish();
		System.out.println(gold1.getRegion());
		System.out.println(gold1.isAlive());
		System.out.println(gold1.getColor());
		System.out.println(gold1.getSize());
		Fish fish=new Fish();
		Fish fish1 =new SharkFish();
		System.out.println(fish1.getRegion());
		System.out.println(fish1.isAlive());
		Fish fish2=new GoldFish();
		System.out.println(fish2.getRegion());
	
		

	}

}
