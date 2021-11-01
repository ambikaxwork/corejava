package com.xworkz.inheritance.inherit;

public class FacebookApplicationDTO extends ApplicationDTO{
	private String ceoName;
	private String headquarter;
	
	public FacebookApplicationDTO() {
		System.out.println("invoked FacebookDTO no-arg constructor");
	}

	public FacebookApplicationDTO(String ceoName, String headquarter) {
		super("whatsApp","2.19.134","whatsAppInc","Jan Koum");
		this.ceoName = ceoName;
		this.headquarter = headquarter;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	
	

}
