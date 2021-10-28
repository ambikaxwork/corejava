package com.xworkz.dp;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class Lawyerstarter {

	public static void main(String[] args) {
		LawyerDTO dto1 = new LawyerDTO("varsh", "BA LLB", 9.5f, "male", 23, "highcourt", 15);
		LawyerDTO dto2 = new LawyerDTO("Ambika", "BA LLBs", 8.5f, "female", 21, "supremecourt", 20);
		LawyerDTO dto3 = new LawyerDTO("Anusha", "BA LLB", 10.5f, "female", 22, "highcourt", 10);
		LawyerDAO dao1 = new LawyerDAO();
		dao1.save(dto1);
		dao1.save(dto2);
		dao1.delete(1);
		boolean ref = dao1.searchByName("Ambika");
		System.out.println(ref);
		boolean ref1 = dao1.searchByCaseWon(20);
		System.out.println(ref1);
		dao1.save(dto3, 3);
		String name=dao1.getExpByName("Anusha");
		System.out.println(name);
		String name1 = dao1.getQualificationByName("Ambika");
		System.out.println(name1);
		float temp = dao1.getlawyerwithMaxExp();
		System.out.println(temp);
		dao1.display();
		
	}
}
