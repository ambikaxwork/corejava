package com.xworkz.dp;

import com.xworkz.dp.dao.TempleDAO;
import com.xworkz.dp.dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO templeDTO1 = new TempleDTO();
		TempleDTO templeDTO2 = new TempleDTO("kote Anjaneya", "shimoga", "Anjaneya", true, 15);
		TempleDTO templeDTO3 = new TempleDTO("Ragi gudda", "banglore", "Anjaneya", true, 15);

		TempleDAO templeDAO = new TempleDAO();
		templeDAO.add(templeDTO3);
		templeDAO.delete(2);
		templeDAO.update(templeDTO2, 4);
		templeDAO.display();

	}

}
