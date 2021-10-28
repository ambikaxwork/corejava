package com.xworkz.dp;

import com.xworkz.dp.dto.Bracelete;

public class Starter {

	public static void main(String[] args) {
		Bracelete bracelete = new Bracelete();
		bracelete.setColor("gold");
		bracelete.setGemUsed(true);
		bracelete.setGifted(true);
		bracelete.setMaterial("plastic");
		bracelete.setPrice(40.0f);

		Bracelete bracelete2 = new Bracelete("pink", "iron", true, false, 100.0f);
		Bracelete bracelete3 = new Bracelete("blue", "silver", false, false, 20.0f);
		Bracelete bracelete4 = new Bracelete("blue", "plstic", false, true, 20.0f);
		Bracelete bracelete5 = new Bracelete("blue", "silver", false, false, 20.0f);

		// grouping
		Bracelete[] braceleteDTO = new Bracelete[5];
		braceleteDTO[0] = bracelete;
		braceleteDTO[2] = bracelete2;
		braceleteDTO[4] = bracelete5;
		for (int i = 0; i < braceleteDTO.length; i++) {
			Bracelete ref = braceleteDTO[i];
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getMaterial());
				System.out.println(ref.getPrice());
				System.out.println(ref.isGemUsed());
				System.out.println(ref.isGifted());
			} else {
				System.err.println("index is pointing to null".concat(String.valueOf(i)));
			}
		}

	}

}
