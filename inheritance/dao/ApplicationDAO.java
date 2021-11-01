package com.xworkz.inheritance.dao;

import com.xworkz.inheritance.inherit.ApplicationDTO;
import com.xworkz.inheritance.inherit.FacebookApplicationDTO;
import com.xworkz.inheritance.inherit.InstagramDTO;

public class ApplicationDAO {
	ApplicationDTO[] appDTOs=new ApplicationDTO[10];
	FacebookApplicationDTO[] fbDTOs=new FacebookApplicationDTO[10];
	InstagramDTO[] instaDTOs=new InstagramDTO[10];
	private int count;
	
	public void save(ApplicationDTO dto) {
		if(count<appDTOs.length) {
			appDTOs[count++]=dto;
			System.out.println("saved element:".concat(String.valueOf(count)));
		}
		else {
				System.err.println("invalid".concat(String.valueOf(count)));
			}
		}
	public void display() {
		for (int i = 0; i < appDTOs.length; i++) {
			{
				ApplicationDTO ref=appDTOs[i];
				if(ref!=null) {
					System.out.println(ref.getCompany());
					System.out.println(ref.getFounder());
					System.out.println(ref.getName());
					System.out.println(ref.getVersion());
				}
				else {
					System.err.println("Array is full".concat(String.valueOf(appDTOs.length)));
				}
			}
			
		}
	}
	public boolean getAppDTOByName(String name) {
		System.out.println("name:".concat(name));
		if(name!=null) {
			for (int i = 0; i < appDTOs.length; i++) {
				ApplicationDTO ref=this.appDTOs[i];
				if(ref!=null) {
					String tempName=ref.getName();
					if(name.equals(tempName)) {
						System.out.println("name found");
						return true;
					}
				}
			}
		}
		return null;
	}

}
