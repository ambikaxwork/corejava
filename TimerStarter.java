package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;
import com.xworkz.dp.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {
		TimerDTO dto1 = new TimerDTO(false, 4.7f, true, "redmi", false);

		TimerDAO dao1 = new TimerDAO();
		// dao1.save(dto1);
		dao1.save(dto1, 4);
		dao1.indexOccupied();
		dao1.save(dto1);
		boolean ref = dao1.matchByName(false);
		System.out.println(ref);
	}

}
