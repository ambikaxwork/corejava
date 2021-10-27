package com.xworkz.dp;

import com.xworkz.dp.dao.MetroStationDAO;
import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationStarter {

	public static void main(String[] args) {
		MetroStationDTO dto1 = new MetroStationDTO("jayanagar", "mejestic", true, 8.30f, 10.30f);

		MetroStationDAO dao1 = new MetroStationDAO();
		dao1.add(dto1);
		dao1.delete(2);
		dao1.update(dto1, 4);
		dao1.display();

	}

}
