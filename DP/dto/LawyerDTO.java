package com.xworkz.dp.dto;

public class LawyerDTO {
	private String name;
	private String qualifiaction;
	private float experience;
	private String gender;
	private int age;
	private String courtType;
	private int caseWon;
	
	public LawyerDTO() {
		// TODO Auto-generated constructor stub
	}

	public LawyerDTO(String name, String qualifiaction, float experience, String gender, int age, String courtType,
			int caseWon) {
		super();
		this.name = name;
		this.qualifiaction = qualifiaction;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courtType;
		this.caseWon = caseWon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualifiaction() {
		return qualifiaction;
	}

	public void setQualifiaction(String qualifiaction) {
		this.qualifiaction = qualifiaction;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public int getCaseWon() {
		return caseWon;
	}

	public void setCaseWon(int caseWon) {
		this.caseWon = caseWon;
	}
	

}
