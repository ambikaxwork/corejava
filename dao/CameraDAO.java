package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CamraDTO;

public class CameraDAO {

	private int count = 0;
	CamraDTO[] cameraDTOs = new CamraDTO[5];

	public void save(CamraDTO ref) {
		if (this.count < this.cameraDTOs.length && ref != null) {
			this.cameraDTOs[count++] = ref;
		} else {
			System.out.println("either container is full or passed reference is null");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < this.cameraDTOs.length) {
			this.cameraDTOs[index] = null;
			System.out.println("deleted index:".concat(String.valueOf(index)));

		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(CamraDTO newref, int jasmine) {
		if (jasmine >= 0 && jasmine < this.cameraDTOs.length) {
			if (newref != null) {
				this.cameraDTOs[jasmine] = newref;
				System.out.println("updated value:".concat(String.valueOf(jasmine)));
			} else {
				System.err.println("can not update:");
			}
		}
	}

	public void display() {

		for (int cake = 0; cake < cameraDTOs.length; cake++) {
			CamraDTO reference = cameraDTOs[cake];
			if (reference != null) {
				// System.out.println(reference);
				System.out.println(reference.getBatteryCapacity());
				System.out.println(reference.getCompany());
				System.out.println(reference.getCost());
				System.out.println(reference.getPixel());
				System.out.println(reference.getType());
				System.out.println(reference.getWeight());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(cake)));
			}

		}
	}

}
