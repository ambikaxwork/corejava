package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTo;

public class IplDAO {

	private IplDTo[] iplDTOs = new IplDTo[100];
	private int count = 0;

	public void save(IplDTo dto) {
		System.out.println("invoked IplDTO from save method");
		if (dto != null && count < iplDTOs.length) {
			this.iplDTOs[count++] = dto;
			System.out.println("iplTeam is:".concat(dto.getTeamName()));
		} else {
			System.err.println("either container is full or you are passing value is null");
		}
	}

	public void save(IplDTo dto, int index) {
		System.out.println("invoked save :".concat(dto.getTeamName()));
		if (index >= 0 && index < iplDTOs.length && dto != null) {
			this.iplDTOs[index] = dto;
			System.out.println("index at IplDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(String teamName) {
		System.out.println("invoked matchByName:");
		System.out.println("team name passed: ".concat(teamName));
		for (int i = 0; i < iplDTOs.length; i++) {
			IplDTo ref = this.iplDTOs[i];
			if (ref != null) {
				System.out.println("ref index is not null:".concat(String.valueOf(i)));
				String tempName = ref.getTeamName();
				System.out.println("matching:".concat(tempName));
				if (teamName.equals(tempName)) {
					System.out.println("team not found");
					return true;
				}

			}
		}
		return false;

	}

}
