package com.xworkz.dp.dao;

import com.xworkz.dp.dto.BucketDTO;


public class BucketDAO {

	private int count = 0;
	BucketDTO[] bucketDTOs = new BucketDTO[5];

	public void save(BucketDTO ref) {
		if (this.count < this.bucketDTOs.length && ref != null) {
			this.bucketDTOs[count++] = ref;
		} else {
			System.out.println("either container is full or passed reference is null");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < this.bucketDTOs.length) {
			this.bucketDTOs[index] = null;
			System.out.println("deleted index:".concat(String.valueOf(index)));

		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(BucketDTO newref, int jasmine) {
		if (jasmine >= 0 && jasmine < this.bucketDTOs.length) {
			if (newref != null) {
				this.bucketDTOs[jasmine] = newref;
				System.out.println("updated value:".concat(String.valueOf(jasmine)));
			} else {
				System.err.println("can not update:");
			}
		}
	}

	public void display() {

		for (int cake = 0; cake < bucketDTOs.length; cake++) {
			BucketDTO reference = bucketDTOs[cake];
			if (reference != null) {
				// System.out.println(reference);
				System.out.println(reference.getColor());
				System.out.println(reference.getCompany());
				System.out.println(reference.getPrice());
				System.out.println(reference.getQuantity());
				System.out.println(reference.getSize());
				System.out.println(reference.getWeight());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(cake)));
			}

		}
	}

}
