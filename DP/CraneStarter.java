package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {
		CraneDTO craneDTO = new CraneDTO();
		craneDTO.setColor("white");
		craneDTO.setHeight(2.5f);
		craneDTO.setName("Ambika");
		craneDTO.setNeckType("long");
		craneDTO.setScientificName("gruidae");
		craneDTO.setSize(24f);
		craneDTO.setWeight(5f);

		CraneDTO craneDTO1 = new CraneDTO("pooja", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO2 = new CraneDTO("anusha", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO3 = new CraneDTO("sush", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO4 = new CraneDTO("omkar", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO5 = new CraneDTO("hanuma", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO6 = new CraneDTO("pramith", "black", 6, 5.5f, 3, "short", "gruidae");
		CraneDTO craneDTO7 = new CraneDTO("sahanasharath", "black", 6, 5.5f, 3, "short", "gruidae");

		CraneDTO[] crane = new CraneDTO[5];
		crane[0] = craneDTO;
		crane[1] = craneDTO1;
		crane[2] = craneDTO2;
		crane[3] = craneDTO3;
		crane[4] = craneDTO4;
		// crane[5]=craneDTO5; java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i < crane.length; i++) {
			CraneDTO ref = crane[i];
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getHeight());
				System.out.println(ref.getName());
				System.out.println(ref.getNeckType());
				System.out.println(ref.getScientificName());
				System.out.println(ref.getSize());
				System.out.println(ref.getWeight());
			} else {
				System.err.println("index is pointing to null:".concat(String.valueOf(i)));
			}
		}

	}

}
