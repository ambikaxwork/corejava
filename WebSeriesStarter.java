package com.xworkz.dp;

import com.xworkz.dp.constants.Genre;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		WebSeriesDTO webSeriesDTO1 = new WebSeriesDTO();
		WebSeriesDTO webSeriesDTO2 = new WebSeriesDTO("GOT", "mily clarke", Genre.ADVENTURE, 1000, 9.8f, 8, 8);
		WebSeriesDTO webSeriesDTO3 = new WebSeriesDTO("GOT", "mily clarke", Genre.ADVENTURE, 1000, 9.8f, 8, 8);
		WebSeriesDAO webSeriesDAO = new WebSeriesDAO();
		webSeriesDAO.add(webSeriesDTO2);
		webSeriesDAO.update(4, webSeriesDTO2);
		webSeriesDAO.delete(3);
		webSeriesDAO.display();
		webSeriesDAO.update(3, webSeriesDTO3);
		webSeriesDAO.display();

	}
}
