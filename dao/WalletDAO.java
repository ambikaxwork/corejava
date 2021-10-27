package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTo;
import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {
	private WalletDTO[] walletDTOs = new WalletDTO[5];
	private int count = 0;

	public void save(WalletDTO dto) {
		System.out.println("invoked walletDTO from save method:");
		if (dto != null && this.count > this.walletDTOs.length) {
			this.walletDTOs[count++] = dto;
			System.out.println("wallet company:".concat(dto.getCompanyName()));
		} else {
			System.err.println("either container is full or pointing to null");
		}
	}

	public void save(WalletDTO dto, int index) {
		System.out.println("invoked save :".concat(dto.getCompanyName()));
		if (index >= 0 && index < walletDTOs.length && dto != null) {
			this.walletDTOs[index] = dto;
			System.out.println("index at IplDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(String Name) {
		System.out.println("invoked matchByName:");
		System.out.println("team name passed: ".concat(Name));
		for (int i = 0; i < walletDTOs.length; i++) {
			WalletDTO ref = this.walletDTOs[i];
			if (ref != null) {
				System.out.println("ref index is not null:".concat(String.valueOf(i)));
				String tempName = ref.getCompanyName();
				System.out.println("matching:".concat(tempName));
				if (Name.equals(tempName)) {
					System.out.println("team not found");
					return true;
				}

			}
		}
		return false;

	}
}
