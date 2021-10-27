package com.xworkz.dp;

import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.IplDTo;

public class IplStarter {

	public static void main(String[] args) {
		IplDTo dto1 = new IplDTo("RCB", 24, "ULS", "VIVO", 3);

		IplDAO dao1 = new IplDAO();
		dao1.save(dto1);
		dao1.save(dto1, 2);
		dao1.indexOccupied();
		boolean refer = dao1.matchByName("RCB");
		System.out.println(refer);

	}

}
