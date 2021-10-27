package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;
import com.xworkz.dp.dto.MilkCanDTO;

public class MilkCanDAO {
	MilkCanDTO[] milkCanDTOs = new MilkCanDTO[5];
	private int count = 0;

	public void save(MilkCanDTO dto) {
		System.out.println("invoked circusDTO from save method:");
		if (dto != null && this.count > this.milkCanDTOs.length) {
			this.milkCanDTOs[count++] = dto;
			System.out.println("MilkCanDTO: ".concat(String.valueOf(dto.getPrice())));
		} else {
			System.err.println("either container is full or pointing to null");
		}
	}

	public void save(MilkCanDTO dto, int index) {
		System.out.println("invoked save :".concat(String.valueOf(dto.getPrice())));
		if (index >= 0 && index < milkCanDTOs.length && dto != null) {
			this.milkCanDTOs[index] = dto;
			System.out.println("index at milkCanDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(float Price) {
		System.out.println("invoked matchByName:");
		System.out.println("price passed: ".concat(String.valueOf(ticketPrice)));
		for (int i = 0; i < milkCanDTOs.length; i++) {
			MilkCanDTO ref = this.milkCanDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null:".concat(String.valueOf(i)));
				float tempPrice = ref.getPrice();
				System.out.println("matching ".concat(String.valueOf(tempPrice)));
				if (String.valueOf(Price).equals(String.valueOf(tempPrice))) {
					System.out.println("price found");
					return true;
				}
			}
		}
		System.out.println("price not found");
		return false;

	}

}
