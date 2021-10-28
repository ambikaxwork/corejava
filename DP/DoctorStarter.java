package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {
		DoctorDTO dto1 = new DoctorDTO("Bhoomika", "Dentist", "subbaiah", "female", 50000f, 25);

		DoctorDAO dao1 = new DoctorDAO();
		dao1.save(dto1);
		dao1.save(dto1, 5);
		dao1.indexOccupied();
		boolean ref = dao1.matchByName("Ambika");
		System.out.println(ref);
	}

}
