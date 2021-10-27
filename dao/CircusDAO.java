package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;
import com.xworkz.dp.dto.WalletDTO;

public class CircusDAO {
	private CircusDTO[] circusDTOs = new CircusDTO[5];
	private int count = 0;

	public void save(CircusDTO dto) {
		System.out.println("invoked circusDTO from save method:");
		if (dto != null && this.count > this.circusDTOs.length) {
			this.circusDTOs[count++] = dto;
			System.out.println("circus company:".concat(String.valueOf(dto.getTicketPrice())));
		} else {
			System.err.println("either container is full or pointing to null");
		}
	}

	public void save(CircusDTO dto, int index) {
		System.out.println("invoked save :".concat(String.valueOf(dto.getTicketPrice())));
		if (index >= 0 && index < circusDTOs.length && dto != null) {
			this.circusDTOs[index] = dto;
			System.out.println("index at CircusDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(int ticketPrice) {
		System.out.println("invoked matchByName:");
		System.out.println("ticket price passed: ".concat(String.valueOf(ticketPrice)));
		for (int i = 0; i < circusDTOs.length; i++) {
			CircusDTO ref = this.circusDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null:".concat(String.valueOf(i)));
				int tempTicketPrice = ref.getTicketPrice();
				System.out.println("matching ".concat(String.valueOf(tempTicketPrice)));
				if (String.valueOf(ticketPrice).equals(String.valueOf(tempTicketPrice))) {
					System.out.println("ticketprice found");
					return true;
				}
			}
		}
		return false;

	}

}
