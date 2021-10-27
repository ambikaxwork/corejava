package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;
import com.xworkz.dp.dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("kgf", "prashanth neil", "yash", 9.3f, "hombalefilms");

		MovieDAO dao1 = new MovieDAO();
		dao1.save(dto1);
		dao1.save(dto1, 4);
		dao1.indexOccupied();
		boolean ref = dao1.matchByName("kottigobba");
		System.out.println(ref);
	}

}
