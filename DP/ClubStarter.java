package com.xworkz.dp;

import com.xworkz.dp.dao.ClubDAO;
import com.xworkz.dp.dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {
		ClubDTO dto1 = new ClubDTO(40, 60, 7.5f, 250f, 20);

		ClubDAO dao1 = new ClubDAO();
		dao1.add(dto1);
		dao1.update(dto1, 3);
		dao1.delete(2);
		dao1.display();

	}

}
