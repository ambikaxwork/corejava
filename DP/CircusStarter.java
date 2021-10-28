package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {
		CircusDTO dto1 = new CircusDTO("Anusha", 20, 5, 50, 3.5f);

		CircusDAO dao1 = new CircusDAO();
		dao1.save(dto1);
		dao1.save(dto1, 3);
		dao1.indexOccupied();
		boolean ref = dao1.matchByName(30);
		System.out.println(ref);

	}

}
