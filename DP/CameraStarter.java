package com.xworkz.dp;

import com.xworkz.dp.dao.CameraDAO;
import com.xworkz.dp.dto.CamraDTO;

public class CameraStarter {

	public static void main(String[] args) {
		CamraDTO cameraDTO1 = new CamraDTO("Nickon", "Dslr", 259, 59000f, 3000, 3.5f);
		CamraDTO cameraDTO2 = new CamraDTO("canon", "compact", 259, 59000f, 3000, 3.5f);
		CamraDTO cameraDTO3 = new CamraDTO("Nickons", "compact", 259, 59000f, 3000, 3.5f);
		CamraDTO cameraDTO4 = new CamraDTO("canon", "DSlr", 259, 59000f, 3000, 3.5f);

		CameraDAO cameraDAO = new CameraDAO();
		cameraDAO.delete(2);
		cameraDAO.save(cameraDTO4);
		cameraDAO.update(cameraDTO3, 4);
		cameraDAO.display();

	}

}
