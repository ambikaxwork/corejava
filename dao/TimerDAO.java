package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkCanDTO;
import com.xworkz.dp.dto.TimerDTO;

public class TimerDAO {
	private TimerDTO[] timerDTOs = new TimerDTO[500];
	private int count = 0;

	public void save(TimerDTO dto) {
		System.out.println("invoked TimerDTO from save method:");
		if (dto != null && count > timerDTOs.length) {
			this.timerDTOs[count++] = dto;
			System.out.println("TimerDTO: ".concat(String.valueOf(dto.isBell())));
		} else {
			System.err.println("either container is full or pointing to null");
		}
	}

	public void save(TimerDTO dto, int index) {
		System.out.println("invoked save :".concat(String.valueOf(dto.isBell())));
		if (index >= 0 && index < timerDTOs.length && dto != null) {
			this.timerDTOs[index] = dto;
			System.out.println("index at TimerDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(boolean bell) {
		System.out.println("invoked matchByName:");
		System.out.println("value passed: ".concat(String.valueOf(bell)));
		for (int i = 0; i < timerDTOs.length; i++) {
			TimerDTO ref = this.timerDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null:".concat(String.valueOf(i)));
				boolean tempBell = ref.isBell();
				System.out.println("matching ".concat(String.valueOf(tempBell)));
				if (String.valueOf(bell).equals(String.valueOf(tempBell))) {
					System.out.println("value found");
					return true;
				}
			}
		}
		System.out.println("value not found");
		return false;

	}

}
