package com.xworkz.dp;

import com.xworkz.dp.dao.MilkCanDAO;
import com.xworkz.dp.dto.MilkCanDTO;

public class MilkCanStarter {

	public static void main(String[] args) {

		MilkCanDTO dto1 = new MilkCanDTO(3.5f, "squar", true, "blue", 500f);

		MilkCanDAO dao1 = new MilkCanDAO();
		dao1.save(dto1);
		dao1.save(dto1, 2);
		dao1.indexOccupied();
		boolean ref = dao1.matchByName(400f);
		System.out.println(ref);
	}

}
