package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {
		DressCodeDTO dresscodeDTO1 = new DressCodeDTO();
		DressCodeDTO dressCodeDTO2 = new DressCodeDTO(5.5f, "cotton", "grey", 300f, "female");
		DressCodeDTO dressCodeDTO3 = new DressCodeDTO(4.5f, "cotton", "blue", 250f, "female");

		DressCodeDAO dressCodeDAO = new DressCodeDAO();
		dressCodeDAO.save(dressCodeDTO3);
		dressCodeDAO.delete(-2);
		dressCodeDAO.update(3, dressCodeDTO2);
		dressCodeDAO.display();
	}

}
