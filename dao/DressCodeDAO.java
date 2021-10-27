package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {
	private int count = 0;
	DressCodeDTO[] dressCodeDTOs = new DressCodeDTO[5];

	public void save(DressCodeDTO ref) {
		if (this.count < this.dressCodeDTOs.length && ref != null) {
			this.dressCodeDTOs[count++] = ref;
		} else {
			System.err.println("either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < this.dressCodeDTOs.length) {
			this.dressCodeDTOs[index] = null;
			System.out.println("index:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}

	}

	public void display() {
		for (int i = 0; i < dressCodeDTOs.length; i++) {
			DressCodeDTO refer = dressCodeDTOs[i];
			if (refer != null) {
				System.out.println(refer.getColor());
				System.out.println(refer.getGender());
				System.out.println(refer.getMaterial());
				System.out.println(refer.getPrice());
				System.out.println(refer.getSize());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));

			}
		}

	}

	public void update(int rose, DressCodeDTO newref) {
		if (rose >= 0 && rose < this.dressCodeDTOs.length)
			if (newref != null) {
				this.dressCodeDTOs[rose] = newref;
				System.out.println("updated value:".concat(String.valueOf(rose)));
			} else {
				System.err.println("can not update:");
			}
	}

}
