package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ClubDTO;
import com.xworkz.dp.dto.MetroStationDTO;

public class ClubDAO {
	private ClubDTO[] clubDTOs = new ClubDTO[10];
	private int count = 0;

	public void add(ClubDTO refer) {
		if (this.count < this.clubDTOs.length && refer != null) {
			this.clubDTOs[count++] = refer;
		} else {
			System.out.println("either container is full or passed reference is null");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < this.clubDTOs.length) {
			this.clubDTOs[index] = null;
			System.out.println("deleted index:".concat(String.valueOf(index)));

		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(ClubDTO newrefer, int jasmine) {
		if (jasmine >= 0 && jasmine < this.clubDTOs.length) {
			if (newrefer != null) {
				this.clubDTOs[jasmine] = newrefer;
				System.out.println("updated value:".concat(String.valueOf(jasmine)));
			} else {
				System.err.println("can not update:");
			}
		}
	}

	public void display() {

		for (int cake = 0; cake < clubDTOs.length; cake++) {
			ClubDTO reference = clubDTOs[cake];
			if (reference != null) {

				System.out.println(reference.getEntryPrice());
				System.out.println(reference.getNoOfBottle());
				System.out.println(reference.getNoOfPeople());
				System.out.println(reference.getNoOfStaffs());
				System.out.println(reference.getRating());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(cake)));
			}

		}
	}

}
