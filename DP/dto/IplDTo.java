package com.xworkz.dp.dto;

public class IplDTo {
	private String teamName;
	private int teamSize;
	private String owner;
	private String sponsor;
	private int noOfCoaches;

	public IplDTo() {
		System.out.println("invoked no args constructor");
	}

	public IplDTo(String teamName, int teamSize, String owner, String sponsor, int noOfCoaches) {
		super();
		this.teamName = teamName;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
		this.noOfCoaches = noOfCoaches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getNoOfCoaches() {
		return noOfCoaches;
	}

	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}

}
