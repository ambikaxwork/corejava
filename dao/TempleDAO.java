package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TempleDTO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class TempleDAO {
	private int count = 0;
	TempleDTO[] templeDTOs = new TempleDTO[5];

	public void add(TempleDTO refer) {
		if (this.count < this.templeDTOs.length && refer != null) {
			this.templeDTOs[count++] = refer;
		} else {
			System.out.println("either container is full or passed reference is null");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < this.templeDTOs.length) {
			this.templeDTOs[index] = null;
			System.out.println("deleted index:".concat(String.valueOf(index)));

		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(TempleDTO newrefer, int jasmine) {
		if (jasmine >= 0 && jasmine < this.templeDTOs.length) {
			if (newrefer != null) {
				this.templeDTOs[jasmine] = newrefer;
				System.out.println("updated value:".concat(String.valueOf(jasmine)));
			} else {
				System.err.println("can not update:");
			}
		}
	}

	public void display() {

		for (int cake = 0; cake < templeDTOs.length; cake++) {
			TempleDTO reference = templeDTOs[cake];
			if (reference != null) {
				// System.out.println(reference);
				System.out.println(reference.getLocation());
				System.out.println(reference.getMainGod());
				System.out.println(reference.getName());
				System.out.println(reference.getYestGante());
				System.out.println(reference.isPrasada());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(cake)));
			}

		}
	}
}
