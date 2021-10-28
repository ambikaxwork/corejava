package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {

		WalletDTO dto1 = new WalletDTO("vegas", "plastic", 4, 150f, 1);

		WalletDAO dao1 = new WalletDAO();
		dao1.save(dto1);
		dao1.save(dto1, 2);
		dao1.indexOccupied();
		boolean ref = dao1.matchByName("paris");
		System.out.println(ref);
	}

}
