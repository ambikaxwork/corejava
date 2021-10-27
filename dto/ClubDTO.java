package com.xworkz.dp.dto;

public class ClubDTO {
	private int noOfPeople;
	private int noOfBottle;
	private float rating;
	private float entryPrice;
	private int noOfStaffs;

	public ClubDTO() {
		System.out.println("invoked no-args constuctor");
	}

	public ClubDTO(int noOfPeople, int noOfBottle, float rating, float entryPrice, int noOfStaffs) {
		super();
		this.noOfPeople = noOfPeople;
		this.noOfBottle = noOfBottle;
		this.rating = rating;
		this.entryPrice = entryPrice;
		this.noOfStaffs = noOfStaffs;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getNoOfBottle() {
		return noOfBottle;
	}

	public void setNoOfBottle(int noOfBottle) {
		this.noOfBottle = noOfBottle;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(float entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

}
