package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.TimerDTO;

public class DoctorDAO {
	private DoctorDTO[] doctorDTOs = new DoctorDTO[6];
	private int count = 0;

	public void save(DoctorDTO dto) {
		System.out.println("invoked DoctorDTO from save method:");
		if (dto != null && this.count > this.doctorDTOs.length) {
			this.doctorDTOs[count++] = dto;
			System.out.println("DoctorDTO: ".concat(String.valueOf(dto.getName())));
		} else {
			System.err.println("either container is full or pointing to null");
		}
	}

	public void save(DoctorDTO dto, int index) {
		System.out.println("invoked save :".concat(String.valueOf(dto.getName())));
		if (index >= 0 && index < doctorDTOs.length && dto != null) {
			this.doctorDTOs[index] = dto;
			System.out.println("index at DoctorDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return this.count;

	}

	public boolean matchByName(String name) {
		System.out.println("invoked matchByName:");
		System.out.println("value passed: ".concat(String.valueOf(name)));
		for (int i = 0; i < doctorDTOs.length; i++) {
			DoctorDTO ref = this.doctorDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null:".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println("matching ".concat(String.valueOf(tempName)));
				if (String.valueOf(name).equals(String.valueOf(tempName))) {
					System.out.println("value found");
					return true;
				}
			}
		}
		System.out.println("value not found");
		return false;

	}

}
