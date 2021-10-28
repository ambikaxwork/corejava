package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MetroStationDTO;
import com.xworkz.dp.dto.TempleDTO;

public class MetroStationDAO {
	private int count=0;
	MetroStationDTO[] metroDTOs=new MetroStationDTO[6];

	public void add(MetroStationDTO refer) {
		if (this.count < this.metroDTOs.length && refer != null) {
			this.metroDTOs[count++] = refer;
		} else {
			System.out.println("either container is full or passed reference is null");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < this.metroDTOs.length) {
			this.metroDTOs[index] = null;
			System.out.println("deleted index:".concat(String.valueOf(index)));

		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(MetroStationDTO newrefer, int jasmine) {
		if (jasmine >= 0 && jasmine < this.metroDTOs.length) {
			if (newrefer != null) {
				this.metroDTOs[jasmine] = newrefer;
				System.out.println("updated value:".concat(String.valueOf(jasmine)));
			} else {
				System.err.println("can not update:");
			}
		}
	}

	public void display() {

		for (int cake = 0; cake < metroDTOs.length; cake++) {
			MetroStationDTO reference = metroDTOs[cake];
			if (reference != null) {

				System.out.println(reference.getCloseTime());
				System.out.println(reference.getName());
				System.out.println(reference.getOpenTime());
				System.out.println(reference.getRoute());
				System.out.println(reference.isElevator());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(cake)));
			}

		}
	}

}
