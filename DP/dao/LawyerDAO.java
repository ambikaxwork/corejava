package com.xworkz.dp.dao;

import com.xworkz.dp.dto.LawyerDTO;

public class LawyerDAO {
	
	private LawyerDTO[] lawyerDTOs=new LawyerDTO[5];
	private int count=0;
	
	public void save(LawyerDTO ref) {
		System.out.println("invoked save method");
		if(this.count>=0 && this.count<this.lawyerDTOs.length && ref!=null) {
			this.lawyerDTOs[count++]=ref;
			System.out.println("save:" .concat(String.valueOf(count)));
		}
			else {
				System.out.println("either continer is full or pointing to null");
			}
			
		}
	public void delete(int index) {
		if(this.count>=0 && this.count<this.lawyerDTOs.length) {
			this.lawyerDTOs[index]=null;
			System.out.println("deleted index:".concat(String.valueOf(index)));
			//System.out.println(this.count++);
		}
		else {
			System.err.println("index invalid");
		}
		
		}
	public boolean searchByName(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				String tempName=ref.getName();
				System.out.println("name:" .concat(tempName));
				if(tempName.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}
	public boolean searchByCaseWon(int caseWon) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				int tempCaseWon=ref.getCaseWon();
				System.out.println("caseWon:" .concat(String.valueOf(tempCaseWon )));
				if(tempCaseWon==caseWon) {
				System.out.println("caseWon found");	
					return true;
				}
			}
			
		}
		return false;
		
	}
	public void save(LawyerDTO dto, int index) {
		if(index>=0 && index<lawyerDTOs.length && dto!=null) {
			this.lawyerDTOs[index]=dto;
			System.out.println("lawyerDTO at index:" .concat(String.valueOf(index)));
		}
		else {
			System.err.println("inavalid index");
		}
	}
	public String getQualificationByName(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				String tempName=ref.getName();
				if(tempName.equals(name)) {
					return ref.getQualifiaction();
				}
		}	
	}
		return "qualification not found";
		
	}
	
	public String getExpByName(String name) {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				String tempName=ref.getName();
				if(tempName.equals(name)) {
					System.out.println("experience:");
					return String.valueOf(ref.getExperience());
				}
			}
		}
		return "experience not found";
		
	}

	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}
	
	public float getlawyerwithMaxExp( ) {
		float tempMax = 0;
		if(lawyerDTOs[0]!=null) {
	    tempMax=lawyerDTOs[0].getExperience();
		for (int i = 1; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=lawyerDTOs[i];
			
			if(ref!=null) {
				
				float temp=ref.getExperience();
				if(temp>tempMax) {
					System.out.println("9999");
					tempMax=temp;
					
				}
				else {
					System.err.println("77777");
				}
				
		}
		
			}
		
		}
		return tempMax ;
		
	}
	public void display() {
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref=lawyerDTOs[i];
			if(ref!=null) {
				System.out.println(i);
				System.out.println(ref.getAge());
				System.out.println(ref.getCaseWon());
				System.out.println(ref.getCourtType());
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getName());
			}
			
		}
	}

}
		
	

