package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;
import com.xworkz.dp.dto.CraneDTO.*;

public class ParkStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		ParkDTO park = crane.new ParkDTO();
		park.setClosingTime(5.30f);
		park.setNoOfTreesInPark(20);
		park.setOpenTime(11.0f);
		park.setParkInAcres(4.5f);
		park.setParkLocation("rajajinagar");
		park.setParkName("nandanavana");

		ParkDTO park1 = crane.new ParkDTO("nandanavana", "BTM", 2.5f, 40, false, 6.0f, 10.0f);
		ParkDTO park2 = crane.new ParkDTO("kabbanpark", "lalbhag", 10.5f, 40, false, 5.0f, 10.0f);
		ParkDTO park3 = crane.new ParkDTO("kiruvana", "BTM", 2.5f, 40, true, 6.0f, 10.0f);
		ParkDTO park4 = crane.new ParkDTO("nandanavana", "BTM", 3.5f, 40, false, 6.0f, 10.0f);
		ParkDTO park5 = crane.new ParkDTO("nandanavana", "BTM", 2.5f, 40, false, 6.0f, 10.0f);

		// grouping
		ParkDTO[] perk = new ParkDTO[5];
		perk[0] = park1;
		perk[3] = park2;
		perk[1] = park3;
		perk[2] = park4;
		for (int i = 0; i < perk.length; i++) {
			ParkDTO prank = perk[i];
			if (prank != null) {
				System.out.println(prank.getClosingTime());
				System.out.println(prank.getNoOfTreesInPark());
				System.out.println(prank.getOpenTime());
				System.out.println(prank.getParkInAcres());
				System.out.println(prank.getParkLocation());
				System.out.println(prank.getParkName());
				System.out.println(prank.isRunningAllowance());
			} else {
				System.err.println("index is pointing to null:".concat(String.valueOf(i)));
			}
		}

	}

}
